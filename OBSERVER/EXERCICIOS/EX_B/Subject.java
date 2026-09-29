package OBSERVER.EXERCICIOS.EX_B;

public interface Subject {
    
    void attach(Observer o);
    void dettach(Observer o);
    void notifyObservers();

    
}
