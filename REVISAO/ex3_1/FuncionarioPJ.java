public class FuncionarioPJ implements Pagavel{
    String name;
    Double base;  //valor por hora
    Double horas; //horas trabalhadas
     

    public FuncionarioPJ(String name, double base, double horas){
        this.name = name;
        this.base = base;
        this.horas = horas;
    }

    
    @Override
    public double calcSalario(){
        double salario = base * horas;
        return salario;
    }
}
