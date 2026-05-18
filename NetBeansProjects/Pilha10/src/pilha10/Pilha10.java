package pilha10;

import java.util.Stack;


public class Pilha10 {
    public static int avaliacao(String expressao) {
        Stack<Integer> Pilha = new Stack<>(); //criacao da pilha
        
        for (String token : expressao.split(" ")) { //divide pelos espacos a expressao
            if (token.matches("//d+")) {
                Pilha.push(Integer.parseInt(token)); //se for numero empilha
            }
            else {
                int a = Pilha.pop();//primeiro operando
                int b = Pilha.pop();//segundo operando
                
                switch (token.charAt(0)) { //verifica o sinal de operacao e executa a operacao determinada
                    case '+' -> Pilha.push(a + b);
                    case '-' -> Pilha.push(a - b);
                    case '*' -> Pilha.push(a * b);
                    case '/' -> Pilha.push(a / b);
                }
                //verifica o sinal de operacao e executa a operacao determinada
            }
        }
        return Pilha.pop(); //resultado
    }
   
    public static void main(String[] args) {
       String exp = "7 3 + 5 *";      
        System.out.println(avaliacao(exp));
    }
    
}
