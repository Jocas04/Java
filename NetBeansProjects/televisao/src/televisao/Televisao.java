/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package televisao;

import java.util.Scanner;

/**
 *
 * @author jatta
 */
public class Televisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String marca= "LG";
        int volume=5;
        System.out.println("marca "+marca);
        System.out.println("volume "+volume);
      
        Scanner sc=new Scanner (System.in);
       System.out.println("se quiser escreva outra marca de tv ");
       String marcar=sc.next();
        System.out.println(marcar);
        do {
    System.out.println("quer aumentar ou abaixar o volume? 1 pra N/ 2 pra S");
    int decisao=sc.nextInt();
    if (decisao>1) {
        volume++;
    } else  {
        volume--;
    }
        System.out.println(volume);
       }
         while (volume<10&&volume>0);
    }    
    
    
    
}
