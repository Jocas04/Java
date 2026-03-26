/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeat;

import java.util.Scanner;

/**
 *
 * @author jatta
 */
public class Repeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int cc = 0;
        do {System.out.println("Cambalhota " + cc);
        cc++;
        } while (cc<4);*/
       /*double salario=678;
       int diast= 18;
       int horasm= 160;
       int horasd= 8;
       double liquido;
       double inss;
       int adiantamento= 120;
       double fgts;
       inss= (salario*0.11);
       fgts= (salario*0.08);
       liquido= ((salario-inss)/horasm)*(diast*horasd)- adiantamento;
        System.out.println("Salario mensal bruto: " + salario);
        System.out.println("dias trabalhados: " + diast);
        System.out.println("horas mensais: " + horasm);
        System.out.println("horas diarias: " + horasd);
        System.out.println("salario liquido: " + liquido);
        System.out.println("o valor do inss: " + inss);
        System.out.println("valor do adiantamento: " + adiantamento);
        System.out.println("valor do fgts: " + fgts);   */
       int n1;   int n2;
       Scanner teclado= new Scanner(System.in);
         System.out.println("insira um numero: " );
         n1= teclado.nextInt(); 
         System.out.println("insira outro numero: ");
         n2= teclado.nextInt();
         if (n1>n2) { System.out.println("o primeiro numero é maior: " + true);
         
         } else { System.out.println("o primeiro numero é maior: " + false);}
         
         if (n2>n1) {System.out.println("o segundo numero é maior: " + true);
         
         } else { System.out.println("o segundo numero é maior: " + false);
         
         }
         if (n1%n2==0) {
              System.out.println("o primeiro numero é divisivel pelo segundo: " + true);
         } else {  System.out.println("o primeiro numero é divisivel pelo segundo: " + false);
         
          } if (n2%n1==0) {
           System.out.println("o segundo numero é divisivel pelo priemiro: " + true);   
          } else { System.out.println("o segundo numero é divisivel pelo priemiro: " + false);
               
       
    }        
    
}
}
