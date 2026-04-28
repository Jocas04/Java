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
       
    }
    
}
