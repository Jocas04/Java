
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner algumacoisa= new Scanner(System.in);
        String nome= algumacoisa.nextLine();
        
        float nota= algumacoisa.nextFloat();
        System.out.print("sua nota é: " + nota);
        System.out.println("sua nota é: " + nota);
        System.out.format("A nota de %s é: %.2f \n",nome , nota);
                
    }
}
