package problemadejosephuscorrigido;

import java.util.Scanner;

// Classe Nó para lista circular
class Node {
    int id;
    Node next;
    Node(int id) { this.id = id; }
}

// Classe principal de cálculo
class JosephusSolver {

    public int solve(int N, int K) {
        // Validação de entrada (LLR01 e LLR02)
        if (N < 1) throw new IllegalArgumentException("N inválido");
        if (K < 1) throw new IllegalArgumentException("K inválido");

        // Criação da lista circular (LLR03)
        Node head = new Node(1);
        Node prev = head;
        for (int i = 2; i <= N; i++) {
            prev.next = new Node(i);
            prev = prev.next;
        }
        prev.next = head; // circularidade

        // Navegação e eliminação (LLR04–LLR07)
        Node current = head;
        while (current.next != current) {
            for (int i = 1; i < K; i++) {
                current = current.next;
            }
            // Eliminação do nó
            current.next = current.next.next;
            current = current.next;
        }

        // Identificação do sobrevivente (LLR08)
        return current.id;
    }
}

// Classe de interface com o usuário
public class ProblemadeJosephusCorrigido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JosephusSolver solver = new JosephusSolver();

        while (true) {
            System.out.println("Digite N (0 para encerrar):");
            int N = sc.nextInt();
            if (N == 0) break;

            System.out.println("Digite K (0 para encerrar):");
            int K = sc.nextInt();
            if (K == 0) break;

            try {
                int sobrevivente = solver.solve(N, K);
                System.out.println("O sobrevivente está na posição: " + sobrevivente);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro de entrada: " + e.getMessage());
            }
        }
        sc.close();
    }
}
