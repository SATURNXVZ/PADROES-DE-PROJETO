package REVISAO.ex2_1;

public class funcionario {
    public String name;
    public double baseWage;


    public funcionario(String name, double baseWage){
        this.name = name;
        this.baseWage = baseWage;
    }

    public double calcWage(){
        return baseWage;
    }

    public void print(){
        System.out.printf("Funcionario: %s | Salário: R$%.2f%n", name, baseWage);
    }
}
