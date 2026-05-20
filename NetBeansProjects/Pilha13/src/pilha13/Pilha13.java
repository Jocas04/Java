package pilha13;

import java.util.Stack;


public class Pilha13 {  //criacao das pilhas de proximo e anterior
    private Stack<String> Anterior = new Stack<>();
    private Stack<String> Proximo = new Stack<>();
    private String atual;
    
    public Pilha13 (String PaginaP){
    atual = PaginaP;    //volta para a pagina inicial
}   
    //visitar uma nova pagina
    public void visitar (String url) {
        Anterior.push(atual); //salva a pagina atual
        atual = url;    //vai para uma nova pagina
        Proximo.clear();    //limpa a proxima
    }
    //volta para a anterior (Voltar)
    public String voltar() {
        if (!Anterior.isEmpty()) {
            Proximo.push(atual);    //Guarda a atual no Proximo
            atual=Anterior.pop();   //volta para a anterior
        }
        return atual;
    }
    //vai para a proxima (Avanca)
    public String avancar() {
        if(!Proximo.isEmpty()) {
            Anterior.push(atual);   //guarda a pagina atual no Anterior
            atual = Proximo.pop();  //Vai para o proximo
        }
        return atual;
    }
    
    public static void main(String[] args) {
        Pilha13 Navegador = new Pilha13("google.com");
        
        Navegador.visitar("youtube.com");
        Navegador.visitar("github.com");
        System.out.println(Navegador.voltar()); //youtube
        System.out.println(Navegador.voltar()); //google
        System.out.println(Navegador.avancar());    //youtube
        System.out.println(Navegador.avancar());    //github
        
        Navegador.visitar("stackoverflow.com");
        
        System.out.println(Navegador.voltar()); //github
        System.out.println(Navegador.avancar());    //stack
        System.out.println(Navegador.voltar());    //github
        System.out.println(Navegador.voltar()); //youtube
        
    }
    
}
