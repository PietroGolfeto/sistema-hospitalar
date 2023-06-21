public class Consulta {
    Paciente paciente;
    Diagnostico diagnostico;
    Medico medico;

    public Consulta(Paciente paciente, Diagnostico diagnostico, Medico medico) {
        this.paciente = paciente;
        this.diagnostico = diagnostico;
        this.medico = medico;
    }

    public Consulta() {
        this.paciente = new Paciente();
        this.diagnostico = new Diagnostico();
        this.medico = new Medico();
    }

}