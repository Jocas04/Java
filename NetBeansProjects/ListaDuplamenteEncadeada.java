package listaduplamenteencadeada;
import java.util.Scanner;

class NO{
    int valor;
    NO proximo;
    NO anterior;
    
    NO(int valor){
        this.valor=valor;
        this.proximo=null;
        this.anterior=null;
    }
}
class ListaDupla{
    private NO inicio;
    private NO fim;
    public boolean ListaVazia()  {
            return inicio==null;
        }
    
    public void InserirInicio(int valor){
        NO novo= new NO(valor);    
        if (ListaVazia()){
                inicio=fim=novo;
            }
        else {
            novo.proximo=inicio;
            inicio.anterior=novo;
            inicio=novo;
            }  
        }
    
    public void InserirFim(int valor) {
        NO novo= new NO(valor);
        if (ListaVazia()){
            inicio=fim=novo;          
        }
        else{
            fim.proximo=novo;
            novo.anterior=fim;
            fim=novo;
        }
    }
    
    public void InserirOrdenado(int valor){
        if (ListaVazia() || valor <= inicio.valor) {
            InserirInicio(valor);
            return;
        } 
        NO atual = inicio;
        while(atual.proximo != null && atual.proximo.valor < valor) {
            atual = atual.proximo;
        }
        if (atual.proximo == null) {
            InserirFim(valor);
        } else{
            NO novo = new NO (valor);
            novo.proximo = atual.proximo;
            novo.anterior = atual;
            atual.proximo.anterior = novo;
            atual.proximo = novo;
        }
        
    }
    }
public class ListaDuplamenteEncadeada {
    
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int opcao;
       int valor;
       
    }
    
}
