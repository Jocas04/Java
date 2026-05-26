package pilha16;

import java.util.Arrays;
import java.util.Stack;


public class Pilha16 {
    public static int[] temperatura(int[] temps) {
        int n = temps.length;   // cria os ints que seram usados para saber a casa e resposta
        int[] resposta = new int[n];
        
        Stack<Integer> Pilha = new Stack<>();//cria a pilha que irá guardar os índices
        
        for (int i = 0; i<n;i++) {
            //enquanto a pilha nao estiver vazia e a temperatura do indice for maior do que a do topo
            //irá ser retirado da pilha e recebido pelo indice e assim colocado na resposta o indice "i" menos o "indice"
            while(!Pilha.isEmpty() && temps[i] > temps[Pilha.peek()]) {
                int indice = Pilha.pop();
                resposta[indice] = i - indice;
            }
            Pilha.push(i);//imprime o indice atual resposta
        }
        return resposta;//resultado
    }
    public static void main(String[] args) {
        int[] entrada= {56, 82, 65, 92, 53, 96, 42, 64, 98};
        int[] resultado= temperatura(entrada);
        System.out.println(Arrays.toString(resultado)); //1, 2, 1, 2, 1, 3, 1, 1, 0
    }
    
}
