/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoa;

/**
 *
 * @author jatta
 */
public class Pessoa {

    public String Informacao(String nome,int idade,double peso,double altura) {
                return ("meu nome é: "+ nome+" minha idade é: "+ idade+" meu peso: "+ peso+" minha altura: "+ altura);
    }
     public String Dizerinformacao(String nome,int idade) {
         return ("meu moem " + nome+ " idade "+idade);
     }
     public String Informacao1(String nome1) {
         return ("meu nomeé: "+ nome1);
     }  public String Informacao2(int idade1) {
         return ("minha idade é: "+ idade1);}
      public String Informacao3(double peso, double altura) {
         return ("meu peso é: "+ peso+ " e minha altura: "+ altura);
     } 
         
    public static void main(String[] args) {
        // TODO code application logic here
       
          Pessoa nome=new Pessoa();           
          System.out.println(nome.Informacao("joca",18,76.f,1.81));
           Pessoa idade=new Pessoa();
           System.out.println(idade.Dizerinformacao("ariranha", 18));
           Pessoa nome1=new Pessoa();
           System.out.println(nome1.Informacao1("araas"));
           Pessoa idade1=new Pessoa();
           System.out.println(idade1.Informacao2(18));
           Pessoa peso=new Pessoa();
           System.out.println(peso.Informacao3(76.f, 1.81));
        }
    }
    

