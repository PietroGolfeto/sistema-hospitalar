import java.time.LocalDate;
import java.util.Random;

public class Consulta {
    final int id;
    Paciente paciente;
    Diagnostico diagnostico;
    Medico medicoAtendimento;
    LocalDate data;

    public Consulta(Paciente paciente, Medico medicoAtendimento, LocalDate data) {
        Random rand = new Random();
        this.paciente = paciente;
        // Inicialmente nao ha um diagnostico, sendo necessario que o medico que possui
        // acesso a consulta o gere
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
    }

    public int getId() {
        return this.id;
    }

    public void atualizarDiagnostico(String doenca, String descricao, Medico medicoAtendimento, int id) {
        Diagnostico newDiagnostico = new Diagnostico(doenca, descricao, medicoAtendimento, id);
        this.diagnostico = newDiagnostico;
    }

    public boolean gerarProcedimento(Medico medicoExame, LocalDate data, String descricaoExame, String conclusao) {
        if (this.diagnostico == null) {
            return false;
        }
        this.diagnostico.atualizarProcedimento(medicoExame, data, descricaoExame, conclusao);
        return true;
    }

    public boolean gerarProcedimento(Medico medicoCirurgia, LocalDate data, String tipoCirurgia) {
        if (this.diagnostico == null) {
            return false;
        }

        this.diagnostico.atualizarProcedimento(medicoCirurgia, data, tipoCirurgia);
        return true;
    }
}