public class Diagnostico {
    String doenca;
    String descricao;
    Medico medico;
    Procedimento procedimento;
    final int id;

    // Todo diagnostico tera um procedimento prescrito para o paciente
    public Diagnostico(String doenca, String descricao, Procedimento procedimento) {
        this.doenca = doenca;
        this.descricao = descricao;
        this.procedimento = procedimento;
    }

    public Diagnostico() {
        super();
        this.doenca = "";
        this.descricao = "";
        this.medico = null;
        this.procedimento = null;
    }
}