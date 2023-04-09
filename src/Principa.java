import javax.swing.*;






public class Principa extends JFrame {
    public static void main(String[] args) throws Exception {        
        new Principa();
    }
        Principa() {
        add(new TelaGame());
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        paintComponents(getGraphics());
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
}