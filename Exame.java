import java.time.LocalDate;

public class Exame extends Procedimento {
    String descricaoExame;

    public Exame(Medico medicoExame, LocalDate data), Strign descricaoExame {
        super(medicoExame, data);
        this.descricaoExame = descricaoExame;
    }
}