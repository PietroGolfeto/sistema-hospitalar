import java.time.LocalDate;

public class Convenio {
    final int codigo;
    LocalDate dataValidade;
    double multiplicadorDesconto;

    public Convenio(int codigo, LocalDate dataValidade, double multiplicadorDesconto) {
        this.codigo = codigo;        
        this.dataValidade = dataValidade;
        this.multiplicadorDesconto = multiplicadorDesconto;
    }
    
    // Construtor sem parâmetros para manipulação de arquivos
    public Convenio() {
        this(0, LocalDate.now(), 0.0);
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