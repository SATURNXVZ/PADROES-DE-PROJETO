package FACTORY.EX1_2;

public class Word implements Documentos {
    
    @Override 
    public void abrir(){
        System.out.println("Abrindo documento WORD!");
    }
}
