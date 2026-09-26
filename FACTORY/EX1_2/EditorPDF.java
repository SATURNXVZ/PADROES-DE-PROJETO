

public class EditorPDF extends Editor {
      
    @Override 
    public Documentos criarDocumento(){
        return new PDF();
    } 
}
