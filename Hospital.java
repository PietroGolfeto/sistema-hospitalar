
import java.util.ArrayList;
import java.util.Random;

public class Hospital {
    ArrayList<Medico> listaMedicos;
    ArrayList<Paciente> listaPacientes;
    ArrayList<Consulta> listaConsultas;
    String tipo;
    final String cnpj;
    final int id;
    String nome;
    double receita;

    // Hospital sem id, gera id aleatório e único
    public Hospital(String tipo, String nome, String cnpj) {
        ArquivosOperacao admin = new ArquivosOperacao();
        Random random = new Random();
        int id = random.nextInt(1000);

        // Gera id aleatorio, checa se já existe no CSV
        ArrayList<String> listaIdHospital = admin.ler(new Hospital());
        while (listaIdHospital.contains(Integer.toString(id))) {
            id = random.nextInt(1000);
        }
        this.id = id;

        this.listaMedicos = new ArrayList<Medico>();
        this.listaPacientes = new ArrayList<Paciente>();
        this.listaConsultas = new ArrayList<Consulta>();
        this.tipo = tipo;
        this.nome = nome;
        this.cnpj = cnpj;
        this.receita = 0.0;
    }

    // Hospital com id
    public Hospital(String tipo, String nome, String cnpj, int id) {
        this.id = id;
        this.listaMedicos = new ArrayList<Medico>();
        this.listaPacientes = new ArrayList<Paciente>();
        this.listaConsultas = new ArrayList<Consulta>();
        this.tipo = tipo;
        this.nome = nome;
        this.cnpj = cnpj;
        this.receita = 0.0;
    }

    // Construtor sem parâmetros para inicializar objeto
    public Hospital() {
        this.tipo = "";
        this.nome = "";
        this.cnpj = "";
        this.id = -1;
        this.receita = 0.0;
        this.listaMedicos = new ArrayList<Medico>();
        this.listaPacientes = new ArrayList<Paciente>();
        this.listaConsultas = new ArrayList<Consulta>();
    }

    public void calcularReceita() {
        // Percore consultas e soma o valor
        double receitaHospital = 0.0;
        for (int i = 0; i < listaConsultas.size(); i++) {
            receitaHospital += listaConsultas.get(i).getValor();
        }
        setReceita(receitaHospital);
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

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }

}