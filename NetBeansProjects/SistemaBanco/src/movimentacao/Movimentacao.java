package movimentacao;


public class Movimentacao {
   private String tipo;
   private double valor;
   private String data;
   
   public Movimentacao(String tipo, double valor, String data) {
       this.data = data;
       this.tipo = tipo;
       this.valor = valor;
   }
   public String getTipo() {
       return tipo;
   }
   public double getValor() {
       return valor;
   }
   public String getData() {
       return data;
   }
   
   @Override
   public String toString() {
       return data + " | " + tipo + " | R$" + valor;
    }
}
