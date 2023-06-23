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

    // atualizarDiagnostico cria um novo diagnostico e o associa a consulta do
    // cliente
    public void atualizarDiagnostico(String doenca, String descricao, Medico medicoExame, LocalDate data,
            String descricaoExame, String conclusao) {
        // Note que pode haver um atualizacao do medico responsavel por fazer o
        // procedimento
        Diagnostico diagnostico = new Diagnostico(doenca, descricaoExame, medicoExame, this.idConsulta);
        diagnostico.atualizarProcedimento(medicoExame, data, descricaoExame, conclusao);
        this.medicoProcedimento.getConsultaByID(idConsulta);
    }

    public void atualizarDiagnostico(String doenca, String descricao, Medico medicoCirurgia, LocalDate data,
            String tipoCirurgia) {
        // Note que pode haver um atualizacao do medico responsavel por fazer o
        // procedimento
        Diagnostico diagnostico = new Diagnostico(doenca, descricao, medicoCirurgia, idConsulta);
        diagnostico.atualizarProcedimento(medicoCirurgia, data, tipoCirurgia);
        this.medicoProcedimento.getConsultaByID(idConsulta);
    }

}