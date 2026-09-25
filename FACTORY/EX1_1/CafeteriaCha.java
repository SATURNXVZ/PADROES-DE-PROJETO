package FACTORY.EX1_1;

public class CafeteriaCha extends Cafeteria {
    
    @Override 
    public Bebida criarBebida(){
        return new Cha();
    }
}
