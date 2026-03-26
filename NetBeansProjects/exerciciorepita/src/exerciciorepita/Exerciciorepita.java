/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;


import javax.swing.JOptionPane;

/**
 *
 * @author jatta
 */
public class Exerciciorepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s= 0, conta= -1, par= -1, impar= 0, maisdecem= 0, media= 0;
                
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "informe um numero: (o valor 0 interrompe) ")); 
        s += n;
        conta++;
        if  (n%2==0 ){
                par++;}
        else {
            impar++;
        } if (n>=100){
            maisdecem++;
        }
                
         } while (n !=0);
        media= s/conta;
        JOptionPane.showMessageDialog(null, "<html> Resultado final<br><hr>" + "somatorio vale " + s +
        "<br> total de valores " + conta + "<br> total de pares " + par + "<br> total de impares "
        + impar+ "<br>acima de cem " + maisdecem + "<br>Media dos valores " + media );
        
        }
        
    
}
