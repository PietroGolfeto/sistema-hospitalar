import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends Pessoa {
    final String CRM;
    String areaAtuacao;
    ArrayList<Paciente> listaPacientes;

    public Medico(String cpf, String nome, String telefone, String email, String endereco, LocalDate dataNascimento,
            String genero, String CRM, String areaAtuacao) {
        super(cpf, nome, telefone, email, endereco, dataNascimento, genero);
        this.CRM = CRM;
        this.areaAtuacao = areaAtuacao;
        this.listaPacientes = new ArrayList<Paciente>();
    }

    // Construtor sem parâmetros para manipulação de arquivos
    public Medico() {
        super();
        this.CRM = null;
        this.areaAtuacao = null;
        this.listaPacientes = new ArrayList<Paciente>();
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

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }
}