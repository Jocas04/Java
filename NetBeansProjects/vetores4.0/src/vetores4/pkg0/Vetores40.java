/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores4.pkg0;

import java.util.Arrays;

/**
 *
 * @author jatta
 */
public class Vetores40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[]= {3,5,8,3,6,8,1};
        for(int v:vet) {
            System.out.print(v);
        }
        System.out.println("");
        int p= Arrays.binarySearch(vet,5);
        System.out.println("encontri o valor na posicao " + p);
    }
    
    
}
