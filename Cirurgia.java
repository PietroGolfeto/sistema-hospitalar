import java.time.LocalDate;

public class Cirurgia extends Procedimento {
    String tipoCirurgia;

    public Cirurgia(Medico medicoCirurgiao, LocalDate data, String tipoCirurgia, int idConsulta) {
        super(medicoCirurgiao, data, idConsulta);
        this.tipoCirurgia = tipoCirurgia;
    }
}