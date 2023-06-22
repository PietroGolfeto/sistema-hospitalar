import java.time.LocalDate;
import java.util.Random;

public abstract class Procedimento {
    Medico medico;
    LocalDate data;
    final int id;

    public Procedimento(Medico medico, LocalDate data) {
        Random random = new Random();
        int id = random.nextInt();
        this.medico = medico;
        this.data = data;
        this.id = id;
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