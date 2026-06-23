/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contato;

/**
 *
 * @author jatta
 */
public class Contato {
    private String nome;
    private String telefone;
    
    public Contato(String nome, String telefone) {
            this.nome = nome;
            this.telefone = telefone;
    }
    public String toString() {
    return nome + " - " + telefone;
    }

    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTelefone() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
    
