

/**
 *
 * @author jatta
 */
public class BalancoTrimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int gJ = 35000;
        int gF = 78000;
        int gM = 19000;
        int gastosTrimestrais = gJ + gF + gM;
        int MediaMensal = (gJ + gF + gM) / 3;

        System.out.println("Os gastos do trimestre foram: " + gastosTrimestrais);
        System.out.println("O  valor da média mensal de gastos foi: " + MediaMensal);
    }
    
}
