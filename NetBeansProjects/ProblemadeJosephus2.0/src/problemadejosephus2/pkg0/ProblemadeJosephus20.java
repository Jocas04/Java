package problemadejosephus2.pkg0;
import java.util.Scanner;
import static problemadejosephus2.pkg0.CalculadoradeJosephus.calculo;

class Nó{
    int id;
    Nó proximo;
    Nó(int id){
        this.id= id;
        this.proximo=null;
                
    }    
}
class CalculadoradeJosephus {
    public static int calculo(int N, int K ){
        
        int sobrevivente= 0;
        if (N >= 1 && K>= 1){
            System.out.println("valido, so numeros naturais");
        } else{
            System.out.println("ERRO" ); 
            System.out.println("N ou K invalido");
            System.exit(1);
        }
        Nó inicio= new Nó(1); //lista encadeada circularr
        Nó fim= inicio;
        for(int i = 2; i <= N; i++){
            Nó nó= new Nó(i);
            fim.proximo= nó;
            fim = nó;
        }
        fim.proximo= inicio; // termina
        
        Nó atual=inicio;
        while(atual.proximo != atual){
        for(int i= 0; i<K - 1; i++){
            atual= atual.proximo;      
            }
        
        System.out.println("Casa Eliminada: " + atual.proximo.id);
        atual.proximo= atual.proximo.proximo;
        atual= atual.proximo;
        }
        
       return atual.id;
    }
}

public class ProblemadeJosephus20 {
    
    

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       while (true){
       System.out.println("Digite a quantidade maxima de numeros (se quiser encerrar digite 0)");
        int N= sc.nextInt();
        System.out.println("digite a quantidade de casas por morte (se quiser encerrar digite 0)");
        int K= sc.nextInt();
        
       System.out.println("o numero da casa sobrevivewnte sera: " + calculo(N,K));
       }
    }   
}
