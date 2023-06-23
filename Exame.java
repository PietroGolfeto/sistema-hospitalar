import java.time.LocalDate;

public class Exame extends Procedimento {
    private String descricaoExame;
    private String conclusao;

    public Exame(Medico medicoExame, LocalDate data, String descricaoExame, String conclusao, int idConsulta) {
        super(medicoExame, data, idConsulta);
        this.descricaoExame = descricaoExame;
        this.conclusao = conclusao;
    }

    public Exame() {
        super(new Medico(), LocalDate.now(), -1);
        this.descricaoExame = "";
        this.conclusao = "";
    }
}