package pilha17;

import java.util.Stack;


public class Pilha17 {
    public static int Areamaior(int[] alturas) {
        Stack<Integer> Pilha = new Stack<>();   //criacao da pilha
        int Areamaxima= 0;  //maior area
        int n= alturas.length;
        for (int i=0; i<= n; i++) { //enquanto o i for menor ou igual a n adiciona +1
            //Atura atual, coloca 0 no final para forcar a operacao de todas as barras
            int Alturaatual;
            if (i == n) {
                Alturaatual = 0;//se i == 0 termina por isso a importancia do 0
            } else {
                Alturaatual = alturas[i];
            }
            //enquanto a pilha nao estiver vazia e a altura atual for menor que o topo da pilha
            while (!Pilha.isEmpty() && Alturaatual < alturas[Pilha.peek()]) {
                int h = alturas[Pilha.pop()];// retira da pilha
                int largura;
                if (Pilha.isEmpty()) {
                    largura= i;// se a pilha estiver vazia a largura recebe o indice
                } else {
                    largura= i - Pilha.peek() - 1;// se nao largura recebe o topo - 1 - o indice
                }
                int area = h * largura; //para descobrir a area tem que fazer altura vezes largura
                Areamaxima = Math.max(Areamaxima, area);
            }
            Pilha.push(i);
        }
        return Areamaxima;
    }
    
    public static void main(String[] args) {
       int[] operacao = {2,6,7,8,4,2,4,6,7,4,};
       int resultado= Areamaior(operacao);
        System.out.println(resultado); //20
    }
    
}
