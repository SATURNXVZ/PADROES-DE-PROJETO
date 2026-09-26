
public abstract class FabricaPersonagem {

    public abstract Personagem  criaPersonagem();

    public void iniciarBatalha(){
        Personagem p  = criaPersonagem();
        p.atacar();
    }
    
}
