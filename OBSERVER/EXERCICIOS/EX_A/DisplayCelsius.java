package OBSERVER.EXERCICIOS.EX_A;

public class DisplayCelsius implements Observer {


    @Override
    public void update(Double temperatura) {
        System.out.printf("\nCelsius %.1f°C\n",temperatura );
    }
}
