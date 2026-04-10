/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author jatta
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1= "Gerivaldo";
        String name2= "Gerivaldo";
        String name3= new String("Gerivaldo");
        String res;
        String esr;
        String asd;
        res=(name1==name2)?"igual":"diferente";
        esr=(name1==name3)?"igual":"diferente";
        asd=(name3.equals(name2))?"igual":"diferente";
        System.out.println(res);
        System.out.println(esr);
        System.out.println(asd);
        
                
    }
    
}
