package pilha4;

import java.util.ArrayList;
import java.util.Stack;

public class Pilha4 {
    private ArrayList<Stack<Integer>> Pilhas; //Cria a lista de pilha
    private int capacidadeM; //cria a capacidxade maxima
    
    public Pilha4 (int capacidadeM){ //Construtor
        this.capacidadeM = capacidadeM;
        Pilhas = new ArrayList<>();
        
    }
    public void push (int valor)//Empilha 
    {       //se a pilha estiver vazia ou estiver cheia
        if (Pilhas.isEmpty()|| Pilhas.get(Pilhas.size() - 1).size() == capacidadeM) {
        Pilhas.add(new Stack<>());
    }
        //emp;ilha algum valor
        Pilhas.get(Pilhas.size() - 1).push(valor);       
    }
    //Desempilha (tira da pilha)(da ultima pilha)
    public int pop() {
        if (Pilhas.isEmpty()) {
            System.out.println("Sem pilha (vazia)");
            return -1;
        }
        Stack<Integer> ultima = Pilhas.get(Pilhas.size() - 1);
        int Remover = ultima.pop();//Remove da ultim pilha
        
        if (ultima.isEmpty()) {
            Pilhas.remove(Pilhas.size() - 1); //Se a pilha estiver vazia remove
        }
        return Remover;
    }
    public int AIpop(int indice){   //remove de uma pilha especifica
        if (indice < 0 || indice >= Pilhas.size()){
            System.out.println("indice invalido");
            return -1;
        }
        Stack<Integer> pilha = Pilhas.get(indice);
        int Remover = pilha.pop();
        
        if (pilha.isEmpty()) {  //Se estiver vazia removera
            Pilhas.remove(indice);
        }
        return Remover;
    }
    public static void main(String[] args) {
       Pilha4 sob = new Pilha4(2);
       
        sob.push(10);
        sob.push(20);
        sob.push(30);
        sob.push(40);
        sob.push(50);

        System.out.println(sob.pop());      
        System.out.println(sob.pop());    // 40
        System.out.println(sob.AIpop(0)); // 20
        System.out.println(sob.pop());    // 30
        System.out.println(sob.pop());    // 10

    }
    
}
