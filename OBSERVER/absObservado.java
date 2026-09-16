public class abstract absObservado{
    
    protected List<absObservador> listaObservadores = new ArrayList<>();


    public abstract void inscreve(absObservador observador);
    public abstract void remove(absObservador observador);

}