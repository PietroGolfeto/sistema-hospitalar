import java.time.LocalDate;

public abstract class Procedimento {
    Medico medico;
    LocalDate data;

    public Procedimento(Medico medico, LocalDate data) {
        this.medico = medico;
        this.data = data;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}