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

    // TO DO - ERRO NA IMPRESSÃO DO MENU, PRECISA CLICAR EM QUALQUER BOTÃO APÓS SELECIONAR O LISTAR PACIENTE PARA IMPRIMIR NA CAIXA DE TEXTO
    public MenuPrincipal() {
        setTitle("Sistema de gerenciamento hospitalar");

        JPanel painel = new JPanel();
        areaTexto = new JTextArea(50, 50);
        JScrollPane scroll = new JScrollPane(areaTexto);
        painel.add(scroll);
        
        JButton botaoListar = new JButton("Listar");
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
            // TO DO - ERRO NA IMPRESSÃO DO MENU LISTAR PACIENTE, ESTÁ ACUMULANDO STRING AO INVÉS DE IMPRIMIR POR LINHA
            for (String linha : textoMenu) {
                areaTexto.append(linha + "\n");
            }
        });
        
        painel.add(botaoListar);
        painel.add(botaoSair);


        add(painel);

        setSize(1200, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private ActionListener submenuListarActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem item = (JMenuItem) e.getSource();
            String textoItem = item.getText();

            // TO DO
            // setTextoMenu tá funcionando certinho
            // mas não tá atualizando o texto na tela
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
            }
        }
    };

    public ArrayList<String> getTextoMenu() {
        return textoMenu;
    }

    public void setTextoMenu(ArrayList<String> textoMenu) {
        this.textoMenu = textoMenu;
    }    
}

        // botaoPaciente.addActionListener(e -> {
        //     System.out.println("clicou em Paciente");
        // });

        // botaoMedico.addActionListener(e -> {
        //     System.out.println("clicou em Médico");
        // });

        // botaoConsulta.addActionListener(e -> {
        //     System.out.println("clicou em Consulta");
        // });

        // botaoConvenio.addActionListener(e -> {
        //     System.out.println("clicou em Convênio");
        // });

        
        // painel.add(botaoPaciente);
        // painel.add(botaoMedico);
        // painel.add(botaoConsulta);
        // painel.add(botaoConvenio);

                // JButton botaoPaciente = new JButton("Paciente");
        // JButton botaoMedico = new JButton("Médico");
        // JButton botaoConsulta = new JButton("Consulta");
        // JButton botaoConvenio = new JButton("Convênio");