public class Diagnostico{
    String doenca;
    String descricao;
    Medico medico;
    Procedimento procedimento;

    public Diagnostico(String doenca, String descricao, Procedimento procedimento){
        this.doenca = doenca;
        this.descricao = descricao;
        this.procedimento = procedimento;
    }
}