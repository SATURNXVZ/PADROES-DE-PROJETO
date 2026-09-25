package FACTORY.EX1_2;

public class PDF implements Documentos {
    
    @Override 
    public void abrir(){
        System.out.println("Abrindo documento PDF!");
    }
}
