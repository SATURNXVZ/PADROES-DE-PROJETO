package REVISAO.ex2_2;

public class forma {
    public String name;
    public double base;
    public double height;

    private double result;
 
    public forma(String name, double base, double height){
        this.name = name;
        this.base = base;
        this.height = height;
    }

    public void print(){
        System.out.printf("Forma: %s", name);
    }

    public void calcArea(){
        result = base * height;
        System.out.printf("Area do %s é: %f ", name, result); 
    }
}
