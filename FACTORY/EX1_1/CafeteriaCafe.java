package FACTORY.EX1_1;

public class CafeteriaCafe extends Cafeteria {
    
    @Override 
    public Bebida criarBebida(){
        return new Cafe();
    }
}
