package ClassesPrincipais;
import java.time.LocalDate;

public abstract class Procedimento {
    String nome;
    LocalDate data;
    String sala;
    int idConsulta;
    Medico medicoProcedimento;

    public Procedimento(String nome, LocalDate data, String sala, int idConsulta, Medico medicoProcedimento) {
        this.medicoProcedimento = medicoProcedimento;
        this.data = data;
        this.idConsulta = idConsulta;
        this.nome = nome;
        this.sala = sala;
    }

    public Procedimento() {
        this.medicoProcedimento = new Medico();
        this.data = LocalDate.now();
        this.idConsulta = -1;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return this.sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
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

}