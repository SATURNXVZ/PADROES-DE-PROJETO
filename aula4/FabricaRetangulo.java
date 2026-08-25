public class FabricaRetangulo implements iFabricaforma {
    
    public iForma criarForma(){
        return new Retangulo();
    }
}
