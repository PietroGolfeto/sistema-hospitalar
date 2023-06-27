
import java.time.LocalDate;

public class Diagnostico {

    String doenca;
    Medico medicoAtendimento;
    Procedimento procedimento;
    int idConsulta;

    // Todo diagnostico tera um procedimento prescrito para o paciente
    public Diagnostico(String doenca, Medico medicoAtendimento,
            int idConsulta) {
        this.idConsulta = idConsulta;
        this.doenca = doenca;
        this.medicoAtendimento = medicoAtendimento;
        this.procedimento = null;
    }

    public Diagnostico() {
        this.idConsulta = -1;
        this.doenca = "";
        this.medicoAtendimento = new Medico();
        // TO DO
        // Não pode instanciar classe abstrata
        // this.procedimento = new Procedimento();
        this.procedimento = new Exame();
    }

    // gerarProcedimento cria um novo procedimento (exame/cirurgia) e direciona
    // a consulta para o novo medico (necessario para poder acessar o diagnostico do
    // paciente e realizar o procedimento)
    public void gerarExame(String nome, String sala, Medico medicoExame, LocalDate data,
            String laudo) {
        Exame exame = new Exame(nome, sala, medicoExame, data, laudo, this.idConsulta);

        // Remove a consulta do medicoAtendimento e passa a mesma para o medicoExame;
        Consulta consulta = medicoAtendimento.getConsultaByID(idConsulta);
        for (int i = 0; i < medicoAtendimento.getListaConsultas().size(); i++) {
            if (medicoAtendimento.getListaConsultas().get(i).equals(consulta)) {
                medicoAtendimento.getListaConsultas().remove(i);
                medicoExame.getListaConsultas().add(consulta);
                break;
            }
        }
        setProcedimento(exame);

    }

    public void gerarCirurgia(String nome, String sala, Medico medicoCirurgia, LocalDate data,
            String tipoCirurgia) {
        Cirurgia cirurgia = new Cirurgia(nome, sala, medicoCirurgia, data, tipoCirurgia, this.idConsulta);
        // Remove a consulta do medicoAtendimento e passa a mesma para o medicoCirurgia;
        Consulta consulta = medicoAtendimento.getConsultaByID(idConsulta);
        for (int i = 0; i < medicoAtendimento.getListaConsultas().size(); i++) {
            if (medicoAtendimento.getListaConsultas().get(i).equals(consulta)) {
                medicoAtendimento.getListaConsultas().remove(i);
                medicoCirurgia.getListaConsultas().add(consulta);
                break;
            }
        }
        setProcedimento(cirurgia);

    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public Medico getMedicoAtendimento() {
        return medicoAtendimento;
    }

    public void setMedicoAtendimento(Medico medicoAtendimento) {
        this.medicoAtendimento = medicoAtendimento;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

}