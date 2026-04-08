/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemadejosephus;

import java.util.Scanner;



/**
 *
 * @author jatta
 */
public class ProblemadeJosephus {
    
    public static int calculo(int N, int K ){
        int sobrevivente= 0;
        if (N >= 1 && K>= 1){
            System.out.println("valido, só numeros naturais");
            
        } else{
            System.out.println("ERRO" ); 
            System.out.println("N ou K invalido");
            System.exit(1);
        }
        for(int i = 2; i <= N; i++){
            sobrevivente= (sobrevivente + K) % i;
        }
        return sobrevivente + 1;
    }

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Digite a quantidade maxima de numeros");
        int N= sc.nextInt();
        System.out.println("digite a quantidade de casas por morte");
        int K= sc.nextInt();
        
       System.out.println("o numero da casa sobrevivewnte será: " + calculo(N,K));
          
            
        
    }
}
