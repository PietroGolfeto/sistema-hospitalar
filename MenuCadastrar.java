import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuCadastrar extends JFrame {
    protected JTextArea areaTexto;

    public MenuCadastrar() {
        setTitle("Sistema de gerenciamento hospitalar");

        JPanel painel = new JPanel();

        painel.setLayout(new GridBagLayout());

        JLabel labelNome = new JLabel();

        labelNome.setText("Digite o nome: ");
        JTextArea campoNome = new JTextArea(8, 25);

        painel.add(labelNome);
        painel.add(painel, campoNome, ABORT);

        add(painel);
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
