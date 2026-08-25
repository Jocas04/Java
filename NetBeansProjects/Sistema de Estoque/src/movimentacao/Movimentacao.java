package movimentacao;


public class Movimentacao {
    private String tipo;
    private int quantidade;
    private String data;
    
    public Movimentacao(String tipo, int quantidade, String data) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.data = data;
    }
    @Override
    public String toString() {
        return data + " | " + tipo + " | " + quantidade;
    }
}
