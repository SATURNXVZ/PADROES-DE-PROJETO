import FACTORY.EX1_2.Documentos;

public class Excel implements Documentos{
    @Override 
    public void abrir(){
        System.out.println("Abrindo Documento Excel!");
    }
}