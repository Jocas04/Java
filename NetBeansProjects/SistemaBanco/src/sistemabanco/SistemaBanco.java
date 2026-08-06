package sistemabanco;
import conta.Conta;
import contaSB.ContaSB;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;


public class SistemaBanco {
    private DefaultListModel<Conta> modelo;
    private JList<Conta> lista;
    private ContaSB csb;
  
    public SistemaBanco() {
        csb = new ContaSB();
        
        JFrame frame = new JFrame("Sistema Bancário");
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        frame.setLayout(new BorderLayout());
        modelo = new DefaultListModel<>();
        lista = new JList<>(modelo);
        
        JTextField campoTitular = new JTextField();
        JButton btnCriar = new JButton("Criar Conta");
        JButton btnAtualizar = new JButton("Atualizar");
        JPanel topo = new JPanel(new GridLayout(2, 1));
        
        topo.add(campoTitular);
        topo.add(btnCriar);
       
        frame.add(topo, BorderLayout.NORTH);
        frame.add(new JScrollPane(lista),BorderLayout.CENTER);
        frame.add(btnAtualizar, BorderLayout.SOUTH);
       
        btnCriar.addActionListener((e) -> {
        String titular = campoTitular.getText().trim();
        if(!titular.isEmpty()) {
            csb.criarConta(titular);
            atualizarlista();
            campoTitular.setText("");
        }
        });
        
        btnAtualizar.addActionListener(e -> atualizarlista());
        
        atualizarlista();
        frame.setVisible(true);
        }
        private void atualizarlista() {
        modelo.clear();
        ArrayList<Conta> contas = csb.listar();
        for(Conta c : contas) {
            modelo.addElement(c);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(SistemaBanco::new);
    }
    
}
