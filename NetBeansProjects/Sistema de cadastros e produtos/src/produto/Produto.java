
package produto;


public class Produto {
    private int id;
    private int quantidade;
    private double preco;
    private String categoria;
    private String nome;
    
    public Produto( int id, int quantidade, double preco, String categoria, String nome){
    this.id = id;
    this.nome = nome;
    this.quantidade = quantidade;
    this.categoria = categoria;
    this.preco = preco;
}

    public Produto(int id,
               String nome,
               double preco,
               String categoria,
               int quantidade) {
    this.id = id;
    this.nome = nome;
    this.preco = preco;
    this.categoria = categoria;
    this.quantidade = quantidade;
    }

    public Produto(int i, String nome, double preco, int quantidade, String categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int getId() {
        return id;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getNome() {
        return nome;
    }
    public String toString() {
        return nome + " | R$ " + preco + " | " + categoria +
                " | Qtd: " + quantidade;
    }
}
