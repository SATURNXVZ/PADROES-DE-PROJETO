package FACTORY.EX1_1;

public abstract class Cafeteria {
    
    public abstract Bebida criarBebida();
    
    public void servir(){
        Bebida b = criarBebida();
        b.preparar();
    }

    
}
