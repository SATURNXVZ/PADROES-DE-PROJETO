package REVISAO.ex2_1;

public class desenvolvedor extends funcionario {
    private int years;

    public desenvolvedor(String name, double baseWage, int years){
        super(name, baseWage);
        this.years = years;
    }

    @Override
    public double calcWage() {
        double wage = baseWage * 1.15;

        if(years > 3){
            wage += 500;
        }

        return wage;
    }
}
