package list;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class List {
    private DefaultListModel<String> Modelolista;
    private JList<String> Listatarefa;
   
    public List() {
        //criando a janela do programa
        JFrame frame = new JFrame("Escreva alguma tarefa");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
         
        //Modelo da lista
        Modelolista = new DefaultListModel<>();
        Listatarefa = new JList<>(Modelolista);
        JScrollPane Panel = new JScrollPane(Listatarefa);
        
        //Campo de texto
        JTextField Campotexto = new JTextField();
        
        //botoes (adicionar,remover,marcar copmo feito)
        JButton btnadd = new JButton("Adicionar");
        JButton btnremove = new JButton("Remover");
        JButton btnfeito = new JButton("marcar como feito");
        
        //Parte inferior (painelk onde tem botoes)
        JPanel Painelbotoes = new JPanel();
        Painelbotoes.setLayout(new GridLayout(1,4));
        Painelbotoes.add(btnadd);
        Painelbotoes.add(btnremove);
        Painelbotoes.add(btnfeito);
        
        //Adicionar tarefas a tela lista
        frame.add(Campotexto, BorderLayout.NORTH);
        frame.add(Panel, BorderLayout.CENTER);
        frame.add(Painelbotoes, BorderLayout.SOUTH);
        
        //Adiciona tarefa a lista
        btnadd.addActionListener((e) -> {
        String tarefa = Campotexto.getText();
        if (!tarefa.isEmpty()){
            Modelolista.addElement(tarefa);
            Campotexto.setText("");
        }
        });
        //Remove tarefa da lista
        btnremove.addActionListener((e) -> {
            int indice = Listatarefa.getSelectedIndex();
            if(indice != -1) {
                Modelolista.remove(indice);
            }
        });
        
        //Marca como feito na lista
        btnfeito.addActionListener((e) -> {
            int indice = Listatarefa.getSelectedIndex();
            if (indice  != -1) {
                String tarefa = Modelolista.getElementAt(indice);
                
                //verifica se já foi marcado como conluido
                if (!tarefa.startsWith("✔")) {
                Modelolista.set(indice, "✔" + tarefa);
                }
            }
        });
        //exibir janela
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(List::new);
    }
    
}
