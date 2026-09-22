package REVISAO.ex4_2;

public class Teste {
    public static void main(String[] args) throws NomeInvalidoException, IdadeInvalidoException, CPFInvalidoException {

        try{

            Pessoa p1 = new Pessoa("Vitor", 16, "16354405512321");
            
        
            p1.print(p1);



        } catch (NomeInvalidoException | IdadeInvalidoException | CPFInvalidoException e){
            System.out.println("ERRO! " + e.getMessage());

        }
        


    }
}
