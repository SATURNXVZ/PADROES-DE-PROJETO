package REVISAO.ex2_1;

public class gerente extends funcionario {
    
    public gerente(String name, double baseWage){
        super(name, baseWage);
    }

    @Override
    public double calcWage(){
        return baseWage * 1.20;
    }
}
