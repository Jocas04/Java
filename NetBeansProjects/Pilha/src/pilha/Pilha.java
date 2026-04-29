package pilha;

public class Pilha<T> {
    private Object[] data;
    private int top;
    
    public Pilha(int capacidade){
        data= new Object[capacidade];
        top = -1;
    } 
    public boolean TaVazio() {
        return top == -1;
    }
    public int tamanho() {
        return top + 1;
    }
    private void redimensionar() {
        Object[] newData = new Object[data.length * 2];
        System.arraycopy(data,0,newData, 0, data.length);
        data = newData;
    }
    public void push(T value) {
        if (top + 1 == data.length) {
             System.out.println("Pilha cheia!");
            redimensionar();
        }
        data[++top] = value;
    }
    
@SuppressWarnings("unchecked")
    public T pop() {
        if (TaVazio()) throw new RuntimeException("Pilha vazia");
        return (T) data[top--];
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (TaVazio()) throw new RuntimeException("Pilha vazia");
        return (T) data[top];
    }


    public static void main(String[] args) {
       
    Pilha p = new Pilha(5);

        p.push(10);
        p.push(20);
        p.push(30);

        System.out.println("Topo: " + p.peek()); // 30
        System.out.println("Tamanho: " + p.tamanho()); // 3

        System.out.println(p.pop()); // 30
        System.out.println(p.pop()); // 20

        System.out.println("Vazia? " + p.TaVazio()); // false
        System.out.println(p.pop()); // 10
        System.out.println("Vazia? " + p.TaVazio()); // true

        
    }
    
}
