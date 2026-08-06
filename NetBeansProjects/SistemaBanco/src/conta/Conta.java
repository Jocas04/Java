package conta;


public class Conta {
    private int id;
    private String titular;
    private double saldo;
    
    public Conta(int id, String titular,  double saldo) {
        this.id= id;
        this.titular = titular;
        this.saldo = saldo;
    }
    public int getId() {
        return id;
    }
    public String getTitular() {
      return titular;  
    }
    public double getSaldo() {
        return saldo;
    }
    @Override
    public String toString() {
        return titular + " | Saldo R$ " + saldo;
    }
}
