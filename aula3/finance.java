package aula3;

public class finance {
    private double total_bonus = 0.0;

    public void calc_bonus(funcionario funcionario){
        this.total_bonus += funcionario.getBonificacao();
    }

    

    public double getTotal_bonus(){
        return this.total_bonus;
    }
}