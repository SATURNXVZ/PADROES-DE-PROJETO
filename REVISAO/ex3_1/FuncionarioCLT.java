public class FuncionarioCLT implements Pagavel{
    public String name;
    public double base; //salario base 
 

    public FuncionarioCLT(String name, double base){
        this.name = name;
        this.base = base;
    }

    @Override
    public double calcSalario(){
        return base;
    }
}
