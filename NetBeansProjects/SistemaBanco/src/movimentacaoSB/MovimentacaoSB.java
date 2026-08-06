package movimentacaoSB;

import java.sql.Connection;
import conexao.Conexao;
import movimentacao.Movimentacao;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
public class MovimentacaoSB {
    public MovimentacaoSB() {
        criarTabela();
    }
    public void criarTabela() {
        String sql = """                
        CREATE TABLE IF NOT EXISTS movimentacoes(         
        id INTEGER PRIMARY KEY AUTOINCREMENT,                
        conta_id INTEGER,                
        tipo TEXT,      
        valor REAL,             
        data TEXT)        
        """;
        
        try(Connection conec = Conexao.conectar();
            Statement st = conec.createStatement()
                ) {
            st.execute(sql);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void registrar(int contaId,String tipo, double valor) {
        String sql =    
                """      
        INSERT INTO movimentacoes    
        (conta_id,tipo,valor,data)
        VALUES(?,?,?,?)   
        """;
        
        try(Connection conec = Conexao.conectar();
                PreparedStatement ps = conec.prepareStatement(sql)
                ) {
            ps.setInt(1, contaId);
            ps.setString(2, tipo);
            ps.setDouble(3, valor);
            ps.setString(4, LocalDate.now().toString());
            ps.executeUpdate();
        }catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    public ArrayList<Movimentacao> listar(int contaId) {
        ArrayList<Movimentacao> lista = new ArrayList<>();
        
        String sql = """
        SELECT *
        FROM movimentacoes      
        WHERE conta_id = ?                
        """;
        try(Connection conec = Conexao.conectar();
            PreparedStatement ps = conec.prepareStatement(sql)) {
            ps.setInt(1, contaId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                lista.add(new Movimentacao(
                rs.getString("tipo"),
                rs.getDouble("valor"),
                rs.getString("data")));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return lista;
    } 
    
}
