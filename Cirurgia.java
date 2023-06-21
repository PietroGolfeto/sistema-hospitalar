import java.time.LocalDate;

public class Cirurgia extends Procedimento {
    String tipoCirurgia;

    public Cirurgia(Medico medicoCirurgiao, LocalDate data, String tipoCirurgia) {
        super(medicoCirurgiao, data);
        this.tipoCirurgia = tipoCirurgia;
    }
}