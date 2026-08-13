package REVISAO.ex2_1;

public class estagiario extends funcionario {
    public estagiario(String name, double baseWage){
        super(name, baseWage);
    }

    @Override
    public double calcWage(){
        return baseWage *= 0.6;
    }
}
