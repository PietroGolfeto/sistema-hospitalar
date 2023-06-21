import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends Pessoa {
    final String CRM;
    String areaAtuacao;
    ArrayList<Consulta> listaConsultas;

    public Medico(String cpf, String nome, String telefone, String email, String endereco, LocalDate dataNascimento,
            String genero, String CRM, String areaAtuacao) {
        super(cpf, nome, telefone, email, endereco, dataNascimento, genero);
        this.CRM = CRM;
        this.areaAtuacao = areaAtuacao;
        this.listaConsultas = new ArrayList<Consulta>();
    }

    // Construtor sem parâmetros para manipulação de arquivos
    public Medico() {
        super();
        this.CRM = null;
        this.areaAtuacao = null;
        this.listaConsultas = new ArrayList<Consulta>();
    }

    public Diagnostico gerarDiagnostico(String doenca, String descricao, Medico medico) {
        return null;
    }

    public String getCRM() {
        return CRM;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public ArrayList<Consulta> getListaConsultas() {
        return listaConsultas;
    }
}