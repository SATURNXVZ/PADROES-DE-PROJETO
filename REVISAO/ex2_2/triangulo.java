package REVISAO.ex2_2;

public class triangulo extends forma{
    public double result;

    public triangulo(String name, double base, double height){
        super(name, base, height);
    }
    
    @Override
    public void calcArea(){
        result = (base * height) /2;
        System.out.printf("Area do %s é: %f \n\n", name, result); 
    }

}
 