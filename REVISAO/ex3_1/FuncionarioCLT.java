public class FuncionarioCLT implements Pagavel{
    public String name;
    public double base; //salario base 
 
    @Override
    public void CalcSalario(){
        double salario = base;
        System.out.printf("Nome do funcionario: %s\n", name);
        System.out.printf("Salário: %.2f", salario);
    }
}
