package contaSB;

import conexao.Conexao;
import java.sql.Statement;
import conta.Conta;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;

public class ContaSB {
    public ContaSB() {
        criarTabela();
    }

    public void criarTabela() {
    String sql = """
    CREATE TABLE IF NOT EXISTS contas(
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    titular TEXT,
    saldo REAL)
    """;
    try(
            Connection conec = Conexao.conectar();
            Statement st= conec.createStatement()){
        st.execute(sql);
    } catch(Exception e) {
        e.printStackTrace();
    }
    }
    public void criarConta(String titular) {
        String sql =  "INSERT INTO contas(titular,saldo) VALUES(?,?)";
        try(
                Connection conec = Conexao.conectar();
                PreparedStatement ps = conec.prepareStatement(sql)) {
            ps.setString(1,titular);
            ps.setDouble(2, 0);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void depositar(int id, double valor) {
        String sql = "UPDATE contas SET saldo = saldo + ? WHERE id = ?";
        try(
                Connection conec = Conexao.conectar();
            PreparedStatement ps = conec.prepareStatement(sql)) {
           
            ps.setDouble(1, valor);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void sacar(int id, double valor) {
        String sql = "UPDATE contas SET saldo = saldo - ? WHERE id = ?";
        try(
                Connection conec = Conexao.conectar();
            PreparedStatement ps = conec.prepareStatement(sql)) {
          
            ps.setDouble(1, valor);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Conta> listar() {
        ArrayList<Conta> lista = new ArrayList<>();
        String sql = "SELECT * FROM contas";
        try( 
                Connection conec = Conexao.conectar();
             Statement st = conec.createStatement();
             ResultSet rs = st.executeQuery(sql)){
            while(rs.next()) {
                lista.add(new Conta(rs.getInt("id"),
                        rs.getString("titular"),
                rs.getDouble("saldo"))); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    public void remover(int id) {
         String sql ="DELETE FROM contas WHERE id=?";
         try (
                 Connection conec = Conexao.conectar();
                 PreparedStatement ps = conec.prepareStatement(sql)){
             ps.setInt(1, id);
             ps.executeUpdate();
         }catch (Exception e) {
             e.printStackTrace();
         }
    }
}
