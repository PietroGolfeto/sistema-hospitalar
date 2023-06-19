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

    public void ler() {
        System.out.println("Lendo");
    }

    public void escrever() {
        System.out.println("Escrevendo");
    }

    // Generate getters and setters
}