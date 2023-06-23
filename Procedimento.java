import java.time.LocalDate;

public abstract class Procedimento {
    Medico medicoProcedimento;
    LocalDate data;
    int idConsulta;

    public Procedimento(Medico medicoProcedimento, LocalDate data, int idConsulta) {
        this.medicoProcedimento = medicoProcedimento;
        this.data = data;
        this.idConsulta = idConsulta;
    }

    public Procedimento() {
        this.medicoProcedimento = new Medico();
        this.data = LocalDate.now();
        this.idConsulta = -1;
    }

    public Medico getMedicoProcedimento() {
        return this.medicoProcedimento;
    }

    public void setMedicoProcedimento(Medico medico) {
        this.medicoProcedimento = medico;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getIdConsulta() {
        return this.idConsulta;
    }

    public void atualizarDiagnostico(String doenca, String descricao, Medico medicoExame, LocalDate data,
            String descricaoExame, String conclusao) {
        Diagnostico diagnostico = new Diagnostico(doenca, descricaoExame, medicoExame, this.idConsulta);
        diagnostico.atualizarProcedimento(medicoExame, data, descricaoExame, conclusao);
        this.medicoProcedimento.getConsultaByID(idConsulta);
    }

}