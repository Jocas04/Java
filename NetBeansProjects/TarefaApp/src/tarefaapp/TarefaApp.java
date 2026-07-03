

package tarefaapp;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import tarefas.Tarefas;


public class TarefaApp {
    private DefaultListModel<Tarefas> modelo;
    private JList<Tarefas> lista;
    private ArrayList<Tarefas> ListaOrg;
   
    public TarefaApp() {
    JFrame frame = new JFrame("Lista de tarefas:  ");
    frame.setSize(600,600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());
    
    modelo = new DefaultListModel<>();
    lista = new JList<>(modelo);
    ListaOrg = new ArrayList<>();
    
    //carregar();
    JTextField campo = new JTextField();
    
        JButton btnadd = new JButton("Adicionar");
        JButton btnremove = new JButton("Remover");
        JButton btnedit = new JButton("Editar");
        JButton btnconcluir = new JButton("Concluir");
        JButton btntodas = new JButton("Todas");
        JButton btnpendentes = new JButton("Pendentees");
        JButton btnconcluidas = new JButton("Feitas");
        
        JPanel paineltopo = new JPanel(new BorderLayout());
        paineltopo.add(campo, BorderLayout.CENTER);
        paineltopo.add(btnadd, BorderLayout.EAST);
        
        JPanel painelbotoes = new JPanel();
        painelbotoes.add(btnremove);
        painelbotoes.add(btnedit);
        painelbotoes.add(btnconcluir);
        
        JPanel painelfiltro = new JPanel();     
        painelfiltro.add(btntodas);    
        painelfiltro.add(btnpendentes);     
        painelfiltro.add(btnconcluidas);      
        
        frame.add(paineltopo, BorderLayout.NORTH);     
        frame.add(new JScrollPane(lista), BorderLayout.CENTER);     
        frame.add(painelbotoes, BorderLayout.SOUTH);        
        frame.add(painelfiltro, BorderLayout.WEST);
        
        //adicionar a lista
        btnadd.addActionListener((e) -> {
            String texto = campo.getText().trim();
            if (!texto.isEmpty()) {
                Tarefas t = new  Tarefas(texto, false);
                modelo.addElement(t);
                ListaOrg.add(t);
                ordenar();
                salvar();
                campo.setText("");
            }
        });
        //remover da lista
        btnremove.addActionListener((e) -> {
           int i = lista.getSelectedIndex();
           if(i != -1) {
               Tarefas t = modelo.get(i);
               ListaOrg.remove(t);
               modelo.remove(i);
               salvar();
           }
        });
        //editar alguma tarefa
        btnedit.addActionListener((e) -> {
        int i = lista.getSelectedIndex();
        if(i != -1) {
            String nova = JOptionPane.showInputDialog("Editar tarefa: ");
            if (nova != null && !nova.isEmpty()) {
                Tarefas antiga = modelo.get(i);
                Tarefas novoT = new Tarefas(nova, antiga.isConcluido());
                ListaOrg.remove(antiga);
                ListaOrg.add(novoT);
                modelo.set(i, novoT);
                ordenar();
                salvar();
            }
        }
        });
        //marcar como concluido
        btnconcluir.addActionListener((e) -> {
        int i = lista.getSelectedIndex();
        if(i != -1) {
            Tarefas t = modelo.get(i);
            t.toggleConcluido();
            ordenar();
            salvar();
            lista.repaint();
        }
        });
        //clique duplo
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    int i = lista.locationToIndex(evt.getPoint());
                    if ( i != -1) {
                        Tarefas t= modelo.get(i);
                        t.toggleConcluido();
                        ordenar();
                        salvar();
                        lista.repaint();
                    }
                }
            }
        });
        //filtros
        btntodas.addActionListener((e) -> filtrar("todas"));        
        btnpendentes.addActionListener(e -> filtrar("pendentes"));
        btnconcluidas.addActionListener(e -> filtrar("concluidas"));
        frame.setVisible(true);
    } 
        //ordem inteligente
        private void ordenar() {
        ArrayList<Tarefas> temp = new ArrayList<>();
        for(int i = 0; i < modelo.size(); i++) {
        temp.add(modelo.get(i));
    }
        temp.sort((t1,t2) -> {
        if (t1.isConcluido() != t2.isConcluido()) {
            return t1.isConcluido() ? 1:-1;
}
        return t1.getDescricao().compareToIgnoreCase(t2.getDescricao());
    });
        modelo.clear();
        for(Tarefas t : temp) {
        modelo.addElement(t);
        }    
    }
        //salvar
        private void salvar() {
            try{ 
                FileWriter w = new FileWriter("tarefas.txt");
                for(Tarefas t : ListaOrg) {
                    w.write(t.getDescricao() + ";" +  t.isConcluido() + "/n");
                }
                w.close();
            }   catch(IOException e) {
                e.printStackTrace();
            }
        }
        //carregar
        private void carregar() {
            try {
                BufferedReader r = new BufferedReader(new FileReader("tarefas.txt"));
                String linha;
                while ((linha = r.readLine()) != null) {
                    String[] p = linha.split(";");
                    Tarefas t = new Tarefas(p[0], Boolean.parseBoolean(p[1]));
                    modelo.addElement(t);
                    ListaOrg.add(t);
                }
                r.close();
            }   
            catch(Exception e) {
                // arquicvo nao existe
            }
        }
        
        // Filtro
            private void filtrar(String tipo) {
                modelo.clear();

                for (Tarefas t : ListaOrg) {
                    if (tipo.equals("todas") ||
                        (tipo.equals("pendentes") && !t.isConcluido()) ||
                        (tipo.equals("concluidas") && t.isConcluido())) {

                        modelo.addElement(t);
                    }
                }

                ordenar();
            }

    public static void main(String[] args) {
      SwingUtilities.invokeLater(TarefaApp::new);
    }   
}
