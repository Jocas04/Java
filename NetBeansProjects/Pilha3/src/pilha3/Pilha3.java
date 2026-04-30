package pilha3;

import java.util.Stack;

public class Pilha3 {
        private Stack<Integer> pPilha; //Pilha principal
        private Stack<Integer> auPilha; //Pilha auxiliar
    
        public Pilha3() {   //Construtor
        pPilha = new Stack<>();
        auPilha = new Stack<>();
}
        //empilhador
        public void push(int valor) {
            pPilha.push(valor);
        
            // Se minPilha estiver vazia OU o valor for menor ou igual ao mínimo atual
        if (auPilha.empty()|| valor <= auPilha.peek()) {
        auPilha.push(valor);
        }
    }
        public int pop() {  //remove topo
            if (pPilha.empty()) {
                System.out.println("Pilha Vazia");
                return -1;
            }
            int remover = pPilha.pop();
            // Se o valor removido era o mínimo atual, remove também da pilha auxiliar
            if (remover == auPilha.peek()) {
                auPilha.pop();
            }
            return remover;
        }
        //retorna o topo da pilha
        public int peek() {
        if (pPilha.empty()) {
            System.out.println("Pilha vazia");
            return -1;
        }
        return pPilha.peek();
    }

    // Retorna o menor elemento em O(1)
        public int getMin() {
        if (auPilha.empty()) {
            System.out.println("Pilha vazia");
            return -1;
        }
        return auPilha.peek();
    }

        //Testes
    public static void main(String[] args) {
        
    Pilha3 p = new Pilha3();

        p.push(5);
        System.out.println("Min: " + p.getMin()); // 5

        p.push(3);
        System.out.println("Min: " + p.getMin()); // 3

        p.push(7);
        System.out.println("Min: " + p.getMin()); // 3

        p.pop();
        System.out.println("Min: " + p.getMin()); // 3

        p.pop();
        System.out.println("Min: " + p.getMin()); // 5
    }

  }
    

