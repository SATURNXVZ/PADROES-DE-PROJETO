package OBSERVER.EXERCICIOS.EX_A;

public class Teste {
    public static void main(String[] args) {
        Termometro t = new Termometro();
        t.attach(new DisplayCelsius());
        t.attach(new DisplayFahrenheit());
        t.setTemperatura(25.0);
    }
}
