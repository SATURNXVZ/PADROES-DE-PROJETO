public class FuncionarioPJ implements Pagavel{
    String name;
    Double base;
    Double horas; //horas trabalhadas
     

    public FuncionarioPJ(String name, double base, double horas){
        this.name = name;
        this.base = base;
        this.horas = horas;
    }

    
    @Override
    public double calcSalario(){
        double salario = base * horas;
        System.out.printf("Nome do Funcionario PJ: %s\n", name);
        System.out.printf("Salario: %.2f", salario);
        return salario;
    }
}
