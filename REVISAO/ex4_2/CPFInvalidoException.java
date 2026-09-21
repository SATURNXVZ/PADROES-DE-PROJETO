package REVISAO.ex4_2;

public class CPFInvalidoException extends Exception{
    public String message;

    public CPFInvalidoException(String message){
       super(message);
    }
}
