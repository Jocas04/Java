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
       public void ImprimirInicioFim(){
            NO atual = inicio;
            System.out.println("Lista (inicio -> fim): ");
            while (atual != null) {
                System.out.println(atual.valor + " ");
                atual = atual.proximo;
        }
            System.out.println();
    }
        
        public void ImprimirFimInicio(){
            NO atual = fim;
            System.out.println("Lista (fim -> inicio): ");
            while (atual != null) {
                System.out.println(atual.valor + " ");
                atual = atual.anterior;
        }
            System.out.println();
    }
        public void RemoverInicio(){
            if (ListaVazia()) return;            
            if (inicio == fim) {
                inicio = fim = null;
            }else{
                inicio = inicio.proximo;
                inicio.anterior = null;
            }
        }
        public void RemoverFim () {
            if (ListaVazia()) return;
            if(inicio == fim){
                inicio = fim = null;
            } else {
                fim = fim.anterior;
                fim.proximo = null;
            }
        }
        
        public NO Buscar(int valor) {
            NO atual = inicio;
            while (atual != null) {
                if (atual.valor == valor) {
                    return atual;
                }
                atual=atual.proximo;
            }
            return null;
        }
        public void RemoverValor (int valor) {
            NO atual = inicio;
            while (atual != null && atual.valor != valor) {
              atual = atual.proximo;                
            }
            if (atual == null) return;
            if(atual == inicio) {
                RemoverInicio();
            } else if (atual == fim) {
                RemoverFim();
            } else {
                atual.anterior.proximo = atual.proximo;
                atual.proximo.anterior = atual.anterior;
            }            
        }
        public void RemoverTudo(int valor) {
            NO atual = inicio;
            while (atual != null) {
               NO seguinte = atual.proximo;
               if (atual.valor == valor) {
               if (atual == inicio) RemoverInicio();
               else if(atual == fim) RemoverFim();
               else {
                   atual.anterior.proximo = atual.proximo;
                   atual.proximo.anterior = atual.anterior;                   
               }
            }
            atual = seguinte;
        }   
    }
        public int ContarElementos() {
            int contador = 0;
            NO atual = inicio;
            while (atual != null) {
                contador++;
                atual = atual.proximo;
            }
            return contador;
        }
        public void Inverte(){
            NO atual = inicio;
            NO tempo = null;
            
            while (atual != null) {
                tempo = atual.anterior;
                atual.anterior = atual.proximo;
                atual.proximo = tempo;
                atual = atual.anterior;
            }
            tempo = inicio;
            inicio = fim;
            fim = tempo;
        }
        public boolean VPalindromo(){
            NO esquerda = inicio;
            NO direita = fim;
            
            while (esquerda != null && direita != null && esquerda!= direita && direita.proximo != esquerda) {
                if (esquerda.valor != direita.valor)
                    return false;
                    esquerda = esquerda.proximo;
                    direita = direita.anterior;
                }
            return true;
            }
        }
//=========== MAIN / MENU ==============
public class ListaDuplamenteEncadeada {    
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       ListaDupla Lista = new ListaDupla();
       int opcao;
       int valor;
       
       do {
           System.out.println(" MENU");
           System.out.println("1 - Inserir no Inicio");
           System.out.println("2 - Inseriri no Fim");
           System.out.println("3 - Inserir Ordenado");
           System.out.println("4 - Remover Valor");
           System.out.println("5 - Buscar Valor");
           System.out.println("6 - Imprimir Inicio -> Fim");
           System.out.println("7 - Imprimir Fim -> Inicio");
           System.out.println("8 - Contar Elementos");
           System.out.println("9 - Inverter Lista");
           System.out.println("10 - Verificar Palindromo");
           System.out.println("0 - Sair");
           System.out.println("Opcao: ");
           opcao = sc.nextInt();
           
           switch (opcao) {
                case 1:
                    System.out.print("Valor: ");
                    Lista.InserirInicio(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Valor: ");
                    Lista.InserirFim(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Valor: ");
                    Lista.InserirOrdenado(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Valor: ");
                    Lista.RemoverValor(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Valor: ");
                    valor = sc.nextInt();
                    System.out.println(
                        Lista.Buscar(valor) != null ? "Encontrado" : "Nao encontrado"
                    );
                    break;
                case 6:
                    Lista.ImprimirInicioFim();
                    break;
                case 7:
                    Lista.ImprimirFimInicio();
                    break;
                case 8:
                    System.out.println("Total: " + Lista.ContarElementos());
                    break;
                case 9:
                    Lista.Inverte();
                    System.out.println("Lista invertida");
                    break;
                case 10:
                    System.out.println(
                        Lista.VPalindromo() ? "E palindromo" : "Nao e palindromo"
                    );
                    break;
            }

        } while (opcao != 0);

        sc.close();
            }

       }