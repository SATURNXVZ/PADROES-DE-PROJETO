package FACTORY.EX1_2;

public class EditorPDF extends Editor {
    
    @Override 
    public Documentos criarDocumento(){
        return new PDF();
    }
}
