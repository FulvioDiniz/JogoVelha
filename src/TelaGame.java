import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaGame extends JPanel implements ActionListener {
        private Image fundo;
        private Image fundox;
        private Image fundoy;
        private Timer timer;
        private boolean emJogo;
        private final int LARGURA = 800;
        private final int ALTURA = 800;
        private JButton[][] Tabuleiro = new JButton[3][3];
        private int i = 0;
        private boolean vencedor = false;

        public TelaGame() {
                setFocusable(true);
                setDoubleBuffered(true);
                setPreferredSize(new Dimension(LARGURA, ALTURA));
                ImageIcon referencia = new ImageIcon("Imagem/teste.jpg");
                ImageIcon referencia2 = new ImageIcon("Imagem/x.jpg");
                ImageIcon referencia3 = new ImageIcon("Imagem/bola.png");
                fundo = referencia.getImage();
                fundox = referencia2.getImage();
                fundoy = referencia3.getImage();
                emJogo = true;
                timer = new Timer(1, this);
                timer.start();
                setBackground(Color.BLACK);
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                                Tabuleiro[i][j] = new JButton();
                                Tabuleiro[i][j].setIcon(new ImageIcon(fundo));
                                Tabuleiro[i][j].setText("c");
                        }
                }
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                                if (!Tabuleiro[i][j].getText().equals("c")) {

                                }

                        }
                }
                atulizar();
        }

        public void atulizar() {
                configurarUI();
        }

        public void setVencedor(boolean vencedor) {
                this.vencedor = vencedor;
        }

        public boolean getVencedor() {
                return vencedor;
        }

        public void vencedor() {
                if (Tabuleiro[0][0].getText().equals("X") && Tabuleiro[0][1].getText().equals("X")
                                && Tabuleiro[0][2].getText().equals("X")) {
                        JOptionPane.showMessageDialog(null, "X venceu");
                        setVencedor(true);

                }
                if (Tabuleiro[1][0].getText().equals("X") && Tabuleiro[1][1].getText().equals("X")
                                && Tabuleiro[1][2].getText().equals("X")) {
                        JOptionPane.showMessageDialog(null, "X venceu");
                        setVencedor(true);
                }
                if (Tabuleiro[2][0].getText().equals("X") && Tabuleiro[2][1].getText().equals("X")
                                && Tabuleiro[2][2].getText().equals("X")) {
                        JOptionPane.showMessageDialog(null, "X venceu");
                        setVencedor(true);

                }
                if (Tabuleiro[0][0].getText().equals("X") && Tabuleiro[1][0].getText().equals("X")
                                && Tabuleiro[2][0].getText().equals("X")) {
                        JOptionPane.showMessageDialog(null, "X venceu");
                        setVencedor(true);
                }
                if (Tabuleiro[0][1].getText().equals("X") && Tabuleiro[1][1].getText().equals("X")
                                && Tabuleiro[2][1].getText().equals("X")) {
                        JOptionPane.showMessageDialog(null, "X venceu");
                        setVencedor(true);
                }
                if (Tabuleiro[0][2].getText().equals("X") && Tabuleiro[1][2].getText().equals("X")
                                && Tabuleiro[2][2].getText().equals("X")) {
                        JOptionPane.showMessageDialog(null, "X venceu");
                        setVencedor(true);

                }
                if (Tabuleiro[0][0].getText().equals("X") && Tabuleiro[1][1].getText().equals("X")
                                && Tabuleiro[2][2].getText().equals("X")) {
                        JOptionPane.showMessageDialog(null, "X venceu");
                        setVencedor(true);

                }
                if (Tabuleiro[0][2].getText().equals("X") && Tabuleiro[1][1].getText().equals("X")
                                && Tabuleiro[2][0].getText().equals("X")) {
                        JOptionPane.showMessageDialog(null, "X venceu");
                        setVencedor(true);

                }
                if (Tabuleiro[0][0].getText().equals("O") && Tabuleiro[0][1].getText().equals("O")
                                && Tabuleiro[0][2].getText().equals("O")) {
                        JOptionPane.showMessageDialog(null, "O venceu");
                        setVencedor(true);

                }
                if (Tabuleiro[1][0].getText().equals("O") && Tabuleiro[1][1].getText().equals("O")
                                && Tabuleiro[1][2].getText().equals("O")) {
                        JOptionPane.showMessageDialog(null, "O venceu");
                        setVencedor(true);

                }
                if (Tabuleiro[2][0].getText().equals("O") && Tabuleiro[2][1].getText().equals("O")
                                && Tabuleiro[2][2].getText().equals("O")) {
                        JOptionPane.showMessageDialog(null, "O venceu");
                        setVencedor(true);

                }
                if (Tabuleiro[0][0].getText().equals("O") && Tabuleiro[1][0].getText().equals("O")
                                && Tabuleiro[2][0].getText().equals("O")) {
                        JOptionPane.showMessageDialog(null, "O venceu");
                        setVencedor(true);

                }
                if (Tabuleiro[0][1].getText().equals("O") && Tabuleiro[1][1].getText().equals("O")
                                && Tabuleiro[2][1].getText().equals("O")) {
                        JOptionPane.showMessageDialog(null, "O venceu");
                        setVencedor(true);

                }
                if (Tabuleiro[0][2].getText().equals("O") && Tabuleiro[1][2].getText().equals("O")
                                && Tabuleiro[2][2].getText().equals("O")) {
                        JOptionPane.showMessageDialog(null, "O venceu");
                        setVencedor(true);

                }
                if (Tabuleiro[0][0].getText().equals("O") && Tabuleiro[1][1].getText().equals("O")
                                && Tabuleiro[2][2].getText().equals("O")) {
                        JOptionPane.showMessageDialog(null, "O venceu");
                        setVencedor(true);

                }
                if (Tabuleiro[0][2].getText().equals("O") && Tabuleiro[1][1].getText().equals("O")
                                && Tabuleiro[2][0].getText().equals("O")) {
                        JOptionPane.showMessageDialog(null, "O venceu");
                        setVencedor(true);
                }

        }

        public int getI() {
                return i;
        }

        public boolean isEmJogo() {
                return emJogo;
        }

        public void setEmJogo(boolean emJogo) {
                this.emJogo = emJogo;
        }

        public void configurarUI() {
                setLayout(new GridLayout(3, 3));
                for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                                Tabuleiro[i][j].addActionListener(new BotaoClickListener());
                                add(Tabuleiro[i][j]);
                        }
                }
                setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                repaint();
        }

        // Classe interna para tratar os eventos de clique nos botões
        private class BotaoClickListener implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                        JButton botaoClicado = (JButton) e.getSource();
                        // Atualizar o texto do botão com base na condição
                        if (i % 2 == 0 && getVencedor() == false) {
                                if (botaoClicado.getText().equals("c")) {
                                        botaoClicado.setIcon(new ImageIcon(fundox));
                                        botaoClicado.setText("X");
                                        i++;
                                        vencedor();

                                } 
                        }
                        if (i % 2 != 0 && getVencedor() == false) {
                                if (botaoClicado.getText().equals("c")) {
                                        botaoClicado.setIcon(new ImageIcon(fundoy));
                                        botaoClicado.setText("O");
                                        i++;
                                        vencedor();
                                } 
                        }
                        if(getI() > 3 && getVencedor() == true) {
                                System.exit(0);
                        }
                        if (getI() == 9 && getVencedor() == false) {
                                JOptionPane.showMessageDialog(null, "Deu velha");
                                System.exit(0);
                        }

                }

                // vencedor();
                // Atualizar o contador a cada clique

        }
}
