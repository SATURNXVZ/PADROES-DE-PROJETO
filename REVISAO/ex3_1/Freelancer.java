public class Freelancer implements Pagavel{
    String name;
    double base;
    double projeto;
  

    @Override
    public void calcSalario(){
        double salario = base * projeto;
        System.out.printf("Nome do funcionario %s\nSalario: %.2f", name, salario);
    }
}