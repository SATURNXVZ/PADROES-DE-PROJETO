package aula3;

public package aula01;


public class gerente extends funcionario {
    public int num; //numero de funcionarios gerenciados

    @Override
    public Double getBonificacao(){
        double bonus_base = super.getBonificacao();
        double bonus_add = 0.2 * this.num;
        return bonus_add;
        //return this.salario * (0.2 * this.num);
    }
}



 {
    
}
