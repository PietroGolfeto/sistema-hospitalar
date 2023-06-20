import java.time.LocalDate;

public abstract class Procedimento{
    Medico medico;
    LocalDate data;

    public Procedimento(Medico medico, LocalDate data) {
        this.medico = medico;
        this.data = data;
    }
}