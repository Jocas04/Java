package pilha14;

import java.util.Stack;


public class Pilha14 {
    static class Posicao {  //cria clase para rep;resentar a posicao
        int linha, coluna;
        Posicao(int L, int C) {
            linha = L;
            coluna = C;
        }
    }
    public static boolean operacao(int [][] labirinto) {    //operacao para encontrar a saida ou nao do labirinto
        int n= labirinto.length;
        Stack<Posicao> Pilha = new Stack<>();   //cria uma pilha
        
        Pilha.push(new Posicao(0,0)); //posicao inicial
        
        while(!Pilha.isEmpty()) {   //enquianto pilha n estiver vazia
            Posicao atual = Pilha.pop();// a atual posicao é mudada
            int L= atual.linha; //L recebe a linha atual
            int C= atual.coluna;    //C recebe coluna atual
            
            if (L == n - 1 && C == n -1) {  //se receber o ultimo numero da matriz 
                     return true;           //significa que chegou ao final entao retorna true
            }
            if (L<0 || C<0 || L>=n || C>=n || labirinto [L][C] == 0) {
                continue;   //verifica se tem limiktes ou paredes e continua percorrendo
            }
            labirinto[L][C] = 0;    //marca a casa como visitada
            Pilha.push(new Posicao(L+1, C)); //para baixo
            Pilha.push(new Posicao(L-1, C));    //para cima
            Pilha.push(new Posicao(L, C+1));//para direita
            Pilha.push(new Posicao(L+1, C-1)); //para esquerda
        }
        return false;
    }
   
    public static void main(String[] args) {
       int[][] labirinto = {
           {1,1,0},
           {0,1,1},
           {0,0,1}
       };
       if (operacao(labirinto)) {
           System.out.println("Existe saída no labirinto");           
       } else {
           System.out.println("Nao existe saida");
       }
       //existe caminho
    }
    
}
