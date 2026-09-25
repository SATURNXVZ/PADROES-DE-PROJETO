package FACTORY.EX1_1;

public class Cha implements Bebida {
    
    @Override 
    public void preparar(){
        System.out.println("Criando Chá!");
    }
}
