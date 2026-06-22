package agendacontatos;

import contato.Contato;
import java.awt.BorderLayout;
import java.awt.GridLayout;
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



public class AgendaContatos {
    
    private DefaultListModel<Contato> Listamodelo;
    private JList<Contato> Contatolista;

    
private boolean contatoExiste(String nome) {
    for (int i = 0; i < Listamodelo.size(); i++) {
        Contato c = Listamodelo.get(i);

        // compara só o nome (ignorando maiúsculas/minúsculas)
        if (c.toString().toLowerCase().startsWith(nome.toLowerCase())) {
            return true;
        }
    }
    return false;
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
        JPanel panel = new JPanel(new GridLayout(3,3));
        panel.add(new JLabel("Nome:  "));
        panel.add(Nomecampo);
        panel.add(new JLabel("Telefone: "));
        panel.add(Telefonecampo);
        
        JPanel Btnpanel = new JPanel();
        Btnpanel.add(btnadd);
        Btnpanel.add(btnremove);
        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(Contatolista), BorderLayout.CENTER);
        frame.add(Btnpanel, BorderLayout.SOUTH);
        //Adiciona contato a lista
        btnadd.addActionListener((e) -> {
            String nome = Nomecampo.getText();
            String telefone = Telefonecampo.getText();
            //validacao para ver se os dois campos de contato estao preenchidos
            if (nome.isEmpty() || telefone.isEmpty()) {      
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");     
                return;    
            }           
            // verificação de duplicatas
            if (contatoExiste(nome)) {
                JOptionPane.showMessageDialog(null, "Contato já existe!");
                return;
            }
                Listamodelo.addElement(new Contato(nome, telefone));
                Nomecampo.setText("");
                Telefonecampo.setText("");
            
        });
        //Remover contato da lista
        btnremove.addActionListener((e) -> {
           int indice = Contatolista.getSelectedIndex();
           if(indice != -1) {
               Listamodelo.remove(indice);
           }
        });
       
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
       SwingUtilities.invokeLater(AgendaContatos::new);
    }
    
}
