public class FuncionarioCLT implements Pagavel{
    public String name;
    public double base; //salario base 
 

    public FuncionarioCLT(String name, double base){
        this.name = name;
        this.base = base;
    }

    @Override
    public double calcSalario(){
        double salario = base;
        System.out.printf("Nome do funcionario: %s\n", name);
        System.out.printf("Salário: %.2f", salario);
        return salario;
    }
}
