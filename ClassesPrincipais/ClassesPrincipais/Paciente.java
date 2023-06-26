package ClassesPrincipais;
import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Pessoa {
    // Classe aninhada para representar o prontuário do paciente
    public class Prontuario {
        private double altura;
        private double peso;
        private final String tipoSanguinio;
        private ArrayList<Procedimento> listaProcedimentos;

        public Prontuario(double altura, double peso, String tipoSanguinio) {
            this.altura = altura;
            this.peso = peso;
            this.tipoSanguinio = tipoSanguinio;
            this.listaProcedimentos = new ArrayList<Procedimento>();
        }

        public double getAltura() {
            return altura;
        }

        public double getPeso() {
            return peso;
        }

        public String getTipoSanguinio() {
            return tipoSanguinio;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public ArrayList<Procedimento> getListaProcedimentos() {
            return listaProcedimentos;
        }

    }

    private Prontuario prontuario;
    private Convenio convenio;

    public Paciente(String cpf, String nome, String telefone, String endereco, String email, LocalDate dataNascimento,
            String genero, double altura, double peso, String tipoSanguinio, Convenio convenio) {
        super(cpf, nome, telefone, email, endereco, dataNascimento, genero);
        this.prontuario = new Prontuario(altura, peso, tipoSanguinio);
        // O paciente terá convênio particular (código 000000) caso não possua convênio
        this.convenio = convenio;
    }

    // Construtor sem parâmetros para manipulação de arquivos
    public Paciente() {
        super();
        this.prontuario = new Prontuario(0.0, 0.0, "nada");
        this.convenio = new Convenio(LocalDate.now(), "teste", 0.1);
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public void atualizarProntuario(double altura, double peso, String tipoSanguinio) {
        Prontuario newProntuario = new Prontuario(altura, peso, tipoSanguinio);
        setProntuario(newProntuario);
    }

    public void atualizarConvenio(LocalDate dataValidade, double multiplicadorDesconto) {
        Convenio newConvenio = new Convenio(dataValidade, this.getConvenio().getNome(), multiplicadorDesconto);
        setConvenio(newConvenio);
    }
}
