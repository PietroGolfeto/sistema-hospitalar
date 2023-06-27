import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuPrincipal extends JFrame {
    protected ArquivosOperacao admin = new ArquivosOperacao();
    protected JTextArea areaTexto;
    protected ArrayList<String> textoMenu = new ArrayList<>();

    public MenuPrincipal() {
        setTitle("Sistema de gerenciamento hospitalar");

        // Cria o painel
        JPanel painel = new JPanel();
        areaTexto = new JTextArea(40, 100);
        JScrollPane scroll = new JScrollPane(areaTexto);
        painel.add(scroll);

        // Define os botoes
        JButton botaoListar = new JButton("Listar");
        JButton botaoCadastrar = new JButton("Cadastrar");
        JButton botaoSair = new JButton("Sair");

        botaoSair.addActionListener(e -> {
            System.out.println("clicou em Sair");
            System.exit(0);
        });

        botaoListar.addActionListener(e -> {
            System.out.println("clicou em Listar");
            JPopupMenu submenuListar = new JPopupMenu();

            JMenuItem itemPaciente = new JMenuItem("Paciente");
            JMenuItem itemMedico = new JMenuItem("Médico");
            JMenuItem itemConsulta = new JMenuItem("Consulta");
            JMenuItem itemConvenio = new JMenuItem("Convênio");

            itemPaciente.addActionListener(submenuListarActionListener);
            itemMedico.addActionListener(submenuListarActionListener);
            itemConsulta.addActionListener(submenuListarActionListener);
            itemConvenio.addActionListener(submenuListarActionListener);

            submenuListar.add(itemPaciente);
            submenuListar.add(itemMedico);
            submenuListar.add(itemConsulta);
            submenuListar.add(itemConvenio);

            submenuListar.show(botaoListar, 0, botaoListar.getHeight());
        });

        botaoCadastrar.addActionListener(e -> {
            System.out.println("Clicou em cadastrar");
            try {
                MenuCadastrar.getMenuDeCadastro();
            } catch (Exception k) {
                System.err.println(k.getMessage());
                System.exit(0);
            }
        });

        painel.add(botaoListar);
        painel.add(botaoCadastrar);
        painel.add(botaoSair);

        add(painel);

        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private ActionListener submenuListarActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem item = (JMenuItem) e.getSource();
            String textoItem = item.getText();

            StringBuilder textoListar = new StringBuilder();

            if (textoItem.equals("Paciente")) {

                System.out.println("clicou em Listar Paciente");
                setTextoMenu(admin.ler(new Paciente()));

            } else if (textoItem.equals("Médico")) {
                System.out.println("clicou em Listar Médico");
                setTextoMenu(admin.ler(new Medico()));

            } else if (textoItem.equals("Consulta")) {
                System.out.println("clicou em Listar Consulta");
                setTextoMenu(admin.ler(new Consulta()));

            } else if (textoItem.equals("Convênio")) {
                System.out.println("clicou em Listar Convênio");
                setTextoMenu(admin.ler(new Convenio()));

            } else {
                System.out.println("clicou em Listar");
                // TO DO
                // Mensagem de erro
            }

            // -----------------------------------------------------------------
            // FUNCIONANDO
            // Atualiza o JTextArea do menu utilizando o StringBuilder
            int lastIndex = textoMenu.size() - 1;
            if (lastIndex >= 0) {
                textoListar.append(textoMenu.get(lastIndex)).append("\n");
            }
            areaTexto.setText(textoListar.toString());

            // Limpa o StringBuilder
            textoListar.setLength(0);

            // Vai para o final do JTextArea
            areaTexto.setCaretPosition(areaTexto.getDocument().getLength());
            // -----------------------------------------------------------------
        }
    };

    public ArrayList<String> getTextoMenu() {
        return textoMenu;
    }

    public void setTextoMenu(ArrayList<String> textoMenu) {
        this.textoMenu.clear(); // Limpa a lista
        this.textoMenu.addAll(textoMenu); // Adiciona os dados da lista passada como parâmetro
    }
}

// botaoPaciente.addActionListener(e -> {
// System.out.println("clicou em Paciente");
// });

// botaoMedico.addActionListener(e -> {
// System.out.println("clicou em Médico");
// });

// botaoConsulta.addActionListener(e -> {
// System.out.println("clicou em Consulta");
// });

// botaoConvenio.addActionListener(e -> {
// System.out.println("clicou em Convênio");
// });

// painel.add(botaoPaciente);
// painel.add(botaoMedico);
// painel.add(botaoConsulta);
// painel.add(botaoConvenio);

// JButton botaoPaciente = new JButton("Paciente");
// JButton botaoMedico = new JButton("Médico");
// JButton botaoConsulta = new JButton("Consulta");
// JButton botaoConvenio = new JButton("Convênio");