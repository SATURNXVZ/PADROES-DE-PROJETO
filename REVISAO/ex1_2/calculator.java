package REVISAO.ex1_2;

public class calculator {
    public double result;

    public calculator(double result){
        this.result = result;
    }

    public double sum(double num1, double num2){
        return result = num1 + num2;
    }

    public double sub(double num1, double num2){
        return result = num1 - num2;
    }

    public double mult(double num1, double num2){
        return result = num1 * num2;
    }

    public double div(double num1, double num2){
        return result = num1 / num2;
    }

    public void print(){
        System.out.println("O Resultado é: " +result);
    }
}
