package REVISAO.ex3_2;

public class motor {
    public double potencia; //cv
    private String tipo; //flex, diesel
    private String formato; //v6, i4;

    public int ignicao = 0;

    public motor(double potencia, String tipo, String formato){
        this.potencia = potencia;
        this.tipo = tipo;
        this.formato = formato;
    }

    public void ligar(){
        System.out.println("Motor ligado!");
        ignicao = 1;
    }

    public int desligar(){
        if (ignicao == 1){
            System.out.println("Motor desligado!");
            ignicao = 0;
            return 0;
        }
        else{
            System.out.println("Motor já está desligado!");
        }
        return 0;
    }

}
