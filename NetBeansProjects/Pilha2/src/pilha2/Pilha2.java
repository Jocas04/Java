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
        NO next;

        NO(T value) {
            this.value = value;
        }
    }

    private NO top;
    private int size;

    public boolean EstaVazia() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void push(T value) {
        NO node = new NO(value);
        node.next = top;
        top = node;
        size++;
    }

    public T pop() {
        if (EstaVazia()) throw new RuntimeException("Pilha vazia");
        T value = top.value;
        top = top.next;
        size--;
        return value;
    }

    public T peek() {
        if (EstaVazia()) throw new RuntimeException("Pilha vazia");
        return top.value;
    }
}