import java.time.LocalDate;

public class Paciente extends Pessoa {
    // Classe aninhada para representar o prontuário do paciente
    class Prontuario {
        private double altura;
        private double peso;
        private final String tipoSanguinio;

        public Prontuario(double altura, double peso, String tipoSanguinio) {
            this.altura = altura;
            this.peso = peso;
            this.tipoSanguinio = tipoSanguinio;
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
    }

    private Prontuario prontuario;
    private Convenio convenio;

    public Paciente(String cpf, String nome, String telefone, String email, String endereco, LocalDate dataNascimento,
            String genero, double altura, double peso, String tipoSanguinio) {
        super(cpf, nome, telefone, email, endereco, dataNascimento, genero);
        this.prontuario = new Prontuario(altura, peso, tipoSanguinio);
        // TO DO
        // O paciente não precisa ter um convenio, mas pode ter para obter desconto
        // LIXO PARA TESTAR MAIN -> REMOVER DEPOIS
        this.convenio = new Convenio(LocalDate.now(), 0.1);
    }

    // Construtor sem parâmetros para manipulação de arquivos
    public Paciente() {
        super();
        this.prontuario = new Prontuario(0.0, 0.0, "nada");
        this.convenio = new Convenio(LocalDate.now(), 0.1);
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
        Convenio newConvenio = new Convenio(dataValidade, multiplicadorDesconto);
        setConvenio(newConvenio);
    }
}
