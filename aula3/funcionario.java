public class Funcionario {
    // protected é um atributo que só pode ser acessivel por uma classe que extende de tal
    protected String nome;
    protected String cpf;
    protected Double salario;
    protected String senha;

    public Double getBonificacao(){
        // this garante e força que o atributo salário do apartment threading 
        // da classe Funcionario seja usado (instancia do funcionario sendo usada em tempo de cpu)
        return this.salario = 0.15; // 15% como padrão de bonificação
    }

    public boolean autentica(String senha){
        return this.senha.equals(senha);
    }
}

public class Gerente extends Funcionario {
    public int numeroDeFuncionadiosGerenciados;

    public double getBonus() {
        double bonus_base = super.getBonificacao();
        double bonus_adicional = 0.2 * this.numeroDeFuncionadiosGerenciados;
        return bonus_base + bonus_adicional;
    }
}