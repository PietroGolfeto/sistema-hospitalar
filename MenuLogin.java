import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MenuLogin extends JFrame{

    private JTextField fieldCPFPaciente;
    private JTextField fieldHospitalMedico;
    ArrayList<Hospital> hospital = ArquivosOperacao.lerArquivoHospital();

    // Inicializa o menu de login
    public MenuLogin(){

        setTitle("Menu de Login");
        setBounds(100, 100, 987, 605);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(10, 37, 953, 521);
        getContentPane().add(tabbedPane);

        JPanel panel = new JPanel();
        tabbedPane.addTab("Login Paciente", null, panel, null);
        panel.setLayout(null);

        JLabel lblHospital = new JLabel("Selecione um Hospital:");
        lblHospital.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblHospital.setBounds(10, 130, 260, 29);
        panel.add(lblHospital);

        JComboBox<String> boxHospitalPaciente = new JComboBox<>();
        for (int i = 0; i < hospital.size(); i++) {
            boxHospitalPaciente.addItem(hospital.get(i).getNome());
        }
        boxHospitalPaciente.setBounds(221, 136, 144, 21);
        panel.add(boxHospitalPaciente);

        JLabel lblNewLabel = new JLabel("Login - Paciente");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(0, 0, 948, 40);
        panel.add(lblNewLabel);

        JLabel lblCPFPaciente = new JLabel("Digite o CPF do Paciente:");
        lblCPFPaciente.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblCPFPaciente.setBounds(10, 191, 260, 34);
        panel.add(lblCPFPaciente);

        fieldCPFPaciente = new JTextField();
        fieldCPFPaciente.setBounds(269, 203, 232, 19);
        panel.add(fieldCPFPaciente);
        fieldCPFPaciente.setColumns(10);

        JList<String> listaErrosPaciente = new JList<>();
        final DefaultListModel<String> modelPaciente = new DefaultListModel<>();

        listaErrosPaciente.setBounds(697, 398, 241, 86);
        panel.add(listaErrosPaciente);
        listaErrosPaciente.setModel(modelPaciente);

        JButton btnPaciente = new JButton("Login");
        btnPaciente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                modelPaciente.addElement("Paciente nao encontrado");
            }
        });
        btnPaciente.setBounds(428, 423, 123, 40);
        panel.add(btnPaciente);

        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("Login Medico", null, panel_1, null);
        panel_1.setLayout(null);

        JLabel lblLoginMedico = new JLabel("Login - Medico");
        lblLoginMedico.setHorizontalAlignment(SwingConstants.CENTER);
        lblLoginMedico.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblLoginMedico.setBounds(0, 0, 948, 40);
        panel_1.add(lblLoginMedico);

        JComboBox<String> boxHospitalMedico = new JComboBox<>();
        for (int i = 0; i < hospital.size(); i++) {
            boxHospitalMedico.addItem(hospital.get(i).getNome());
        }
        boxHospitalMedico.setBounds(221, 136, 144, 21);
        panel_1.add(boxHospitalMedico);

        JLabel lblHospital_1 = new JLabel("Selecione um Hospital:");
        lblHospital_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblHospital_1.setBounds(10, 130, 260, 29);
        panel_1.add(lblHospital_1);

        JLabel lblCPFMedico = new JLabel("Digite o CPF do Medico:");
        lblCPFMedico.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblCPFMedico.setBounds(10, 191, 260, 34);
        panel_1.add(lblCPFMedico);

        fieldHospitalMedico = new JTextField();
        fieldHospitalMedico.setColumns(10);
        fieldHospitalMedico.setBounds(249, 203, 232, 19);
        panel_1.add(fieldHospitalMedico);

        JList<String> listaErrosMedico = new JList<>();
        final DefaultListModel<String> modelMedico = new DefaultListModel<>();
        listaErrosMedico.setBounds(697, 398, 241, 86);
        panel_1.add(listaErrosMedico);
        listaErrosMedico.setModel(modelMedico);

        JButton btnMedico = new JButton("Login");
        btnMedico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuGerenciamentoMedico.getMenuGerenciamentoMedico();
            }
        });
        btnMedico.setBounds(428, 423, 123, 40);
        panel_1.add(btnMedico);

    }

    public static void getMenuLogin() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuLogin window = new MenuLogin();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
