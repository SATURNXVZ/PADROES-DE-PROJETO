package REVISAO.ex3_2;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private motor motor;

    public double km; //velocidade

    public Carro(String marca, String modelo, String cor, motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public int acelerar(){
        if(motor.ignicao == 0){
            System.out.println("Motor está desligado!");
            return 0;
        }
        System.out.println("Acelerando!");
        km += (motor.potencia /10);
        System.out.printf("Velocidade atual: %.1f\n\n", km);
        return 0;
    }

    public int frear(){
        if(km < 1){
            System.out.println("O carro já está parado!");
            return 0;
        } else{
            System.out.println("Freando!");
            km -= 20;
            System.out.printf("Velocidade atual: %.1f Km/h\n\n", km);
        }
        return 0;
    }
}
