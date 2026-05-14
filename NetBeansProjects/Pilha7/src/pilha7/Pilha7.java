package pilha7;

import java.util.Stack;


public class Pilha7 {
    
    public static boolean verificacao(String texto) {
        Stack<Character> Pilha= new Stack<>();  //criacao da pilha que vai armazenar os simbolos
        for(char c : texto.toCharArray()) {
            if (c == '(' || c== '[' || c== '{') { //se o simbolo for aberto empilha
                Pilha.push(c);
            } else if(c == ')' || c== ']' || c== '}') { //verifica se o simbolo é fechado 
                if (Pilha.isEmpty()) {  //se tiver vazio retorna falso (se4m par correspondente)
                    return false;
                }
                char topo=Pilha.pop();
                if ((c== ')' && topo != '(') || (c== ']' && topo!= '[') || (c== '}' && topo!= '{')) {
                return false;   //verifica se os pares sao compativeis 
                }               
            }
        }
        return Pilha.isEmpty(); //se a pilha estiver vazia retorna correto
    }

    public static void main(String[] args) {
        System.out.println(verificacao("{[()]}")); //true
        System.out.println(verificacao("{([]])"));//fals
        System.out.println(verificacao("[[[}}}"));//false
    }
    
}
