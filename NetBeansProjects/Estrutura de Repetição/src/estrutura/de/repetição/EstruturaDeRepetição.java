/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estrutura.de.repetição;

/**
 *
 * @author jatta
 */
public class EstruturaDeRepetição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc= 1;
        while(cc<10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 5) {
                continue;
            }
            if (cc == 1) {
                break;
            }
            System.out.println("Cambalhota " + cc);
           
            
        }
    }
    
}
