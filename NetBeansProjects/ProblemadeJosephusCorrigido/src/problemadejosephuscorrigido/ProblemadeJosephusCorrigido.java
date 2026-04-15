package problemadejosephuscorrigido;
import java.util.Scanner;

/*
 * Arquivo: ProblemadeJosephusCorrigido.java
 * Baseado no SRD: Josephus - DO178B
 * Norma: RTCA/DO-178B / DO-178C
 * Norma: DO-178B / DO-178C – DAL D
 */
//Estrutura de dados
//LLR03 — Criação da Lista Encadeada Circular
class No{
    int id;
    No proximo;
    
    No(int id){ // criando Nós 
        this.id= id;
        this.proximo=null;       
    }    
}
//excecao erro
//Usada para sinalizar erro de entrada
//HLR02 — Validação de Entrada
class EntradaInvalidaException extends Exception {
    public EntradaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
// Algoritmo
class CalculadoradeJosephus {
    
//Método principal de cálculo
//HLR03 — Execução do Algoritmo de Josephus
//HLR04 — Apresentação do Resultado
    public static int calculo(int N, int K)
            throws EntradaInvalidaException {
      
// LLR01 — Verificação da Faixa de N
    if (N < 1) {
        throw new EntradaInvalidaException("N invalido");
    }

// LLR02 — Verificação da Faixa de K
    if (K < 1) {
        throw new EntradaInvalidaException("K invalido");
    }
//limite para o sistema
    if (N > 100000) {
    throw new EntradaInvalidaException("N excede limite operacional");
    }
    


        //HLR03 — Execução do Algoritmo de Josephus (MODIFICADO) 
        // LLR03 — Criação da Lista Encadeada Circular
        No inicio= new No(1);  
        No atual= inicio;  
        
        for(int i = 2; i <= N; i++){
            atual.proximo= new No(i);
            atual = atual.proximo;
        }
        atual.proximo= inicio; // Fecha a lista
        
        No fim = atual;  // aponta para o último criado
        
        atual = inicio;    //processo de ir para a proxima casa
        // LLR07 — Condição de Término
        while(atual.proximo != atual){
        // LLR04 — Navegação Circular (K − 1)
        for (int i = 1; i < K; i++) {
                fim = atual;
                atual = atual.proximo;
            }
        // LLR05 — Eliminação de Nó
            System.out.println("Casa eliminada: " + atual.id);
            fim.proximo = atual.proximo;  
        // LLR06 — Atualização do Nó Corrente
            atual = atual.proximo;        
        }
        
        // LLR08 — Identificação do Sobrevivente
        // LLR10 — Saída Formada
       return atual.id; //HLR04 — Apresentação do Resultado 
    }
}
//Principal
public class ProblemadeJosephusCorrigido {
    
    

    public static void main(String[] args) throws EntradaInvalidaException {
       Scanner sc= new Scanner(System.in); 
       while (true) {
    try {
        System.out.println("Digite N (0 para encerrar):");
        int N = sc.nextInt();

        if (N == 0) {
            break; // HLR05 — Execução Repetida com encerramento controlado
        }

        System.out.println("Digite K (0 para encerrar)");
        int K = sc.nextInt();
        if (K==0) {
            break;// HLR05 — Execução Repetida com encerramento controlado
        }

        int sobrevivente = CalculadoradeJosephus.calculo(N, K);
        System.out.println("Sobrevivente: " + sobrevivente);

    } catch (EntradaInvalidaException e) {
        System.out.println("Erro de entrada: " + e.getMessage());
        System.out.println("Status: ERRO");
            }
        }
    }   
}