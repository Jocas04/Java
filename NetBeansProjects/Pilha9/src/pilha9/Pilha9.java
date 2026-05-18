package pilha9;

import java.util.Stack;


public class Pilha9 {
    private static int prioridade (char op) {//cria ordem de prioridade
        if (op == '+' || op == '-')return 1;//menor prioridade
        if (op == '*' || op == '/')return 2;//maior prioridade
        return -1;
    }
    public static String converter (String exp) {
        Stack<Character> Pilha= new Stack<>(); //cria a pilha
        StringBuilder saida = new StringBuilder(); 
        
        for(char c : exp.toCharArray()) { //criado para verificar a String
            
            if (Character.isLetterOrDigit(c)) { //Mostra que se for numero ou letra vai direto para saida
                saida.append(c);
            }
            else if (c == '(') { //mostra que o parenteses esquerdo '('empilha
                Pilha.push(c);
            }
            else if (c == ')') { //se tiver o parenteses direito ')'desempilha até chegar ao esquerdo
                while (!Pilha.isEmpty() && Pilha.peek() != '(') {
                    saida.append(Pilha.pop());
                }           
                Pilha.pop();
            }
            else {//verificacao de operadores
                        while (!Pilha.isEmpty() && prioridade(c) <= prioridade(Pilha.peek())) {
                        saida.append(Pilha.pop());
                        }
                        Pilha.push(c);
                        }
        }
        while (!Pilha.isEmpty()) { //desempilha o restante
            saida.append(Pilha.pop());
        }
        return saida.toString();
    }
   
    public static void main(String[] args) {
        
        String exp = "E-(U*F)";
        System.out.println(converter(exp)); //EUF*-
    }
    
}
