package FACTORY.EX1_2;

public abstract class Editor {
    
    public abstract Documentos criarDocumento();

    public void editar(){
        Documentos d = criarDocumento();
        d.abrir();
    }
}
