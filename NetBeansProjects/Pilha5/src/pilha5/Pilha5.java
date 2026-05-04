package pilha5;

import java.util.Stack;

public class Pilha5 {
    public static String inverter(String texto) {   // método pra Inverte a string
        Stack<Character> Pilhas = new Stack<>();    //Pilha que armazena caracteres
        for (char caractere : texto.toCharArray()) { //empilha os caracteres da string
            Pilhas.push(caractere);
        }
        StringBuilder Resultado = new StringBuilder();
        while(!Pilhas.isEmpty()) {
            Resultado.append(Pilhas.pop());
        }
        return Resultado.toString();
    }
    public static void main(String[] args) {    //teste
        String entrada = "1234 56";
        String saida = inverter(entrada);
        System.out.println(entrada); //1234 56
        System.out.println(saida); //65 4321
    }
    
}
