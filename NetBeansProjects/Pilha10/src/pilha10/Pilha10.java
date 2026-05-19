package pilha10;

import java.util.Stack;


public class Pilha10 {
    public static int avaliacao(String expressao) {
        Stack<Integer> Pilha = new Stack<>(); //criacao da pilha
        
        
for (String token : expressao.trim().split("\\s+")) {
            
            // Se for número
            if (token.matches("-?\\d+")) {
                Pilha.push(Integer.parseInt(token));
            } 
            else {
                // Verifica se tem elementos suficientes
                if (Pilha.size() < 2) {
                    throw new RuntimeException("Expressão inválida!");
                }

                int b = Pilha.pop();    //segundo operando
                int a = Pilha.pop();    //primeiro oparando

                switch (token) {    //executa as operacoes
                    case "+": Pilha.push(a + b); break;
                    case "-": Pilha.push(a - b); break;
                    case "*": Pilha.push(a * b); break;
                    case "/": Pilha.push(a / b); break;
                    default:
                        throw new RuntimeException("Operador inválido: " + token);
                   }
                }
            }
            if (Pilha.size() != 1) {
                throw new RuntimeException("Expressão inválida!");
            }
        return Pilha.pop(); //resultado
    }
   
    public static void main(String[] args) {
       String exp = "7 3 + 5 *";      
        System.out.println(avaliacao(exp)); //2
    }
    
}
