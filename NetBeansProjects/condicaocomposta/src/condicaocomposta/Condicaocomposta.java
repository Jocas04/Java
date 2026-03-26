/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicaocomposta;
import java.util.Scanner;
/**
 *
 * @author jatta
 */
public class Condicaocomposta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclatorto= new Scanner(System.in);
        System.out.println("Em que ano nasceu?");
        int nasc= teclatorto.nextInt();
        int i= 2025 - nasc;
        System.out.println("Sua idade é " + i);
        if(i>=18){
            System.out.println("Maior");
        } else{
            System.out.println("Menor");
        }
    }
    
}
