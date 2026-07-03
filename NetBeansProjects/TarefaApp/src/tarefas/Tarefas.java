
package tarefas;


public class Tarefas {
    private String descricao;
    private boolean concluido;
    
    public Tarefas(String descricao, boolean concluido) {
        this.descricao = descricao;
        this.concluido = concluido;
    }
    public String getDescricao() {
        return descricao;
        }
    public boolean isConcluido() {
        return concluido;
    }
    public void toggleConcluido() {
        concluido = !concluido;
    }
    
    @Override
    public String toString() {
        return (concluido ? "✔" : " ") + descricao;
    }
}
