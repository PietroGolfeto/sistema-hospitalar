import java.time.LocalDate;
import java.util.Random;

public class Convenio {
    final int codigo;
    LocalDate dataValidade;
    double multiplicadorDesconto;

    public Convenio(LocalDate dataValidade, double multiplicadorDesconto) {
        Random random = new Random();
        this.codigo = random.nextInt(1000);
        this.dataValidade = dataValidade;
        this.multiplicadorDesconto = multiplicadorDesconto;
    }
    
    // Construtor sem parâmetros para manipulação de arquivos
    public Convenio() {
        this(LocalDate.now(), 0.9);
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
}