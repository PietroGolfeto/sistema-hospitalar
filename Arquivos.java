
import java.util.ArrayList;
public interface Arquivos<T> {
    public ArrayList<String> ler(T objeto);

    public T escrever(T objeto);
}
