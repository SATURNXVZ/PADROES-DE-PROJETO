package REVISAO.ex4_2;

public class IdadeInvalidoException extends Exception {
    
    public String message;

    public IdadeInvalidoException(String message){
        this.message = message;
    }
}
