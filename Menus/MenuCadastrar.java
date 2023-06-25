import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;
import javax.swing.JCheckBox;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuCadastrar extends JFrame {
    protected JTextArea areaTexto;

    public MenuCadastrar() {
        setTitle("Sistema de gerenciamento hospitalar");

        JPanel painel = new JPanel();

        JButton botaoOpcao = new JButton("Escolher opcao");

        botaoOpcao.addActionListener(e -> {
            System.out.println("Clicou em cadastrar");
            JPopupMenu submenuOpcao = new JPopupMenu();

            JMenuItem itemPaciente = new JMenuItem("Paciente");
            JMenuItem itemMedico = new JMenuItem("Medico");
            JMenuItem itemHospital = new JMenuItem("Hospital");

            // Cadastrar Paciente
            itemPaciente.addActionListener(k -> {
                System.out.println("Clicou em cadastrar paciente");
                painel.setLayout(new GridLayout(2, 10));

                // TO DO
                // Criar uma check box com uma lista de todos os hospitais disponiveis no csv para cadastrar o paciente
                Hospital hospital = null;

                // Label
                JLabel labelNome = new JLabel("Digite o nome: ");
                JLabel labelCPF = new JLabel("Digite o cpf: ");

                // Input
                JTextArea campoNome = new JTextArea(8, 30);
                JTextArea campoCPF = new JTextArea(8, 11);

                // Nome
                painel.add(labelNome);
                painel.add(campoNome);

                // CPF
                painel.add(labelCPF);
                painel.add(campoCPF);

                // etc
            });

            // Cadastrar Medico
            itemMedico.addActionListener(k -> {
                System.out.println("Clicou em cadastrar medico")
            });
            itemHospital.addActionListener(k -> {
                System.out.println("ok");
            });

            submenuOpcao.add(itemPaciente);
            submenuOpcao.add(itemMedico);
            submenuOpcao.add(itemHospital);

            submenuOpcao.show(botaoOpcao, 0, botaoOpcao.getHeight());
        });

        painel.add(botaoOpcao);

        add(painel);
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // private ActionListener submenuCadastrarActionListener = new ActionListener()
    // {
    // @Override
    // public void actionPerformed(ActionEvent e) {
    // JMenuItem item = (JMenuItem) e.getSource();
    // String textoItem = item.getText();

    // switch (item.getText()) {
    // case "paciente": {

    // }
    // break;
    // }
    // }
    // };
}
