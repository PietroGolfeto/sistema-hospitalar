import java.time.LocalDate;

public class Exame extends Procedimento {
    private String laudo;

    public Exame(String nome, String sala, Medico medicoExame, LocalDate data, String laudo,
            int idConsulta) {
        super(nome, data, sala, idConsulta, medicoExame);
        this.laudo = laudo;
    }

    public Exame() {
        super("", LocalDate.now(), "", -1, new Medico());
        this.laudo = "";
    }

    public String getLaudo() {
        return this.laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

}