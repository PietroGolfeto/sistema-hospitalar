import java.time.LocalDate;

public class Cirurgia extends Procedimento {
    String tipoCirurgia;

    public Cirurgia(Medico medico, LocalDate data,String tipoCirurgia){
        super(medico, data);
        this.tipoCirurgia = tipoCirurgia;
    }
}