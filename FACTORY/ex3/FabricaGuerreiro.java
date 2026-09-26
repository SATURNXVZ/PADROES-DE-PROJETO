
public class FabricaGuerreiro extends FabricaPersonagem {
    
    @Override 
    public Personagem criaPersonagem(){
        return new Guerreiro();
    }
}
