/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author jatta
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner retanorto= new Scanner(System.in);
        System.out.println("Primeira nota: ");
        float n1= retanorto.nextFloat();
        System.out.println("Segunda nota: ");
        float n2= retanorto.nextFloat();
        float n = (n1+n2)/2;
        System.out.println("Sua média foi " + n );
        if (n>=7){
            System.out.println("Parabens, lindao!");
            
        }
    }
    
}
