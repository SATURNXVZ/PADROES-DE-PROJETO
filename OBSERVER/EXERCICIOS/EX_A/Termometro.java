package OBSERVER.EXERCICIOS.EX_A;

import java.util.ArrayList;
import java.util.List;

public class Termometro implements Subject {
    private double temperatura;
    private List<Observer> temperaturas = new ArrayList<>();

    
    @Override
    public void attach(Observer o) {
        this.temperaturas.add(o);
    }

    @Override
    public void dettach(Observer o) {
        this.temperaturas.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : this.temperaturas){
            o.update(this.temperatura);
        }
    }

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
        this.notifyObservers();
    }
}
