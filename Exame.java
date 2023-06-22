import java.time.LocalDate;

public class Exame extends Procedimento {
    private String descricaoExame;
    private String conclusao;
    private boolean modificarDiagnostico;

    public Exame(Medico medicoExame, LocalDate data, String descricaoExame, String conclusao) {
        super(medicoExame, data);
        this.descricaoExame = descricaoExame;
        this.conclusao = conclusao;
        this.modificarDiagnostico = false;
    }

    public Exame() {
        super(new Medico(), LocalDate.now());
        this.descricaoExame = "";
        this.conclusao = "";
        this.modificarDiagnostico = false;
    }

    // public modificarDiagnostico(String doenca, String descricao, Medico medico){
    //     // TO DO
    //     // Procedimet
    //     Diagnostico diagnostico = super.medico.procurarConsultaDiagnostico(super.paciente);
    // }
}