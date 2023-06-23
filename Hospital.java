import java.util.ArrayList;

public abstract class Hospital {
    ArrayList<Medico> listaMedicos;
    ArrayList<Paciente> listaPacientes;
    String tipo;
    final String cnpj;
    final int id;
    String nome;

    public Hospital(String tipo, String nome, String cnpj) {
        // TO DO
        // Gera id aleatorio, checa se já existe no CSV
        this.id = 0;

        this.listaMedicos = new ArrayList<Medico>();
        this.listaPacientes = new ArrayList<Paciente>();
        this.tipo = tipo;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public ArrayList<Medico> getListaMedicos() {
        return this.listaMedicos;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return this.listaPacientes;
    }

    public String getClassificacao() {
        return this.tipo;
    }

    public void setClassificacao(String classificacao) {
        this.tipo = classificacao;
    }

}