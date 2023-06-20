import java.util.ArrayList;

public abstract class Hospital {
    ArrayList<Medico> listaMedicos;
    ArrayList<Consulta> listaConsultas;
    ArrayList<Paciente> listaPacientes;
    String tipo;
    final int id;
    String nome;


    public Hospital(String tipo, String nome) {
        // TO DO
        // Gera id aleatorio, checa se já existe no CSV
        this.id = 0;
        
        this.listaMedicos = new ArrayList<Medico>();
        this.listaConsultas = new ArrayList<Consulta>();
        this.listaPacientes = new ArrayList<Paciente>();
        this.tipo = tipo;
        this.nome = nome;
    }


    public ArrayList<Medico> getListaMedicos() {
        return this.listaMedicos;
    }

    public ArrayList<Consulta> getListaConsultas() {
        return this.listaConsultas;
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