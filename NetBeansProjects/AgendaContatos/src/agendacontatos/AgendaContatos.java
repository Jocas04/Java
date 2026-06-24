package agendacontatos;

import contato.Contato;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.FileWriter;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import static javax.swing.UIManager.get;
import java.util.ArrayList;
import java.util.Collections;



public class AgendaContatos {
    
    private DefaultListModel<Contato> Listamodelo;
    private JList<Contato> Contatolista;
      
private boolean contatoExiste(String nome, String telefone) {
    for (int i = 0; i < Listamodelo.size(); i++) {
        Contato c = Listamodelo.get(i);

        // comparação correta usando apenas o nome
        if (c.getNome().equalsIgnoreCase(nome) && c.getTelefone().equalsIgnoreCase(telefone)) {
            return true;
        }
    }
    return false;
}
private void Ordenador() {
    ArrayList<Contato> lista = new ArrayList<>();

    for (int i = 0; i < Listamodelo.size(); i++) {
        lista.add(Listamodelo.get(i));
    }

    Collections.sort(lista, (c1, c2) ->
        c1.getNome().compareToIgnoreCase(c2.getNome())
    );

    Listamodelo.clear();

    for (Contato c : lista) {
        Listamodelo.addElement(c);
    }
}
    public AgendaContatos() {
        JFrame frame = new JFrame("Agenda de Contatos");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        Listamodelo = new DefaultListModel<>();
        Contatolista = new JList<>(Listamodelo);
        
        JTextField Nomecampo = new JTextField();
        JTextField Telefonecampo = new JTextField();
        
        JButton btnadd = new JButton("Adicionar");
        JButton btnremove = new JButton("Remover");
        JButton btnEditar = new  JButton("Editar");
        JPanel panel = new JPanel(new GridLayout(3,3));
        panel.add(new JLabel("Nome:  "));
        panel.add(Nomecampo);
        panel.add(new JLabel("Telefone: "));
        panel.add(Telefonecampo);
        
        JPanel Btnpanel = new JPanel();
        Btnpanel.add(btnadd);
        Btnpanel.add(btnremove);
        Btnpanel.add(btnEditar);
        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(Contatolista), BorderLayout.CENTER);
        frame.add(Btnpanel, BorderLayout.SOUTH);
        //Adiciona contato a lista
        btnadd.addActionListener((e) -> {
        String nome = Nomecampo.getText().trim();      
        String telefone = Telefonecampo.getText().trim(); 

        if (nome.isEmpty() || telefone.isEmpty()) {      
             JOptionPane.showMessageDialog(null, "Preencha todos os campos!");     
             return;    
        }

        if (contatoExiste(nome, telefone)) {
             JOptionPane.showMessageDialog(null, "Contato já existe!");
             return;
        }

        Listamodelo.addElement(new Contato(nome, telefone));
        Nomecampo.setText("");
        Telefonecampo.setText("");
        Ordenador();
     });
        //Remover contato da lista
        btnremove.addActionListener((e) -> {
           int indice = Contatolista.getSelectedIndex();
           int resposta = JOptionPane.showConfirmDialog(null, "Deseja remover?");

           if (resposta == JOptionPane.YES_OPTION) {
                // remover
           }
           if(indice != -1) {
               Listamodelo.remove(indice);
           }
        });
        //Editar contato
        btnEditar.addActionListener((e) -> {
       
        int indice = Contatolista.getSelectedIndex();

        if (indice != -1) {
        String novoNome = JOptionPane.showInputDialog("Novo nome:");
        String novoTelefone = JOptionPane.showInputDialog("Novo telefone:");

        Listamodelo.set(indice, new Contato(novoNome, novoTelefone));
        Ordenador();
    } });
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
       SwingUtilities.invokeLater(AgendaContatos::new);
    }
    
}
