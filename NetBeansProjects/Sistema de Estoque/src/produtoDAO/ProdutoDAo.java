/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtoDAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.Statement;
import produto.Produto;

/**
 *
 * @author jatta
 */
public class ProdutoDAo {
    public ProdutoDAo() {
    criarTabela();
}
    public void criarTabela() {
    String sql = """
    CREATE TABLE IF NOT EXISTS produtos(
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT,
    preco REAL,
    quantidade INTEGER,
    categoria TEXT)
                 """;
    try (Connection conec = Conexao.conectar();
            Statement st= conec.createStatement()){
        st.execute(sql);
    } catch(Exception e) {
        e.printStackTrace();
    }
}
    public void adicionar(Produto p) {
    String sql = """
                INSERT INTO produtos
                (nome, preco, quantidade, categoria)
                VALUES (?, ?, ?, ?)
                """;
    try( Connection conec = Conexao.conectar();
            PreparedStatement ps = conec.prepareStatement(sql))
    {
        ps.setString(1, p.getNome());
        ps.setDouble(2, p.getPreco());
        ps.setInt(3, p.getQuantidade());
        ps.setString(4,  p.getCategoria());
        ps.executeUpdate();
    } catch(Exception e) {
        e.printStackTrace();
    }
}
    public void remover(int id) {
        String sql =
        "DELETE FROM produtos WHERE id = ?";
        
    }
    
            

