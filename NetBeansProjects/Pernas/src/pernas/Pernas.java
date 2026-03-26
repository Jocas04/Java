/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pernas;

import java.util.Scanner;

/**
 *
 * @author jatta
 */
public class Pernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec= new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int perna= tec.nextInt();
        System.out.println("Isso é um(a)" );
        String tipo;
        switch (perna) {
            case 1: 
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Trípede";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
            
        }               
         System.out.println(tipo);
    }
       
}
