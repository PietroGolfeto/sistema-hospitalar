
import java.time.LocalDate;
import java.util.Random;

public class Consulta {
    final int id;
    Paciente paciente;
    Diagnostico diagnostico;
    Medico medicoAtendimento;
    LocalDate data;
    double valor;

    public Consulta(Paciente paciente, Medico medicoAtendimento, LocalDate data) {
        Random rand = new Random();
        this.paciente = paciente;
        // Inicialmente nao ha um diagnostico, sendo necessario que o medico que possui
        // acesso a consulta o gere
        valor = 200.0 * this.paciente.getConvenio().getMultiplicadorDesconto();
        this.diagnostico = null;
        this.medicoAtendimento = medicoAtendimento;
        this.data = data;
        this.id = (int) (rand.nextFloat() * Math.pow(10, 6));
    }

    public Consulta() {
        this.paciente = new Paciente();
        this.diagnostico = new Diagnostico();
        this.medicoAtendimento = new Medico();
        this.id = -1;
        this.valor = 0.0;
        this.data = LocalDate.now();
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId() {
        return this.id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Medico getMedicoAtendimento() {
        return medicoAtendimento;
    }

    public void setMedicoAtendimento(Medico medicoAtendimento) {
        this.medicoAtendimento = medicoAtendimento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void atualizarDiagnostico(String descricao, Medico medicoAtendimento, int id) {
        Diagnostico newDiagnostico = new Diagnostico(descricao, medicoAtendimento, id);
        this.diagnostico = newDiagnostico;
    }
}