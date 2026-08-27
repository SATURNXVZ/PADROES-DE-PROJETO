package REVISAO.ex2_2;

public class circulo extends forma {
    private double raio;
    private double PI = 3.14159;

    public circulo(String name, double raio){
        super(name, 0, 0);
        this.raio  = raio;
    }

    @Override
    public void calcArea() {
        double result = PI * raio * raio;
        System.out.printf("Area do %s é: %f ", name, result); 
    }
}
