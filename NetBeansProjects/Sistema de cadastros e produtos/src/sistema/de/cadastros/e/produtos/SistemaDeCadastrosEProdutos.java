package sistema.de.cadastros.e.produtos;

import produto.Produto;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import produtoSCP.produtoSCP;


public class SistemaDeCadastrosEProdutos {

    private DefaultListModel<Produto> modelo;
    private JList<Produto> lista;
    private produtoSCP scp;
   
    public SistemaDeCadastrosEProdutos() {
        scp = new produtoSCP();
        
        JFrame frame = new JFrame("Sistema de Produtos");
        frame.setSize(900, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        modelo = new DefaultListModel<>();
        lista= new JList<>(modelo);
        
        JTextField campoNome= new JTextField();
        JTextField campoPreco= new JTextField();
        JTextField campoCategoria= new JTextField();
        JTextField campoQuantidade= new JTextField();
        JTextField campoBusca= new JTextField();
        JButton btnadd = new JButton("Adicionar");
        JButton btnremove = new JButton("Remover");
        JButton btnAZ = new JButton("A - Z");
        JButton btnZA = new JButton("Z - A");
        JButton btnpesq = new JButton("Pesquisar");
        JLabel lblTotal = new JLabel("Produtos: 0");
        JPanel topo = new JPanel(new GridLayout(5,2));
        
        topo.add(new JLabel("Nome"));
        topo.add(campoNome);
        topo.add(new JLabel("Preco"));
        topo.add(campoPreco);
        topo.add(new JLabel("Categoria"));
        topo.add(campoCategoria);
        topo.add(new JLabel("Quantidade"));
        topo.add(campoQuantidade);
        topo.add(new JLabel("Buscar"));
        topo.add(campoBusca);
        
        JPanel botoes= new JPanel();
        botoes.add(btnadd);
        botoes.add(btnremove);
        botoes.add(btnAZ);
        botoes.add(btnpesq);
        botoes.add(btnZA);
        
        frame.add(topo, BorderLayout.NORTH);
        frame.add(new JScrollPane(lista), BorderLayout.CENTER);
        frame.add(botoes, BorderLayout.SOUTH);
        frame.add(lblTotal, BorderLayout.WEST);
        carregarProdutos(lblTotal);
        btnadd.addActionListener((e) -> {
            try {
                String nome = campoNome.getText();
                double preco = Double.parseDouble(campoPreco.getText());
                String categoria = campoCategoria.getText();
                int quantidade = Integer.parseInt(campoQuantidade.getText());
                if(preco <= 0) {
                    JOptionPane.showMessageDialog(null, "Preco invalido");
                    return;
                }
                scp.adicionar(new Produto(
                        0, 
                        nome, 
                        preco, 
                        categoria,
                        quantidade));
                carregarProdutos(lblTotal);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Dados invalidos");
            }
        });
        btnremove.addActionListener((e) -> {
       Produto p = lista.getSelectedValue();
        if(p != null) {
            scp.remover(p.getId());
            carregarProdutos(lblTotal);
        }
        });
        btnpesq.addActionListener((e) -> {
        ArrayList<Produto> produtos = scp.pesquisar(campoBusca.getText());
        atualizarLista(produtos);
        });
        btnAZ.addActionListener((e) -> {
        ArrayList<Produto> produtos = scp.listar();
        produtos.sort(Comparator.comparing(Produto::getNome));
        atualizarLista(produtos);
        });
        btnZA.addActionListener((e) -> {
        ArrayList<Produto> produtos = scp.listar();
        produtos.sort(Comparator.comparing(Produto::getNome).reversed());
        atualizarLista(produtos);
        });
        frame.setVisible(true);
    }
    private void atualizarLista (ArrayList<Produto> produtos) {
        modelo.clear();
        for(Produto p : produtos) {
            modelo.addElement(p);
        }
    }
    private void carregarProdutos(JLabel lblTotal) {
        ArrayList<Produto> produtos = scp.listar();
        atualizarLista(produtos);
        lblTotal.setText("Produtos: " + produtos.size());
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(SistemaDeCadastrosEProdutos::new);
    }  
}