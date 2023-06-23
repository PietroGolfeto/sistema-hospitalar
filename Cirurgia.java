import java.time.LocalDate;

public class Cirurgia extends Procedimento {
    String tipoCirurgia;

    public Cirurgia(Medico medicoCirurgia, LocalDate data, String tipoCirurgia, int idConsulta) {
        super(medicoCirurgia, data, idConsulta);
        this.tipoCirurgia = tipoCirurgia;
    }

    public String getTipoCirurgia() {
        return this.tipoCirurgia;
    }

    public void setTipoCirurgia(String tipoCirurgia) {
        this.tipoCirurgia = tipoCirurgia;
    }

}