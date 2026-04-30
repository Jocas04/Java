package pilha2.pkg2;

public class Pilha22 {

    private int[] array; // array compartilhado pelas duas pilhas
    private int topo1;   // topo da pilha 1
    private int topo2;   // topo da pilha 2

    // Construtor
    public Pilha22(int capacidade) {
        array = new int[capacidade];
        topo1 = -1;              // pilha 1 começa vazia
        topo2 = capacidade;      // pilha 2 começa vazia
    }

    // Empilha na pilha 1
    public void push1(int valor) {
        if (topo1 + 1 == topo2) {
            System.out.println("Overflow: sem espaço");
            return;
        }
        array[++topo1] = valor;
    }

    // Empilha na pilha 2
    public void push2(int valor) {
        if (topo1 + 1 == topo2) {
            System.out.println("Overflow: sem espaço");
            return;
        }
        array[--topo2] = valor;
    }

    // Desempilhar da pilha 1
    public int pop1() {
        if (topo1 == -1) {
            System.out.println("Pilha 1 vazia");
            return -1;
        }
        return array[topo1--];
    }

    // Desempilha da pilha 2
    public int pop2() {
        if (topo2 == array.length) {
            System.out.println("Pilha 2 vazia");
            return -1;
        }
        return array[topo2++];
    }

    // ✅ MÉTODO DE TESTE
    public static void main(String[] args) {
        Pilha22 p = new Pilha22(6);

        p.push1(10);
        p.push1(20);
        p.push2(90);
        p.push2(80);

        System.out.println(p.pop1()); // 20
        System.out.println(p.pop2()); // 80
        System.out.println(p.pop1()); // 10
        System.out.println(p.pop2()); // 90
    }
}