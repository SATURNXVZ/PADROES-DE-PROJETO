package FACTORY.EX1_1;

public class Cafe implements Bebida {
    
    @Override 
    public void preparar(){
        System.out.println("Criando Café!");
    }
}
