
import java.util.ArrayList;
import java.util.List;

public abstract class absObservado {

    protected List<absObservador> listaObservadores = new ArrayList<>();

    public abstract void inscreve(absObservador observador);

    public abstract void remove(absObservador observador);

}
