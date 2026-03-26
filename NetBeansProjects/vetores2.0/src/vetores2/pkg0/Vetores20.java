/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores2.pkg0;

/**
 *
 * @author jatta
 */
public class Vetores20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[]= {"janeiro", "fevereiro","março","abril","maio",
            "junho","julho","agosto","setembro","outubro","novembro","dezembro"};
        int dia []= {31,28,31,30,31,30,31,30,31,30,31,30};
        for(int c=0; c<mes.length;c++) {
            System.out.println("o mes de " + mes[c] + " tem " + dia[c] + " dias ao todo");
    }
        
    
}
}
