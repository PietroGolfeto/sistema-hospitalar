import java.util.ArrayList;
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
        ArquivosOperacao admin = new ArquivosOperacao();

        Random rand = new Random();
        // Gera um id aleatorio para a consulta, checa se já existe no CSV e gera outro caso exista
        int id = rand.nextInt(1000);
        ArrayList<String> listaIdConsulta = admin.ler(new Consulta());
        while (listaIdConsulta.contains(Integer.toString(id))) {
            id = rand.nextInt(1000);
        }
        this.id = id;
        
        this.paciente = paciente;
        // Inicialmente nao ha um diagnostico, sendo necessario que o medico com
        // acesso a essa consulta o gere
        valor = 200.0 * this.paciente.getConvenio().getMultiplicadorDesconto();
        this.diagnostico = null;
        this.medicoAtendimento = medicoAtendimento;
        this.data = data;
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