package OBSERVER.EXERCICIOS.EX_A;

public interface Subject {
    
    void attach(Observer o);
    void dettach(Observer o);
    public void notifyObservers();
    
}
