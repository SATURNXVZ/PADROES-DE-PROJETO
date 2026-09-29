package OBSERVER.EXERCICIOS.EX_A;

public class DisplayFahrenheit implements Observer {
    
    @Override
    public void update(Double temperatura) {
        double fahrenheit = temperatura * 1.8 + 32;
        System.out.printf("Fahrenheit: %.1f\n", fahrenheit);   
    }
}
