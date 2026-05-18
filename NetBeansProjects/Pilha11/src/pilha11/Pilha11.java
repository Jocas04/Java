package pilha11;

import java.util.Stack;


public class Pilha11 {
    public static String simplificacao (String exp) {
        Stack<Integer> Pilha = new Stack<>(); //cria a pilha
        
        Pilha.push(1);//sinal inicial da pilha
        int sinal= 1; //sinal atual
        
        StringBuilder RES= new StringBuilder();
        
        for (char c : exp.toCharArray()) {
            if (c == '+') { //nao altera o sinal do parenteses
                continue;
            }
            else if (c == '-') {
             sinal = -sinal;   //inverte o sinal do parenteses
            }
            else if (c == '(') {
                Pilha.push(sinal);//empilha o sinal atual
            }
            else if (c == ')') {
                Pilha.pop();//desempilha o sinal
            }
            else if (Character.isLetter(c)) { //calculo para saber qual o sinal final
                int sinalfinal = Pilha.peek() * sinal;
                if (sinalfinal == 1) {
                    RES.append("+");
                }
                else {
                    RES.append("-");
                }
                RES.append(c); //resultado
                sinal= 1; //reseta o sinal
            }
        }
        return RES.toString();
    }
    public static void main(String[] args) {
      String exp = "a -(b+(c-d))";
        System.out.println(simplificacao(exp));
        
    }
    
}
