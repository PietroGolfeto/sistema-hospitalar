package ClassesPrincipais;
import java.time.LocalDate;

public abstract class Pessoa{
    protected final String cpf;
    protected String nome;
    protected String telefone;
    protected String email;
    protected String endereco;
    protected LocalDate dataNascimento;
    protected String genero;

    public Pessoa(String cpf, String nome, String telefone, String email, String endereco, LocalDate dataNascimento,
            String genero) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    // Construtor sem parâmetros para manipulação de arquivos
    public Pessoa() {
        this(null, null, null, null, null, LocalDate.now(), null);
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
