public class Freelancer implements Pagavel{
    String name;
    double projeto; //valor do projeto
  

    public Freelancer (String name, double projeto){
        this.name = name;
        this.projeto = projeto;
    }

    @Override
    public double calcSalario(){
        return projeto;
    }
}