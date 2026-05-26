package pilha17;

import java.util.Stack;


public class Pilha17 {
    public static int Areamaior(int[] alturas) {
        Stack<Integer> Pilha = new Stack<>();   //criacao da pilha
        int Areamaxima= 0;
        int n= alturas.length;
        for (int i=0; i<= n; i++) {
            int Alturaatual = (i == n) ? 0 : alturas[i];
            while (!Pilha.isEmpty() && Alturaatual < alturas[Pilha.peek()]) {
                int h = alturas[Pilha.pop()];
                int largura;
                if (Pilha.isEmpty()) {
                    largura= i;
                } else {
                    largura= i - Pilha.peek() - 1;
                }
                int area = h * largura;
                Areamaxima = Math.max(Areamaxima, area);
            }
            Pilha.push(i);
        }
        return Areamaxima;
    }
    
    public static void main(String[] args) {
       int[] operacao = {2,6,7,8,4,2,4,6,7,4,};
       int resultado= Areamaior(operacao);
        System.out.println(resultado);
    }
    
}
