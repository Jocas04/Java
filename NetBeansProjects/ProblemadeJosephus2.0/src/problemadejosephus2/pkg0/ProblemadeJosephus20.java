package problemadejosephus2.pkg0;
import java.util.Scanner;
import static problemadejosephus2.pkg0.CalculadoradeJosephus.calculo;

class Nó{
    int id;
    Nó proximo;
    Nó(int id){ // criando Nós 
        this.id= id; //id para uma casa
        this.proximo=null;
                
    }    
}
class CalculadoradeJosephus {
    public static int calculo(int N, int K ){
        
        int sobrevivente= 0;
        //HLR02 — Validação de Entrada 
        if (N >= 1 && K>= 1){//LLR01 e 02 — Verificação das Faixas N e K
            System.out.println(" valido, so numeros naturais");
        } else{
            System.out.println("ERRO" ); 
            System.out.println("N ou K invalido");
            System.exit(1);
        }
        //HLR03 — Execução do Algoritmo de Josephus (MODIFICADO) 
        Nó inicio= new Nó(1); //criacao da lista circular 
        Nó fim= inicio;       
        for(int i = 2; i <= N; i++){
            Nó nó= new Nó(i);
            fim.proximo= nó;
            fim = nó;
        }
        fim.proximo= inicio; // termino da lista
        
        Nó atual=inicio;    //processo de ir para a proxima casa
        while(atual.proximo != atual){
        for(int i= 0; i<K - 1; i++){
            atual= atual.proximo;      
            }
        
        System.out.println("Casa Eliminada: " + atual.proximo.id); //processo de eliminar uma casa
        atual.proximo= atual.proximo.proximo;
        atual= atual.proximo;//processo de atualizacao de nó
        }
        
       return atual.id; //HLR04 — Apresentação do Resultado 
    }
}

public class ProblemadeJosephus20 {
    
    

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
      //HLR05 — Execução Repetida 
       while (true){
           //HLR01 — Entrada de Parâmetros 
       System.out.println("Digite a quantidade maxima de numeros (se quiser encerrar digite 0)");
        int N= sc.nextInt();
        System.out.println("digite a quantidade de casas por morte (se quiser encerrar digite 0)");
        int K= sc.nextInt();
        
       System.out.println("o numero da casa sobrevivewnte sera: " + calculo(N,K)); //identifica e print o sobrevivente
       }
    }   
}
