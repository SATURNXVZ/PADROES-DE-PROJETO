
public class EditorExcel extends Editor {
    
    @Override  
    public Documentos criarDocumento(){
        return new Excel();
    }
}
