/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author jatta
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o nome do aluno(a)");
        String nome= sc.nextLine();
        System.out.println("Digite a nota do aluno(a) ");
        float nota= sc.nextFloat();
        System.out.println(nome + " " + nota);
    }
    
}
