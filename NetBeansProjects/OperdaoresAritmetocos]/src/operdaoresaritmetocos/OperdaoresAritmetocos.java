/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operdaoresaritmetocos;

/**
 *
 * @author jatta
 */
public class OperdaoresAritmetocos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1+ n2)/2;
        System.out.println("A media sera igual a: " + m);
        System.out.println("media:" + m);
        
        int numero=45;
        int valor= 4 + ++numero;
        System.out.println(valor);
        
        int x= 4;
        x +=2;
        int y=5;
        y *=2;
        System.out.println(x);
        System.out.println(y);
        
        float n10= (float) 7.5;
        int ar= (int)Math.ceil(n10);
        System.out.println(ar);
        
        double yu= Math.random();
        int fg= (int)(6 + yu * (10-6));
        System.out.println(fg);
    }
    
}
