package pilha6;

import java.util.Stack;


public class Pilha6 {
    public static String converte(int valor) {
        Stack<Integer> Pilha = new Stack<>(); //armazena os restos
        while (valor > 0) { //enquanto o numero for maior que 0
            Pilha.push(valor % 2); //coloca na pilha o resto
            valor = valor / 2; //divide por 2
        }
        StringBuilder Binario = new StringBuilder();
        while (!Pilha.isEmpty()) {  //desempilha para formar o binario correto
            Binario.append(Pilha.pop());
        }
        return Binario.toString();
    }

    public static void main(String[] args) {
        int valor= 200;
  
        String resultado= converte(valor);
        System.out.println(resultado);
    }
    
}
