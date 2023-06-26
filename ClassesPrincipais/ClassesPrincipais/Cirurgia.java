package ClassesPrincipais;
import java.time.LocalDate;

public class Cirurgia extends Procedimento {
    String tipoCirurgia;
    Medico medicoCirurgia;

    public Cirurgia(String nome, String sala, Medico medicoCirurgia, LocalDate data, String tipoCirurgia,
            int idConsulta) {
        super(nome, data, sala, idConsulta, medicoCirurgia);
        this.tipoCirurgia = tipoCirurgia;
    }

    public String getTipoCirurgia() {
        return this.tipoCirurgia;
    }

    public void setTipoCirurgia(String tipoCirurgia) {
        this.tipoCirurgia = tipoCirurgia;
    }

    public Medico getMedicoCirurgia() {
        return medicoCirurgia;
    }

    public void setMedicoCirurgia(Medico medicoCirurgia) {
        this.medicoCirurgia = medicoCirurgia;
    }

}