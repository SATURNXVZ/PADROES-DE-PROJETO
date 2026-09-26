
public class FabricaMago extends FabricaPersonagem {

    @Override 
    public Personagem criaPersonagem(){
        return new Mago();
    }
}
