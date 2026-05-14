package pilha8;

import java.util.Stack;


public class Pilha8 {
    public static String remocao(String text){
        Stack<Character> Pilha= new Stack<>(); //criacao da pilha para o armazenamento
        
        for (char c : text.toCharArray()) {
            if (!Pilha.isEmpty() && Pilha.peek() == c) {    //se a pilha NAO estiver vaizia e o topo ser igual ao caractere atual
                Pilha.pop(); //remove da pilha o par
            } else {
                Pilha.push(c); //empurra para a pilha o caractere atual
            }
        }
        StringBuilder Resultado = new StringBuilder();
        for (char c : Pilha) {  //monta o string com o resultado da pilha
            Resultado.append(c);
        }
        return Resultado.toString();
    }

   
    public static void main(String[] args) {
        System.out.println(remocao("asjdas"));//jd
        System.out.println(remocao("khjtukku"));//hjt
        System.out.println(remocao("yrobnuru"));//yob
    }
    
}
