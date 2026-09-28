
import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject {

    private List<Observer> assinantes = new ArrayList<>();
    private String tituloAtual;

    @Override
    public void attach(Observer o) {
        assinantes.add(o);
    }

    @Override
    public void dettach(Observer o) {
        assinantes.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : assinantes) {
            o.update(tituloAtual);
        }
    }

    public void publicar(String titulo) {
        this.tituloAtual = titulo; //guard o atual
        notifyObservers(); //notifica todods depois de guardar atual
    }

}
