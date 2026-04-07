/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repita;

import javax.swing.JOptionPane;

/**
 *
 * @author jatta
 */
public class Repita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s = 0, n = 0, impar = 0, maisdecem = 0, media = 0, par = -1, conta= -1;
        
        do{
            n= Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque um número: " + "(se colocar o numero 0 termina)"));
        s += n;
        conta++;
        if (n%2==0){
            par++;}
        else { impar++;           
        
        } if (n>=100); {
            maisdecem++;
        }
        
        }while (n!= 0);
        media = (s/conta);
        JOptionPane.showMessageDialog(null, "Resultado Final " + " a soma dos numeros é " + s + " total de valores: " + conta + " numeros pares " + par + " numeros impares " + impar + " numeros acima de 100 " + maisdecem + " 1media dos valores " + media);
        
    

        }
        }

