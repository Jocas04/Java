package pilha20;


public class Pilha20 {
    class NO {
        int valor;
        NO ant, prox;
        NO(int v) {
            valor=v;
        }
    }
    private NO topo;
    private NO meio;
    private int tamanho;
    public void push(int valor) {
        NO novo = new NO(valor);
        if (tamanho == 0) {
            topo = meio = novo;
        } else {
            novo.prox = topo;
            topo.ant = novo;
            topo = novo;
            if (tamanho % 2 == 0) {
                meio = meio.ant;
            }
        }
        tamanho++;
    }
    public int pop() {
        if (tamanho == 0) {
            System.out.println("pilha vazia");
            return -1;
        }
        int valor= topo.valor;
        topo = topo.prox;
        if(topo != null) {
            topo.ant = null;
        }
        tamanho--;
        if(tamanho % 2 ==1) {
            meio = meio.prox;
        }
        return valor;
    }
    public int EncontrarMeio() {
        if(meio == null) 
            return -1;
            return meio.valor;
        }
        public int RemoverMeio() {
            if (meio == null) return -1;
            int valor = meio.valor;
            
            if (meio.ant != null) {
            meio.ant.prox = meio.prox;
            }

            if (meio.prox != null) {
                meio.prox.ant = meio.ant;
            }

            if (tamanho % 2 == 0) {
                meio = meio.prox;
            } else {
                meio = meio.ant;
            }

            tamanho--;

            return valor;            
    }
  
    public static void main(String[] args) {
      Pilha20 Pilha = new Pilha20();
      Pilha.push(1);
      Pilha.push(2);
      Pilha.push(3);
      Pilha.push(4);
      Pilha.push(5);
      Pilha.push(6);
      Pilha.push(7);
        System.out.println("Meio: " + Pilha.EncontrarMeio()); //4
        Pilha.RemoverMeio();
        System.out.println("Meio novo: " + Pilha.EncontrarMeio());  //5
        Pilha.pop();
        System.out.println("topo removido");
        System.out.println("meio novo: " + Pilha.EncontrarMeio());  //3
    }
    
}
