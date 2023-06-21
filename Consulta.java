import java.time.LocalDate;

public class Consulta {
    Paciente paciente;
    Diagnostico diagnostico;
    Medico medico;
    LocalDate data;

    public Consulta(Paciente paciente, Diagnostico diagnostico, Medico medico, LocalDate data) {
        this.paciente = paciente;
        this.diagnostico = diagnostico;
        this.medico = medico;
        this.data = data;
    }

    public Consulta() {
        this.paciente = new Paciente();
        this.diagnostico = new Diagnostico();
        this.medico = new Medico();
    }

}