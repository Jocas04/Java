/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciologico;

import static java.awt.PageAttributes.MediaType.B;
import java.lang.reflect.Array;
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jatta
 */
public class Exerciciologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
       /* Scanner teclado=new Scanner(System.in);
     
            System.out.println("em que ano voce nasceu: ");
            int ano = teclado.nextInt();
            int i= 2025 - ano;
            int name = i*365;
            System.out.println("sua idade em dias: " + name);*/
        /*int media1;
        int media2;
        int media3;
        media1= (8+9+7)/3;
        media2= (4+5+6)/3;
        media3= (media1+media2)/2;
        System.out.println("medias " + media1);
        System.out.println(media2);
        System.out.println(media1+media2);
        System.out.println(media3);*/
        /*int saldo= 13000;
        int reajuste;
        reajuste= (int) (13000*0.01);
        System.out.println(saldo);
        System.out.println(reajuste);*/
        /*int peca1= 10;
        int peca2= 20;
        int valortotalpago;
        int IPI= 400;
        valortotalpago= ((peca1*30)+(peca2*40))*(IPI/100+1);
        System.out.println(valortotalpago);*/
       /*Scanner teclado= new Scanner (System.in);
        int numero;
        System.out.println("escreva um numero: ");
        numero= teclado.nextInt();
        System.out.println("numero que colocou " +numero);
        System.out.println("numero antecessor "+ (numero-1));
        System.out.println("numero sucessor "+(numero+1));*/
        /*Scanner scanner= new Scanner (System.in);
        System.out.println("voce esta feliz hoje? ");
        boolean felicidade= scanner.nextBoolean();
        System.out.println("tem sol hoje? ");
        boolean sol= scanner.nextBoolean();
        if (sol&&felicidade) {
            System.out.println("entao vamo curti :>");
        } else {
            System.out.println("ent vou ter q fica na baia mesmo :<");*/
        /*Scanner sacnner= new Scanner (System.in);
        double numero;
        System.out.println("escreva um numero: ");
        numero= sacnner.nextDouble();
        if (numero>0) {
            System.out.println("positivo capitao brocha");
    }  else if (numero==0) {
        System.out.println("nulo capitao brocha");
    } else  { 
        System.out.println("numero negativo");
    }*/
        /*Scanner sc= new Scanner(System.in);
        int numero;
        System.out.println("digite um numero positivo");
        numero= sc.nextInt();
        if(numero%2==0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }*/
        /*Scanner sc= new Scanner(System.in);
        int numero1;
        int n2;
        System.out.println("digita aí um numero");
        numero1=sc.nextInt();
        System.out.println("digita outro");
        n2 =sc.nextInt();
        if (numero1%n2==0) {
            System.out.println("n1 é multiplo de n2");
        } else{ 
            System.out.println("n1 nao é multiplo d n2");
        } if (n2%numero1==0) {
            System.out.println("n2 é multiplo de n1");
        } else {
            System.out.println("n2 nao é multiplo de n1");
        }*/
        /*Scanner sc= new Scanner(System.in);
        System.out.println("item 1: X salada - R$ 10,00");
        System.out.println("item 2: X carne - R$14,00");
        System.out.println("item 3: X bacon - R$ 16,00");
        System.out.println("item 4: X tudo - R$20,00");
        
        System.out.println("insira o código do item desejado: ");
        int item=sc.nextInt();
        System.out.println("insira a quantidade de itens desejados: ");
        int codigo=sc.nextInt();
        double total=0;
        boolean invalido= false;
        
        if (item==1) {
            total=(10*codigo);
        } else if (item==2) {
            total=(14*codigo);
        } else if (item==3) {
            total=(16*codigo);
        } else if (item==4) {
            total=(20*codigo);
        } else {
            invalido= true;
            System.out.println("codigo invalido, por favor digite um item valido");
        } if (invalido==false) {
            System.out.println("valor total da compra: "+ total);
        }*/
        /*Scanner sc= new Scanner(System.in);
        System.out.println("digite um numero até 50 e direi entre qual casa decimal esta: ");
        double numero= sc.nextDouble();
        if (numero>=0 && 10>=numero) {
            System.out.println("esta entre 0 a 10");
        }else if (numero> 10 && 20>= numero) {
            System.out.println("esta entre 10 a 20");
        }else if (numero>20 && 30>=numero) {
            System.out.println("esta entre 20 a 30");
        } else if (numero>30 && 40>= numero) {
            System.out.println("esta entre 30 a 40");
        }else if (numero>40 && 50>=numero) {
            System.out.println("esta entre 40 a 50");
            
        }else {
            System.out.println("erro");
        }*/
        /*Scanner sc= new Scanner(System.in);
        System.out.println("digite um numero para x: ");
        double x=sc.nextDouble();
        System.out.println("digite um numero para y: ");
        double y=sc.nextDouble();
        if (x>0 && y>0) {
            System.out.println("quadrante 1");
        }else if (x<0 && y<0) {
            System.out.println("quadrante 3");
        }else if (x<0 && y>0) {
            System.out.println("quadrante 4");
        } else if (x>0 && y <0) {
            System.out.println("quadrante 2");
        } else if (x==0) {
            System.out.println("esta no eixo x");
        }else if (y==0) {
            System.out.println("esta no eixo y");
        } else if (x==0 && y==0) {
            System.out.println("esta no eixo central");
        }*/
        /*Scanner sc= new Scanner(System.in);
        System.out.println("qual o seu salario? ");
        int salario=sc.nextInt();
        double imposto=0;
        if (salario<2000) {
            System.out.println("o pobreza");
        } else if (salario>=2000 && salario<3000) {
            imposto=(salario*0.92);
        }else if ( salario>=3000 && salario<4500) {
            imposto=(salario*0.82);
        }else if(salario>=4500) {
            imposto=(salario*0.72);
        } if (salario>2000){
            System.out.println("seu salario e: "+ salario+ " e o seu salario com imposto ja decrecido no valor sera de: "+ imposto);
        }else {
            System.out.println("isento de imposto");
        }*/
        /*Scanner sc=new Scanner(System.in);
        System.out.println("digite um numero: ");
        int n1=sc.nextInt();
        System.out.println("digite outro numero: ");
        int n2=sc.nextInt();
        System.out.println("digite mais um numero: (AHHHHHHHHHH)");
        int n3=sc.nextInt();
        if (n1>n2 && n1>n3) {
            System.out.println("n1 é o maior numero");
        } else if (n2>n1 && n2>n3) {
            System.out.println("n2 é o maior numero");
        } else if (n3>1 && n3>n2) {
            System.out.println("n3 é o maior numero");
        }*/
        /*int[]numeros={21,6,8,3,12,4,7,83,5,8};
        Arrays.sort(numeros);
        System.out.println("numeros ordenados" + Arrays.toString(numeros));*/
        /*Scanner sc=new Scanner(System.in);
        System.out.println("qual a sua idade: ");
        int i=sc.nextInt();
        if (i>=10 && i<=14) {
            System.out.println("esta no estado infantil da vida");
        } else if ( i>=15 && i<=17) {
            System.out.println("esta no estado juvenil da visda");
        } else if (i>=18 && i<=25) {
            System.out.println("esta no estado adulto da vida");
        }*/
        /*Scanner sc=new Scanner(System.in);
        System.out.println("digite um numero: ");
        double n=sc.nextDouble();
        double raiz=Math.sqrt(n);
        if (n%2==0) {
            System.out.println("numero par " +"a raiz quadrada do numero " + (n ) + " seria " + raiz );
        } else { 
            System.out.println("numero impar "+ "elevado ao quadrado é" + (n*n));
        }*/
       /*String[] nomes = {"Alice", "Bob", "Carlos", "Diana"};
        int[] idades = {25, 30, 22, 28};
        int i = 0;

        while (i < 4 ) {
            System.out.println("Nome: " + nomes[i] + ", Idade: " + idades[i]);
            i++;
            
        }*/
       /*int n1;double media;int n2;int n3; int n4; int n5;int par =0;int impar=0;
       Scanner sc=new Scanner (System.in);
       do { System.out.println("digite um numero: ");
       n1=sc.nextInt();
           System.out.println("digita outro: ");
           n2=sc.nextInt();
           System.out.println("digita mais um: ");
           n3=sc.nextInt();
           System.out.println("digita mais numero");
           n4= sc.nextInt();
           System.out.println("o ultimo agora: ");
           n5=sc.nextInt();
           if (n1%2==0) {
               par++;
           }else {
               impar++;
           }
           if (n2%2==0) {
               par++;
           }else {
               impar++;
           }
           if (n3%2==0) {
               par++;
           }else {
               impar++;
           }
           if (n4%2==0) {
               par++;
           }else {
               impar++;
           }
           if (n5%2==0) {
               par++;
           }else {
               impar++;
           }
          
       }
           while (n5==0);
            media=(n1+n2+n3+n4+n5)/5;
            System.out.println("a media é: "+ media);
            System.out.println("tinham "+ par +" numeros pares ");
            System.out.println("tinham "+ impar+" numeros impares ");
             if (n1>n2 && n1>n3 && n1>n4 && n1>n5) {
               System.out.println("n1 é o maior numero ");
           } else if (n2>n1 && n2>n3 && n2>n4 && n2>n5) {
               System.out.println("n2 é o maior numero");
           }  else if (n3>n1 && n3>n2 && n3>n4 && n3>n5) {
               System.out.println("n3 é o maior numero");
           }  else if (n4>n1 && n4>n3 && n4>n2 && n4>n5) {
               System.out.println("n4 é o maior numero");
           }  else if (n5>n1 && n5>n3 && n5>n4 && n5>n2) {
               System.out.println("n5 é o maior numero");
           }*/
       /*int n;
        Scanner sc=new Scanner (System.in);
         System.out.println("digite um numero ");
               n=sc.nextInt();
       for  
               
               (int i = 1; i <= 10; i++) {
           
            int resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
            
              
    }*/
      /* int a = 1;
       do {
          
           if (a<20) {
                System.out.println("algoritmos");
                a++;
           }
           
       } while (a<20);*/
      /*int a=0;
      for   (int b=1;b<=15;b++) {
          a+=b;
      }
        System.out.println("a soma é:" +a);*/
      
      /*Scanner sc=new Scanner (System.in);
        System.out.println("digite um nome");
        String nome=sc.nextLine();
        
      for (int b=1;b<=10;b++) {
       System.out.println(b +" - "+ nome);   
      }*/
      
      /*Scanner sc=new Scanner(System.in);
        System.out.println("digite um nome: ");
        String nome=sc.nextLine();
        System.out.println("digite um numero: ");
        int n = sc.nextInt();
        for (int a=1; a<=n;a++) {
            System.out.println(a +" - " + nome);
        }*/
      /*Scanner sc=new Scanner (System.in);
      int b;
      int n;
      int n1;
      int n2;
      int n3;
      int n4;
      int n5;
      int n6;
      int n7;
      int n8;
      int n9;
             int soma;
       System.out.println("digite um numero: ");
        n=sc.nextInt();
         System.out.println("digite um numero: ");
        n1=sc.nextInt();
         System.out.println("digite um numero: ");
        n2=sc.nextInt();
         System.out.println("digite um numero: ");
        n3=sc.nextInt(); 
        System.out.println("digite um numero: ");
        n4=sc.nextInt();
        System.out.println("digite um numero: ");
        n5=sc.nextInt();
        System.out.println("digite um numero: ");
        n6=sc.nextInt();
        System.out.println("digite um numero: ");
        n7=sc.nextInt(); 
        System.out.println("digite um numero: ");
        n8=sc.nextInt(); 
        System.out.println("digite um numero: ");
        n9=sc.nextInt();
   soma=(n+n1+n2+n3+n4+n5+n6+n7+n8+n9);
        System.out.println("a soma dos numeros é: "+ soma);*/
        /*Scanner sc=new Scanner (System.in);
        int soma=0;
        double media;
        int idade=0;
        int maior=1;
        for (int i = 1; i <= 20; i++) {
            System.out.println("digite uma idade "+i+":");
            idade=sc.nextInt();
            soma+=idade;
            if(idade>18){
                maior++;
            }
            
        } 
        
        media=(soma)/20;
        System.out.println("a soma das idades é: "+ soma);
        System.out.println("a media das idades: "+ media);
        System.out.println("todas as pessoas maiores de idade: " +maior);*/
       /*int n[]={2,6,4,7};
        for (int c=0;c<=n.length-1;c++) {
            System.out.println("na posicao "+c+" tem o vetor "+n[c]);
        }*/
       /*int a[]={1,2,3,4,5};
       int b[]={6,7,8,9,0};
        for (int c=0;c<=a.length-1;c++) {
            System.out.println(a[c]);
            
        }
        for (int d=0;d<=4;d++) {
            System.out.println(b[d]);
        }*/
       /*int a[]={1,2,3,4,5,6,7,8};
       int b[]={1*2,2*2,3*2,4*2,5*2,6*2,7*2,8*2};
        for (int c=0;c<=7;c++) {
            System.out.println(a[c]);}
        for (int d=0;d<=b.length-1;d++) {
            System.out.println(b[d]);}*/
       /*int a[]={4,6,4,2,3,5,7,5,3,3,5,7,5,4,8};
       int b[]={4*4,6*6,4*4,2*2,3*3,5*5,7*7,5*5,3*3,3*3,5*5,7*7,5*5,4*4,8*8};
        for (int c=0;c<=14;c++) {
            System.out.println(a[c]);}
        for (int d=0;d<=b.length-1;d++) {
            System.out.println(b[d]);}*/
       
     

        /*int[] A = {21,43,552,98,34,78,35,24,86,45};
        int[] B = {43,65,3,6,5,23,6,243,7,3};
        int[] C= new int [10];

        for (int i=0;i<10;i++){
            C[i]=A[i]*B[i];
        }System.out.println("vetores a ");
        for (int i=0;i<=9;i++) {
            if(A[i]%2==0) {
            System.out.println(A[i]+ " ");}
        }System.out.println("vetores b ");
        for(int i=0;i<=9;i++) {
            if (B[i]%2!=0){
            System.out.println(B[i]);}
        }System.out.println("vetores c ");
        for(int i=0;i<=9;i++) {
            System.out.println(C[i]);
        }*/
        /*int[] A = {21,43,552,98,34,78,35,24,86,45};
        int[] B = {43,65,3,6,5,23,6,243,7,3};
        int[] C= new int [10];
        int k= 9;
        int maior = 0;
        int menor = 0;
        for (int i=0;i<10;i++){
            B[k]=A[i];
            k=k-1;
            maior=A[0];
            menor=B[0];
            if (A[i]>maior){
                maior=A[i];
            }
            if (B[i]<menor){
                menor=B[i];
            }
        }System.out.println("vetores a ");
        for (int i=0;i<=9;i++) {
          
            System.out.println(A[i]+ " ");}
        
    System.out.println("vetores b ");
        for(int i=0;i<=9;i++) {
           
            System.out.println(B[i]);
      
           


       }
        System.out.println("vetor a " + maior);
        System.out.println("vetor b "+ menor);
    
    }
}*/
        /*int[] A= {10,23,65,94,82,05,38,58,5,23};
        int[] B= new int [10];
        int media;
             System.out.println("vetores A: "); 
        for (int i=0;i<10;i++) {
            B[i]=A[i]+A[i];
             System.out.println( A[i]);         
         } System.out.println("vetores B: ");
         for (int i=0;i<10;i++){
             System.out.println(B[i]);
         }System.out.println("media: A");
         int soma=10+23+65+94+82+05+38+58+5+23;
         media=soma/10;
        System.out.println(media);
        for (int i=0;i<10;i++) {
             if (A[i]%2!=0){
               A[2]=0;A[1]=0;A[5]=0;A[8]=0;A[9]=0;
           }
            System.out.println("numero "+i+" vetor "+A[i]);
        }System.out.println("maior numero: " + A[3]);
        System.out.println("menor numero: "+ A[8]);*/
        
         
    }
}    