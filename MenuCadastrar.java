import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuCadastrar extends JFrame {
    protected JTextArea areaTexto;

    public MenuCadastrar() {
        setTitle("Sistema de gerenciamento hospitalar");

        JPanel painel = new JPanel();

        JTextField campoNome = new JTextField(10);
        painel.add(painel, campoNome, ABORT);
    }
}