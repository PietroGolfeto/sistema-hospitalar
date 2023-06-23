import java.time.LocalDate;

public class Diagnostico {
    String doenca;
    String descricao;
    Medico medicoAtendimento;
    Procedimento procedimento;
    int idConsulta;

    // Todo diagnostico tera um procedimento prescrito para o paciente
    public Diagnostico(String doenca, String descricao, Medico medicoAtendimento,
            int idConsulta) {
        this.idConsulta = idConsulta;
        this.doenca = doenca;
        this.descricao = descricao;
        this.medicoAtendimento = medicoAtendimento;
        this.procedimento = null;
    }

    public Diagnostico() {
        this.idConsulta = -1;
        this.doenca = "";
        this.descricao = "";
        this.medicoAtendimento = new Medico();
        // TO DO
        // Não pode instanciar classe abstrata
        // this.procedimento = new Procedimento();
        this.procedimento = new Exame();
    }

    // atualizarProcedimento cria um novo procedimento (exame/cirurgia) e direciona
    // a consulta para o novo medico (necessario para poder acessar e atualizar
    // continuamente o diagnostico do paciente com cada novo procedimento realizado,
    // caso necessario)
    public void atualizarProcedimento(Medico medicoExame, LocalDate data, String descricaoExame, String conclusao) {
        Exame exame = new Exame(medicoExame, data, descricaoExame, conclusao, this.idConsulta);

        // Remove a consulta do medicoAtendimento e passa a mesma para o medicoExame;
        Consulta consulta = medicoAtendimento.getConsultaByID(idConsulta);
        for (int i = 0; i < medicoAtendimento.getListaConsultas().size(); i++) {
            if (medicoAtendimento.getListaConsultas().get(i).equals(consulta)) {
                medicoAtendimento.getListaConsultas().remove(i);
                medicoExame.getListaConsultas().add(consulta);
                break;
            }
        }
        this.procedimento = exame;
    }

    public void atualizarProcedimento(Medico medicoCirurgia, LocalDate data, String tipoCirurgia) {
        Cirurgia cirurgia = new Cirurgia(medicoCirurgia, data, tipoCirurgia, this.idConsulta);
        // Remove a consulta do medicoAtendimento e passa a mesma para o medicoCirurgia;
        Consulta consulta = medicoAtendimento.getConsultaByID(idConsulta);
        for (int i = 0; i < medicoAtendimento.getListaConsultas().size(); i++) {
            if (medicoAtendimento.getListaConsultas().get(i).equals(consulta)) {
                medicoAtendimento.getListaConsultas().remove(i);
                medicoCirurgia.getListaConsultas().add(consulta);
                break;
            }
        }
        this.procedimento = cirurgia;
    }
}