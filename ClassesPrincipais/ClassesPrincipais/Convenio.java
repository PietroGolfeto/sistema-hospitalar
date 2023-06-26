package ClassesPrincipais;
import java.time.LocalDate;
import java.util.Random;

public class Convenio {
    final int codigo;
    LocalDate dataValidade;
    String nome;
    double multiplicadorDesconto;

    // Convênio com código gerado de forma aleatória
    public Convenio(LocalDate dataValidade, String nome, double multiplicadorDesconto) {
        Random random = new Random();
        this.codigo = random.nextInt(1000);
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.multiplicadorDesconto = multiplicadorDesconto;
    }

    // Convênio instanciado do CSV já possui código
    public Convenio(int codigo, String nome, LocalDate dataValidade, double multiplicadorDesconto) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.multiplicadorDesconto = multiplicadorDesconto;
    }

    // Construtor sem parâmetros para manipulação de arquivos
    public Convenio() {
        this(LocalDate.now(), "teste", 0.9);
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public double getMultiplicadorDesconto() {
        return multiplicadorDesconto;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setMultiplicadorDesconto(double multiplicadorDesconto) {
        this.multiplicadorDesconto = multiplicadorDesconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}