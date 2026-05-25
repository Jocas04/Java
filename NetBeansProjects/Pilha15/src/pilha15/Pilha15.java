package pilha15;

import java.util.Arrays;
import java.util.Stack;


public class Pilha15 {
    public static int[] NGE(int[] arr) {
        int n= arr.length;
        int[] resultado = new int[n];
        Arrays.fill(resultado, -1);//inicializa com -1 e se nao tiver um numero maior aparecera -1
        
        Stack<Integer> Pilha = new Stack<>(); //criacao da pilha
       
        for (int i = 0; i < n; i++) {//adiciona +1 a i se for menor qque n
            while (!Pilha.isEmpty() && arr[i] > arr[Pilha.peek()]) {    
                // Enquanto pilha não estiver vazia e o elemento atual for maior
                int indice = Pilha.pop();   //retira o indice e recebe o atual
                resultado[indice] = arr[i];
            }
            Pilha.push(i);  //empilha o indice
        }
        return resultado;
    } 
    
    public static void main(String[] args) {
        int[]entrada={2,7,6,3,1,4,7};
        int[] resultado = NGE(entrada);
        System.out.println(Arrays.toString(resultado));//7, -1, 7, 4, 4, 7, -1
    }
    
}
