/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilha2;

/**
 *
 * @author jatta
 */
public class Pilha2<T> {
    private class NO {
        T value;
        NO proximo;

        NO(T value) {
            this.value = value;
        }
    }

    private NO topo;
    private int tamanho;

    public boolean EstaVazia() {
        return topo == null;
    }

    public int size() {
        return tamanho;
    }

    public void push(T value) {
        NO node = new NO(value);
        node.proximo = topo;
        topo = node;
        tamanho++;
    }

    public T pop() {
        if (EstaVazia()) System.out.println("Pilha vazia");
        T value = topo.value;
        topo = topo.proximo;
        tamanho--;
        return value;
    }

    public T peek() {
        if (EstaVazia()) System.out.println("Pilha vazia");
        return topo.value;
    }
    public static void main(String[] args) {
        Pilha2 p = new Pilha2();
        
        p.push(5);
        p.push(15);
        p.push(25);

        System.out.println("Topo: " + p.peek()); // 25
        System.out.println("Tamanho: " + p.size()); // 3

        System.out.println(p.pop()); // 25
        System.out.println(p.pop()); // 15
        System.out.println(p.pop()); // 5

        System.out.println("Vazia? " + p.EstaVazia()); // true

        
    }
}