package produtoSCP;

import produto.Produto;
import conexao.conexao;
import java.sql.*;
import java.util.ArrayList;


public class produtoSCP {
    public produtoSCP() {
    criarTabela();
}
    private void criarTabela() {
       String sql = """
                    CREATE TABLE IF NOT EXISTS produtos(
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    nome TEXT, preco REAL, categoria TEXT, quantidade INTEGER
                    )
                    """;
       try (
            Connection conec = conexao.conectar();
            Statement st = conec.createStatement()){
          st.execute(sql); 
       } catch(Exception e) {
           e.printStackTrace();
       }
    }
    public void adicionar(Produto p) {
        String sql = """              
                     INSERT INTO produtos               
                     (nome, preco, categoria, quantidade)      
                     VALUES(?,?,?,?)          
                     """;      
        try (
                Connection conec = conexao.conectar();
                PreparedStatement ps = conec.prepareStatement(sql)){
            ps.setString(1, p.getNome());
            ps.setDouble(2, p.getPreco());
            ps.setString(3, p.getCategoria());
            ps.setInt(4, p.getQuantidade());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void remover(int id) {
        String sql= "DELETE FROM produtos WHERE ID = ?";
        try (Connection conec = conexao.conectar();
                PreparedStatement ps = conec.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Produto> listar() {
        ArrayList<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM  produtos";
        try(Connection conec = conexao.conectar();
                Statement st = conec.createStatement();
                ResultSet rs = st.executeQuery(sql))
        {
            while (rs.next()) {
                lista.add(new Produto(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getDouble("preco"),
                rs.getString("categoria"),
                rs.getInt("quantidade")) );
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    public ArrayList<Produto> pesquisar(String busca) {
        ArrayList<Produto> lista = new ArrayList<>();
        String sql = "SELECT* FROM produtos WHERE nome LIKE ?";
        try( Connection conec = conexao.conectar();
                PreparedStatement ps = conec.prepareStatement(sql)) {
            ps.setString(1, "%" + busca + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                lista.add(new Produto(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getDouble("preco"),
                rs.getString("categoria"),
                rs.getInt("quantidade")
                )
              );
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
