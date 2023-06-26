package Menus;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JSeparator;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

public class MenuGerenciamentoMedico {

    private JFrame frmMenuDeGerenciamento;
    ArrayList<String> consultas = new ArrayList<>();
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Create the application.
     */
    public MenuGerenciamentoMedico() {
        consultas.add("Consulta 1");
        consultas.add("Consulta 2");
        consultas.add("Consulta 3");
        initialize();
    }

    /**
     * try {
     * MenuGerenciamentoMedico window = new MenuGerenciamentoMedico();
     * window.frmMenuDeGerenciamento.setVisible(true);
     * } catch (Exception e) {
     * e.printStackTrace();
     * }
     */

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmMenuDeGerenciamento = new JFrame();
        frmMenuDeGerenciamento.setTitle("Menu de Gerenciamento - Medico");
        frmMenuDeGerenciamento.setBounds(100, 100, 945, 568);
        frmMenuDeGerenciamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMenuDeGerenciamento.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 11, 911, 511);
        frmMenuDeGerenciamento.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("MEDICO X");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(0, 10, 911, 63);
        panel.add(lblNewLabel);

        JLabel lblHospitalAlbert = new JLabel("Hospital - Albert Einstein");
        lblHospitalAlbert.setHorizontalAlignment(SwingConstants.CENTER);
        lblHospitalAlbert.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblHospitalAlbert.setBounds(0, 54, 911, 46);
        panel.add(lblHospitalAlbert);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(10, 98, 891, 403);
        panel.add(tabbedPane);

        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("Consultas", null, panel_1, null);
        panel_1.setLayout(null);

        JLabel lblListaConsultas = new JLabel("Lista de Consultas");
        lblListaConsultas.setHorizontalAlignment(SwingConstants.CENTER);
        lblListaConsultas.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblListaConsultas.setBounds(10, 6, 417, 26);
        panel_1.add(lblListaConsultas);

        JList<String> listaConsultas = new JList<String>();
        listaConsultas.setBounds(10, 42, 417, 283);
        panel_1.add(listaConsultas);

        JButton btnGerarDiagnostico = new JButton("Gerar Diagnostico");
        btnGerarDiagnostico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnGerarDiagnostico.setBounds(616, 282, 145, 43);
        panel_1.add(btnGerarDiagnostico);

        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setForeground(Color.BLACK);
        separator.setBackground(Color.BLACK);
        separator.setBounds(454, 3, 2, 404);
        panel_1.add(separator);

        JLabel lblGerarDiagnostico = new JLabel("Gerar Diagnostico");
        lblGerarDiagnostico.setHorizontalAlignment(SwingConstants.CENTER);
        lblGerarDiagnostico.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblGerarDiagnostico.setBounds(454, 6, 432, 26);
        panel_1.add(lblGerarDiagnostico);

        JLabel lblNewLabel_1 = new JLabel("Doenca:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblNewLabel_1.setBounds(493, 77, 110, 26);
        panel_1.add(lblNewLabel_1);

        JLabel lblMedicoProcedimento = new JLabel("Medico Procedimento:");
        lblMedicoProcedimento.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblMedicoProcedimento.setBounds(493, 131, 165, 26);
        panel_1.add(lblMedicoProcedimento);

        JComboBox boxMedicoAtendente_1 = new JComboBox(new Object[] {});
        boxMedicoAtendente_1.setBounds(669, 136, 121, 21);
        panel_1.add(boxMedicoAtendente_1);

        textField_1 = new JTextField();
        textField_1.setBounds(579, 83, 272, 19);
        panel_1.add(textField_1);
        textField_1.setColumns(10);

        JPanel panel_2 = new JPanel();
        tabbedPane.addTab("Gerar Consulta", null, panel_2, null);
        panel_2.setLayout(null);

        JButton btnNewButton = new JButton("Gerar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton.setBounds(393, 331, 130, 35);
        panel_2.add(btnNewButton);

        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(742, 114, 112, 19);
        panel_2.add(textField);

        JLabel lblFormatoData = new JLabel("(DD/MM/YYYY)");
        lblFormatoData.setHorizontalAlignment(SwingConstants.CENTER);
        lblFormatoData.setBounds(742, 90, 112, 25);
        panel_2.add(lblFormatoData);

        JLabel lblData = new JLabel("Data:");
        lblData.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblData.setBounds(677, 109, 112, 26);
        panel_2.add(lblData);

        JLabel lblMedicoAtendente = new JLabel("Medico Atendente:");
        lblMedicoAtendente.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblMedicoAtendente.setBounds(313, 108, 165, 26);
        panel_2.add(lblMedicoAtendente);

        JComboBox boxMedicoAtendente = new JComboBox(new Object[] {});
        boxMedicoAtendente.setBounds(489, 113, 121, 21);
        panel_2.add(boxMedicoAtendente);

        JComboBox boxPaciente = new JComboBox(new Object[] {});
        boxPaciente.setBounds(123, 113, 121, 21);
        panel_2.add(boxPaciente);

        JLabel lblPaciente = new JLabel("Paciente:");
        lblPaciente.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lblPaciente.setBounds(22, 108, 112, 26);
        panel_2.add(lblPaciente);

        JLabel lblNewLabel_2 = new JLabel("Nova Consulta");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblNewLabel_2.setBounds(0, 10, 886, 35);
        panel_2.add(lblNewLabel_2);
        final DefaultListModel<String> model = new DefaultListModel<>();
        for (int i = 0; i < consultas.size(); i++) {
            model.addElement(consultas.get(i));
        }

        String[] listaPacientes = { "...", "Paciente A", "Paciente B", "Paciente C" };

        String[] listaMedicos = { "...", "Medico A", "Medico B", "Medico C" };
    }
}
