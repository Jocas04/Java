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
    
    public void InseririFim(int valor) {
        NO novo= new NO(valor);
        
        
    }
    }
public class ListaDuplamenteEncadeada {
    
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int opcao;
       int valor;
       
    }
    
}
