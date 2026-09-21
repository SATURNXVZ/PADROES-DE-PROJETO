package REVISAO.ex4_2;

public class NomeInvalidoException extends Exception {
    public String message; //mensagem de exception

    public NomeInvalidoException(String message){
        this.message = message;
    }
}
