/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculation;

/**
 *
 * @author jatta
 */
public class Calculation {

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        operacao(9,6);
        operacao1(4,1);
        operacao2(23,5);
        operacao3(20,2);
        operacao4(20,5);
    }
    public static double operacao(double a, double b) {
        double s=a+b;
        System.out.println(s);
        return 0;
    }
    public static double operacao1(int num1, double num2) {
      double s=num1-num2;
        System.out.println(s);
        return 0;
    }
    public static double operacao2(double num1, int num2){
        double s=num1*num2;
        System.out.println(s);
        return 0;
        
    }
    public  static double operacao3(int num1, int num2) {
        int s=num1/num2;
        System.out.println(s);
        return 0;
    }
    public static double operacao4(int num1, int num2) {
        int s=num1%num2;
        System.out.println(s);
        return 0;
    }
    
    
}
