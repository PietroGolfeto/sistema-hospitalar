import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JToggleButton;
import java.awt.Insets;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Choice;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuCadastrar {

    private JFrame frmMenuDeCadastro;
    private JTextField fieldNome;
    private JTextField fieldCPF;
    private JTextField fieldTelefone;
    private JTextField fieldEmail;
    private JTextField fieldEndereco;
    private JTextField fieldDataNascimento;
    private JTextField fieldAltura;
    private JTextField fieldPeso;
    private JTextField fieldNomeMedico;
    private JTextField fieldCPFMedico;
    private JTextField fieldTelefoneMedico;
    private JTextField fieldEmailMedico;
    private JTextField fieldEnderecoMedico;
    private JTextField fieldDataNascimentoMedico;
    private JTextField fieldAreaAtuacaoMedico;
    private JTextField fieldCRMMedico;
    private JTextField fieldNomeHospital;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuCadastrar window = new MenuCadastrar();
                    window.frmMenuDeCadastro.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public MenuCadastrar() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmMenuDeCadastro = new JFrame();
        frmMenuDeCadastro.setTitle("Menu de Cadastro");
        frmMenuDeCadastro.setBounds(100, 100, 966, 561);
        frmMenuDeCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMenuDeCadastro.getContentPane().setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(10, 10, 932, 504);
        frmMenuDeCadastro.getContentPane().add(tabbedPane);

        JPanel panel = new JPanel();
        tabbedPane.addTab("Paciente", null, panel, null);
        panel.setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblNome.setBounds(10, 41, 76, 49);
        panel.add(lblNome);

        fieldNome = new JTextField();
        fieldNome.setBounds(77, 57, 292, 19);
        panel.add(fieldNome);
        fieldNome.setColumns(10);

        JLabel lblCPF = new JLabel("CPF:");
        lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblCPF.setBounds(10, 100, 76, 49);
        panel.add(lblCPF);

        fieldCPF = new JTextField();
        fieldCPF.setColumns(10);
        fieldCPF.setBounds(58, 119, 130, 19);
        panel.add(fieldCPF);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblTelefone.setBounds(10, 159, 141, 49);
        panel.add(lblTelefone);

        fieldTelefone = new JTextField();
        fieldTelefone.setColumns(10);
        fieldTelefone.setBounds(103, 178, 141, 19);
        panel.add(fieldTelefone);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblEmail.setBounds(10, 218, 76, 49);
        panel.add(lblEmail);

        fieldEmail = new JTextField();
        fieldEmail.setColumns(10);
        fieldEmail.setBounds(77, 234, 240, 19);
        panel.add(fieldEmail);

        JLabel lblEndereco = new JLabel("Endereco:");
        lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblEndereco.setBounds(10, 277, 116, 49);
        panel.add(lblEndereco);

        fieldEndereco = new JTextField();
        fieldEndereco.setColumns(10);
        fieldEndereco.setBounds(113, 296, 256, 19);
        panel.add(fieldEndereco);

        JLabel lblDataDeNacimento = new JLabel("Data de Nacimento:");
        lblDataDeNacimento.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblDataDeNacimento.setBounds(10, 336, 191, 49);
        panel.add(lblDataDeNacimento);

        JLabel lblGenero = new JLabel("Genero Biologico:");
        lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblGenero.setBounds(10, 395, 207, 49);
        panel.add(lblGenero);

        fieldDataNascimento = new JTextField();
        fieldDataNascimento.setToolTipText("cgf");
        fieldDataNascimento.setBounds(189, 355, 96, 19);
        panel.add(fieldDataNascimento);
        fieldDataNascimento.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("dd/MM/AA");
        lblNewLabel_1.setBounds(211, 336, 74, 13);
        panel.add(lblNewLabel_1);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(765, 414, 141, 53);
        panel.add(btnCadastrar);

        Box verticalBox = Box.createVerticalBox();
        verticalBox.setBounds(461, 79, -8, -37);
        panel.add(verticalBox);

        JSeparator separator = new JSeparator();
        separator.setBackground(new Color(0, 0, 0));
        separator.setForeground(new Color(0, 0, 0));
        separator.setBounds(461, 471, -8, -428);
        panel.add(separator);

        fieldAltura = new JTextField();
        fieldAltura.setColumns(10);
        fieldAltura.setBounds(550, 119, 89, 19);
        panel.add(fieldAltura);

        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblAltura.setBounds(483, 100, 76, 49);
        panel.add(lblAltura);

        fieldPeso = new JTextField();
        fieldPeso.setColumns(10);
        fieldPeso.setBounds(537, 178, 104, 19);
        panel.add(fieldPeso);

        JLabel lblPeso = new JLabel("Peso:");
        lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblPeso.setBounds(483, 159, 141, 49);
        panel.add(lblPeso);

        JLabel lblTipoSanguinio = new JLabel("Tipo Sanguinio:");
        lblTipoSanguinio.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblTipoSanguinio.setBounds(483, 218, 167, 49);
        panel.add(lblTipoSanguinio);

        JSeparator separator_1 = new JSeparator();
        separator_1.setForeground(new Color(0, 0, 0));
        separator_1.setOrientation(SwingConstants.VERTICAL);
        separator_1.setBackground(new Color(0, 0, 0));
        separator_1.setBounds(461, 57, 12, 390);
        panel.add(separator_1);

        JLabel lblProntuario = new JLabel("Prontuario");
        lblProntuario.setFont(new Font("Tahoma", Font.PLAIN, 23));
        lblProntuario.setBounds(643, 49, 128, 30);
        panel.add(lblProntuario);

        String[] tiposSanguinios = { "...", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" };
        final JComboBox boxTipoSanguinio = new JComboBox(tiposSanguinios);
        boxTipoSanguinio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(boxTipoSanguinio.getSelectedItem());
            }
        });
        boxTipoSanguinio.setBounds(634, 236, 43, 21);
        panel.add(boxTipoSanguinio);

        ArrayList<String> hospitais = new ArrayList<String>();
        hospitais.add("...");
        hospitais.add("Albert Einstein");
        hospitais.add("Hospital das Clinicas");

        final JComboBox boxHospital = new JComboBox();
        for (int i = 0; i < hospitais.size(); i++) {
            boxHospital.addItem(hospitais.get(i));
            System.out.println("Item added");
        }

        boxHospital.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(boxHospital.getSelectedItem());
            }
        });
        boxHospital.setToolTipText("");
        boxHospital.setBounds(672, 295, 141, 21);
        panel.add(boxHospital);

        JLabel lblEscolhaUmHospital = new JLabel("Escolha um Hospital:");
        lblEscolhaUmHospital.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblEscolhaUmHospital.setBounds(483, 277, 269, 49);
        panel.add(lblEscolhaUmHospital);

        String[] generosPossiveis = { "...", "Masculino", "Feminino" };
        final JComboBox boxGenero = new JComboBox(generosPossiveis);
        boxGenero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(boxGenero.getSelectedItem());
            }
        });
        boxGenero.setBounds(167, 413, 98, 21);
        panel.add(boxGenero);

        JLabel lblTitlePaciente = new JLabel("Paciente");
        lblTitlePaciente.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblTitlePaciente.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitlePaciente.setBounds(302, 10, 326, 32);
        panel.add(lblTitlePaciente);

        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("Medico", null, panel_1, null);
        panel_1.setLayout(null);

        JLabel lblNomeMedico = new JLabel("Nome:");
        lblNomeMedico.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblNomeMedico.setBounds(10, 41, 76, 49);
        panel_1.add(lblNomeMedico);

        fieldNomeMedico = new JTextField();
        fieldNomeMedico.setColumns(10);
        fieldNomeMedico.setBounds(77, 57, 292, 19);
        panel_1.add(fieldNomeMedico);

        fieldCPFMedico = new JTextField();
        fieldCPFMedico.setColumns(10);
        fieldCPFMedico.setBounds(58, 119, 130, 19);
        panel_1.add(fieldCPFMedico);

        JLabel lblCPFMedico = new JLabel("CPF:");
        lblCPFMedico.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblCPFMedico.setBounds(10, 100, 76, 49);
        panel_1.add(lblCPFMedico);

        fieldTelefoneMedico = new JTextField();
        fieldTelefoneMedico.setColumns(10);
        fieldTelefoneMedico.setBounds(103, 178, 141, 19);
        panel_1.add(fieldTelefoneMedico);

        JLabel lblTelefoneMedico = new JLabel("Telefone:");
        lblTelefoneMedico.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblTelefoneMedico.setBounds(10, 159, 141, 49);
        panel_1.add(lblTelefoneMedico);

        JLabel lblEmailMedico = new JLabel("Email:");
        lblEmailMedico.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblEmailMedico.setBounds(10, 218, 76, 49);
        panel_1.add(lblEmailMedico);

        fieldEmailMedico = new JTextField();
        fieldEmailMedico.setColumns(10);
        fieldEmailMedico.setBounds(77, 234, 240, 19);
        panel_1.add(fieldEmailMedico);

        fieldEnderecoMedico = new JTextField();
        fieldEnderecoMedico.setColumns(10);
        fieldEnderecoMedico.setBounds(113, 296, 256, 19);
        panel_1.add(fieldEnderecoMedico);

        JLabel lblEnderecoMedico = new JLabel("Endereco:");
        lblEnderecoMedico.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblEnderecoMedico.setBounds(10, 277, 116, 49);
        panel_1.add(lblEnderecoMedico);

        JLabel lblDataDeNacimentoMedico = new JLabel("Data de Nacimento:");
        lblDataDeNacimentoMedico.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblDataDeNacimentoMedico.setBounds(10, 336, 191, 49);
        panel_1.add(lblDataDeNacimentoMedico);

        JLabel lblNewLabel_1_1 = new JLabel("dd/MM/AA");
        lblNewLabel_1_1.setBounds(211, 336, 74, 13);
        panel_1.add(lblNewLabel_1_1);

        fieldDataNascimentoMedico = new JTextField();
        fieldDataNascimentoMedico.setToolTipText("cgf");
        fieldDataNascimentoMedico.setColumns(10);
        fieldDataNascimentoMedico.setBounds(189, 355, 96, 19);
        panel_1.add(fieldDataNascimentoMedico);

        String[] generosPossiveisMedico = { "...", "Masculino", "Feminino", "LGBTQIA+" };

        final JComboBox boxGeneroMedico = new JComboBox(generosPossiveisMedico);
        boxGeneroMedico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(boxGeneroMedico.getSelectedItem());
            }
        });
        boxGeneroMedico.setBounds(91, 413, 98, 21);
        panel_1.add(boxGeneroMedico);

        JLabel lblGeneroMedico = new JLabel("Genero:");
        lblGeneroMedico.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblGeneroMedico.setBounds(10, 395, 207, 49);
        panel_1.add(lblGeneroMedico);

        JLabel lblEscolhaUmHospitalMedico = new JLabel("Escolha um Hospital:");
        lblEscolhaUmHospitalMedico.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblEscolhaUmHospitalMedico.setBounds(483, 218, 269, 49);
        panel_1.add(lblEscolhaUmHospitalMedico);

        final JComboBox boxHospitalMedico = new JComboBox();
        boxHospitalMedico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(boxHospitalMedico.getSelectedItem());
            }
        });
        for (int i = 0; i < hospitais.size(); i++) {
            boxHospitalMedico.addItem(hospitais.get(i));
        }

        boxHospitalMedico.setToolTipText("");
        boxHospitalMedico.setBounds(672, 236, 141, 21);
        panel_1.add(boxHospitalMedico);

        JLabel lblAreaAtuacaoMedico = new JLabel("Area de Atuacao:");
        lblAreaAtuacaoMedico.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblAreaAtuacaoMedico.setBounds(483, 159, 207, 49);
        panel_1.add(lblAreaAtuacaoMedico);

        fieldAreaAtuacaoMedico = new JTextField();
        fieldAreaAtuacaoMedico.setColumns(10);
        fieldAreaAtuacaoMedico.setBounds(645, 178, 104, 19);
        panel_1.add(fieldAreaAtuacaoMedico);

        fieldCRMMedico = new JTextField();
        fieldCRMMedico.setColumns(10);
        fieldCRMMedico.setBounds(541, 119, 89, 19);
        panel_1.add(fieldCRMMedico);

        JLabel lblCRMMedico = new JLabel("CRM:");
        lblCRMMedico.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblCRMMedico.setBounds(483, 100, 76, 49);
        panel_1.add(lblCRMMedico);

        JButton btnCadastrarMedico = new JButton("Cadastrar");
        btnCadastrarMedico.setBounds(765, 414, 141, 53);
        panel_1.add(btnCadastrarMedico);

        JSeparator separator_1_1 = new JSeparator();
        separator_1_1.setOrientation(SwingConstants.VERTICAL);
        separator_1_1.setForeground(Color.BLACK);
        separator_1_1.setBackground(Color.BLACK);
        separator_1_1.setBounds(461, 57, 12, 390);
        panel_1.add(separator_1_1);

        JLabel lblInformacoesProfissionaisMedico = new JLabel("Informacoes Profissionais");
        lblInformacoesProfissionaisMedico.setFont(new Font("Tahoma", Font.PLAIN, 23));
        lblInformacoesProfissionaisMedico.setBounds(573, 49, 344, 30);
        panel_1.add(lblInformacoesProfissionaisMedico);

        JLabel lblTitleMedico = new JLabel("Medico");
        lblTitleMedico.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitleMedico.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblTitleMedico.setBounds(297, 10, 326, 32);
        panel_1.add(lblTitleMedico);

        JPanel panel_2 = new JPanel();
        tabbedPane.addTab("Hospital", null, panel_2, null);
        panel_2.setLayout(null);

        fieldNomeHospital = new JTextField();
        fieldNomeHospital.setColumns(10);
        fieldNomeHospital.setBounds(77, 58, 292, 19);
        panel_2.add(fieldNomeHospital);

        JLabel lblNomeHospital = new JLabel("Nome:");
        lblNomeHospital.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblNomeHospital.setBounds(10, 42, 76, 49);
        panel_2.add(lblNomeHospital);

        JLabel lblTipoHospital = new JLabel("Tipo:");
        lblTipoHospital.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblTipoHospital.setBounds(10, 101, 76, 49);
        panel_2.add(lblTipoHospital);

        String[] tiposHospital = { "...", "Primario", "Secundario", "Terciario" };
        final JComboBox boxTipoHospital = new JComboBox(tiposHospital);
        boxTipoHospital.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(boxTipoHospital.getSelectedItem());
            }
        });
        boxTipoHospital.setBounds(77, 119, 76, 21);
        panel_2.add(boxTipoHospital);

        JLabel lblTitleHospital = new JLabel("Hospital");
        lblTitleHospital.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitleHospital.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblTitleHospital.setBounds(300, 10, 326, 32);
        panel_2.add(lblTitleHospital);

        JButton btnCadastrarMedico_1 = new JButton("Cadastrar");
        btnCadastrarMedico_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnCadastrarMedico_1.setBounds(765, 414, 141, 53);
        panel_2.add(btnCadastrarMedico_1);
    }
}
