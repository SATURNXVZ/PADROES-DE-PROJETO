public class FuncionarioPJ implements Pagavel{
    String name;
    Double base;
    Double horas; //horas trabalhadas
     
    @Override
    public void CalcSalario(){
        double salario = base * horas;
        System.out.printf("Nome do Funcionario PJ: %s\n", name);
        System.out.printf("Salario: %.2f", salario);
    }
}
