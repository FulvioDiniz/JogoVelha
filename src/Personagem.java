import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.plaf.SplitPaneUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.GridLayout;

public class Personagem extends JFrame implements Runnable {
    private JFrame frame = new JFrame();
    private String nome;
    private final JButton[][] Escolhas = new JButton[1][6];
    private final JPanel painel = new JPanel();
    private final java.util.List<String> jogadores = new java.util.ArrayList<String>();
    private final JPanel tela = new JPanel(); // Painel para a tela à direita
    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, painel, tela);

    public void inicializaJanela() {
        //frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        QuadradoPanel painel2 = new QuadradoPanel();
        painel2.setLayout(null);
        painel2.setBorder(null);
        frame.add(painel2);
        criarPersonagens();
        
        // Cria um layout de divisão horizontal
        //JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, painel, tela);
        splitPane.setDividerLocation(400); // Define a largura da divisória
        frame.add(splitPane); // Adiciona o layout de divisão ao frame
        
        frame.pack(); // Ajusta o tamanho do frame automaticamente
        frame.setVisible(true);
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximiza a janela
        frame.setSize(1000, 1000);
    }

    public void criarPersonagens() {
        jogadores.add("Joao");
        jogadores.add("Maria");
        jogadores.add("Pedro");
        jogadores.add("Jose");
        jogadores.add("Ana");
        jogadores.add("Carlos");
        
        painel.setLayout(new GridLayout(6, 1)); // Define o layout do painel como GridLayout com 6 linhas e 1 coluna
        
        for (int i = 0; i < 6; i++) {
            Escolhas[0][i] = new JButton();
            if (i < jogadores.size()) {
                Escolhas[0][i].setText(jogadores.get(i));
            } else {
                Escolhas[0][i].setText("Personagem " + i);
            }
            painel.add(Escolhas[0][i]);
            
            // Adiciona um listener de clique aos botões
            Escolhas[0][i].addActionListener(new BotaoClickListener());
        }
    }
    

    public Personagem() {
        // criarPersonagens();
        // frame.add(painel);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private class QuadradoPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int tamanho = Math.min(frame.getWidth(), frame.getHeight()); // Tamanho do quadrado
            int x = (frame.getWidth() - tamanho) / 2; // Coordenada X para centralizar
            int y = (frame.getHeight() - tamanho) / 2; // Coordenada Y para centralizar verticalmente
            g.setColor(Color.GREEN); // Cor do quadrado
            g.fillRect(x, y, tamanho, tamanho); // Desenha o quadrado com tamanho ajustado
        }
    }


    private class BotaoClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton botao = (JButton) e.getSource();
            String texto = botao.getText();
            if (texto.equals("Joao"))
                JOptionPane.showMessageDialog(frame, "Voce clicou no botao " + texto + "");
                splitPane.imageUpdate(getIconImage(), ALLBITS, EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);

            //JOptionPane.showMessageDialog(frame, "Voce clicou no botao " + texto + "");
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
    }


    public static void main(String[] args) {
        Personagem p = new Personagem();
        p.inicializaJanela();
    }
}
