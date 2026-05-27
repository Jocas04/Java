package pilha18;

import java.util.Stack;


public class Pilha18 {
    //Funcao reutilizada da Pilha17
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
     public static int Retangulomaior (int[][] matriz) {
         int linha = matriz.length; //recebe como linha
         int coluna = matriz[0].length; //recebe como coluna
         
         int[]alturas = new int[coluna];
         int Areamaxima= 0;
         for (int i = 0; i <linha; i++) {   //enquanto o indice for menor que linha continua
             for (int j = 0; j < coluna; j++) { //enquanto j for menor que coluna continua 
                 if(matriz[i][j] == 1) {    //se a matriz i e j for == 1
                     alturas[j] =+ 1;   //soma +1 na altura
                 } else {
                     alturas[j] = 0; // se nao for nao soma nada, recebe 0
                 }
         }  //operacao para descobrir a area maxima    
            Areamaxima = Math.max(Areamaxima, Areamaior(alturas));
     }
    return Areamaxima;
   }
    public static void main(String[] args) {
      
    int[][] matriz = {
                {0, 1, 1, 1, 0},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 1, 1},
                {1, 0, 1, 1, 0}
            };
            int resultado = Retangulomaior(matriz);
            System.out.println(resultado);  //3
          

    }
    
}
