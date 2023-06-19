import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class Paciente extends Pessoa {
    // Classe aninhada para representar o prontuário do paciente
    class Prontuario {
        public double altura;
        double peso;
        String tipoSanguinio;

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

        public void setTipoSanguinio(String tipoSanguinio) {
            this.tipoSanguinio = tipoSanguinio;
        }
    }

    Prontuario prontuario;
    Convenio convenio;

    public Paciente(String cpf, String nome, String telefone, String email, String endereco, LocalDate dataNascimento,
            String genero, double altura, double peso, String tipoSanguinio) {
        super(cpf, nome, telefone, email, endereco, dataNascimento, genero);
        prontuario = new Prontuario(altura, peso, tipoSanguinio);
        // TO DO
        // O paciente não precisa ter um convenio, mas pode ter para obter desconto
        this.convenio = null;
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

    public void atualizarConvenio(int codigo, LocalDate dataValidade, double multiplicadorDesconto) {
        Convenio newConvenio = new Convenio(codigo, dataValidade, multiplicadorDesconto);
        setConvenio(newConvenio);
    }

    @Override
    public void ler() {
        System.out.println("Lendo arquivo: ");
        File file = new File("arquivos/Paciente.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linha = br.readLine();
            while ((linha = br.readLine()) != null) {
                // TO DO
                // Imprimir dados no menu, ao invés do terminal
                System.out.println(linha);
                String[] dados = linha.split(",");
                System.out.println("CPF: " + dados[0]);
                System.out.println("Nome: " + dados[1]);
                System.out.println("Telefone: " + dados[2]);
                System.out.println("Email: " + dados[3]);
                System.out.println("Endereco: " + dados[4]);
                System.out.println("Data de Nascimento: " + dados[5]);
                System.out.println("Genero: " + dados[6]);
                System.out.println();
            }
        } catch (IOException e) {
            // TO DO
            // Tratar exceção; não pode só imprimir mensagem de erro
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void escrever() {
        System.out.println("");
    }
}
