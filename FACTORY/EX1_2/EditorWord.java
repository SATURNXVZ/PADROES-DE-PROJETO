package FACTORY.EX1_2;

public class EditorWord extends Editor {
    
    @Override 
    public Documentos criarDocumento(){
        return new Word();
    }

}
