import java.util.ArrayList;

public abstract class Hospital {
    ArrayList<Medico> listaMedicos;
    ArrayList<Paciente> listaPacientes;
    ArrayList<Consulta> listaConsultas;
    String tipo;
    final String cnpj;
    final int id;
    String nome;
    double receita;

    public Hospital(String tipo, String nome, String cnpj) {
        // TO DO
        // Gera id aleatorio, checa se já existe no CSV
        this.id = 0;

        this.listaMedicos = new ArrayList<Medico>();
        this.listaPacientes = new ArrayList<Paciente>();
        this.listaConsultas = new ArrayList<Consulta>();
        this.tipo = tipo;
        this.nome = nome;
        this.cnpj = cnpj;
        receita = 0.0;
    }

    public void calcularReceita() {
        double receitaSum = 0.0;
        for (int i = 0; i < listaConsultas.size(); i++) {
            receitaSum += listaConsultas.get(i).getValor();
        }
        this.receita = receitaSum;
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

    public void setListaMedicos(ArrayList<Medico> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }

    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public void setListaConsultas(ArrayList<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }

}