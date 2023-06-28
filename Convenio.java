import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Random;

public class Convenio {
    final int codigo;
    private LocalDate dataValidade;
    private String nome;
    private double multiplicadorDesconto;

    // Convênio com código gerado de forma aleatória
    public Convenio(LocalDate dataValidade, String nome, double multiplicadorDesconto) {
        ArquivosOperacao admin = new ArquivosOperacao();
        Random random = new Random();
        // Gera um código aleatório para o convênio, checa se já existe no CSV e gera outro caso exista
        int codigo = random.nextInt(1000);
        ArrayList<String> listaCodigoConvenio = admin.ler(new Convenio());
        while (listaCodigoConvenio.contains(Integer.toString(codigo))) {
            codigo = random.nextInt(1000);
        }
        this.codigo = codigo;

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
        this.codigo = -1;
        this.nome = "";
        this.dataValidade = LocalDate.now();
        this.multiplicadorDesconto = 0.1;
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