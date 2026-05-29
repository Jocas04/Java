package pilha19;

import java.util.Stack;


public class Pilha19 {
    private Stack<Integer> entrada = new Stack<>(); //Criacao da pilha que recebe os elementos
    private Stack<Integer> saida = new Stack<>();   //Pilha que fornece os elementos em ordem
    
    public void enqueue (int valor) {
        entrada.push(valor);    //método para adicionar elementos
    }
    public int desenqueue() {
        if (saida.isEmpty()) {  //se a pilha estiver vazia
            while(!entrada.isEmpty()) { //enquanto a pilha nao estiver vazia 
                saida.push(entrada.pop());  // invertea ordem e tranfere todos os elementos
            }
        }
        if(saida.isEmpty()) {   //se a pilha estiver vazia
            System.out.println("Fila vazia");   //mostra fila vazia
            return -1;
        }
        return saida.pop(); //remove o primeiro elementoda fila
    }
    public int frente() {
        if(saida.isEmpty()) {
            while(!entrada.isEmpty()) {
                saida.push(entrada.pop());
            }
        }
        if(saida.isEmpty()) {
            System.out.println("Fila vazia");
            return -1;
        }
        return saida.peek();    //mostra a saida sem remover elemento
    }
    public static void main(String[] args) {
        Pilha19 fila= new Pilha19();
        
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(40);
        fila.enqueue(50);
        System.out.println(fila.desenqueue());  //10
        System.out.println(fila.desenqueue());  //20
        System.out.println(fila.desenqueue());  //30
        System.out.println(fila.desenqueue());  //40
        fila.enqueue(60);
        System.out.println(fila.frente());  //50
        System.out.println(fila.desenqueue());  //50
        System.out.println(fila.desenqueue());  //60
    }
    
}
