/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author jatta
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int y;
        int z;
        x= 5;
        y = 8;
        z= 64;
        boolean r;
        boolean q;
        boolean p;
        
        r= (x<y && y>z) ? true:false;
        q= (x<y || y==z) ? true:false;
        p= (x>y ^ y<z) ? true:false;
        System.out.println(r);
        System.out.println(q);
        System.out.println(p);
    }
    
}
