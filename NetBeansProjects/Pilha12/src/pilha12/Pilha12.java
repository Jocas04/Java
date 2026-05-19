package pilha12;

import java.util.Stack;


public class Pilha12 {
        private Stack<String> Undo = new Stack<>();
        private Stack<String> Redo = new Stack<>();
        private String texto = " ";
        
        public void escreve(String U) {
            Undo.push(texto); //salva o atual
            texto += U; //adiciona texto
            Redo.clear();   //limpa o texto
        }
        public void deletar(int R) {    //assim como o nome diz DELETA
            Undo.push(texto);
            texto= texto.substring(0, texto.length() - R);
            Redo.clear();
        }
        //Undo: guarda estados anteriores e move o estado pro Redo
        public void Undo() {    
            if (!Undo.isEmpty()) {
                Redo.push(texto);
                texto = Undo.pop();
            }
        }
        //Redo: guarda estados desfeitos, limpa a pilha e move o estado para o Undo
        public void Redo() {    
            if (!Redo.isEmpty()) {
                Undo.push(texto);
                texto = Redo.pop();
            }
        }
        public String getTexto() {
            return texto;
        }
   
    public static void main(String[] args) {
      
        Pilha12 editor = new Pilha12();

        editor.escreve("aras");
        System.out.println(editor.getTexto()); // aras

        editor.escreve("skill");
        System.out.println(editor.getTexto()); // arasskill

        editor.deletar(4);
        System.out.println(editor.getTexto()); // arass

        editor.Undo();
        System.out.println(editor.getTexto()); // arasskill

        editor.Undo();
        System.out.println(editor.getTexto()); // aras

        editor.Redo();
        System.out.println(editor.getTexto()); // arasskill

    }
    
}
