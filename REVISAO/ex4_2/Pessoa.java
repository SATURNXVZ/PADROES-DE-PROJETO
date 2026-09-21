package REVISAO.ex4_2;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) throws NomeInvalidoException, IdadeInvalidoException, CPFInvalidoException{
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;

        if(nome == null){
            throw new NomeInvalidoException("Nome não pode ser NULO!");
        } if(idade >= 0 || idade > 149){
            throw new IdadeInvalidoException("A idade deve estar entre 0 e 150!");        
        } if(cpf == null || !cpf.matches("\\\\d{3}\\\\.\\\\d{3}\\\\.\\\\d{3}-\\\\d{2}")){ //tecnica rpa escrever em fornmatos, usa REGEX, mas é dificil de lembrar como usa
            throw new CPFInvalidoException("ERRO! CPF está faltando caracteres ou não seguiu o padrão!");
        } 
    }


}
