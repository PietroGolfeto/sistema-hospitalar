import java.util.Random;
public class Diagnostico {
    String doenca;
    String descricao;
    Medico medico;
    Procedimento procedimento;
    final int id;

    // Todo diagnostico tera um procedimento prescrito para o paciente
    public Diagnostico(String doenca, String descricao, Medico medico, Procedimento procedimento) {
        Random random = new Random();
        this.id = random.nextInt(1000);
        this.doenca = doenca;
        this.descricao = descricao;
        this.medico = medico;
        this.procedimento = procedimento;
    }

    public Diagnostico() {
        Random random = new Random();
        this.id = random.nextInt(1000);
        this.doenca = "";
        this.descricao = "";
        this.medico = new Medico();
        // TO DO
        // Não pode instanciar classe abstrata
        // this.procedimento = new Procedimento();
        this.procedimento = new Exame();
    }
}