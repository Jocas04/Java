package estacionamentoportugues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class EstacionamentoPortugues {
    public static void SimEstacionamento(int[] entrada, int[] saidaD) {
        Stack<Integer> estacionamento = new Stack<>();  //cria pilha estacionamento
        List<String> operacoes = new ArrayList<>(); //lista criada para armazenar as operacoes e mostra-las depois
        //empilhamento(entrada) dos carros
        for(int carro : entrada) {
            estacionamento.push(carro); //empilha carro na pilha
            operacoes.add("Entra carro: " + carro); //cada entrada é registrada na lista
        }
        //Procesa a saída desejada e se nao tiver nenhum carro da erro
        for (int saidaC : saidaD) { //percorre a sequencias desejada e cada interacao tenta tirar um carro X
            if(!estacionamento.contains(saidaC)) {
                System.out.println("Erro, sequencia invalida: carro " + saidaC + "nao esta no estacionamento");
                return;
            }
            
            Stack<Integer> temporario = new Stack<>();  //pilha criada para tirar e realocar carros temporariamente
            //remove da pilha os carros até onde quiser
            while(!estacionamento.isEmpty() && estacionamento.peek() != saidaC) {
                //enquanto o estacionamento nao estiver vazio e o carro requerido nao estiver no topo
                //continua a remover carros
                int temp = estacionamento.pop();//remove carro no topo
                temporario.push(temp);//empilha na pilha temporaria
                operacoes.add("Retirar carro: " + temp + " (temporario)");//registra como temporario
            }
            //remove carro X
            estacionamento.pop();
            operacoes.add("Saida carro: " + saidaC);//registra no temporario
            //coloca carros temporarios até chegar ao resultado
            while(!temporario.isEmpty()) {
                int temp= temporario.pop();
                estacionamento.push(temp);
                operacoes.add("Realocar carro: " + temp);
            }
        }
        //da o resultado final e verfica se a operacao é valida ou nao
        System.out.println("Sequencia Válida./n");
        System.out.println("Operacoes Realizadas: ");
        for (String op : operacoes) {
            System.out.println(op);
        }
    }
    
    public static void main(String[] args) {
      int[] entrada= {1,2,3,4};
      int[] saidaD= {2,4,3,1};
      SimEstacionamento(entrada,saidaD);
    }
    
}
