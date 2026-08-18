/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produto;

/**
 *
 * @author jatta
 */
public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double preco;
    private String categoria;
    public Produto(int id, String nome, double preco, int quantidade, String categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }
    public int getId(){
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public String getCategoria() {
        return categoria;
    }
    @Override
    public String toString() {
        String alerta = "";
        if(quantidade < 5) {
            alerta = "ESTOQUER BAIXO ";
        }
        return nome+ " | R$ "
                    + preco
                    + " | Qtd: "
                    + quantidade
                    + alerta;
    }
}
    
