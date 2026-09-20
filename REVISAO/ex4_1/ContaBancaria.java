package REVISAO.ex4_1;

public class ContaBancaria {
    private int id;
    private String titular;
    private double saldo;

    public ContaBancaria(int id, String titular, double saldo){
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
        if(saldo < 0.1){
            System.out.println("O saldo da conta não pode ser negativo!");
            this.saldo = 1.0;
            }
    }

    public void depositar(double valor){
        if(valor < 1){
            System.out.println("ERRO! Depósito precisa ser maior do que 0!");
            return;
        } 
        saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
        System.out.printf("Saldo: %.2f\n\n\n", saldo);
    }

    public int sacar(double valor){
        if(valor > saldo){
            System.out.println("ERRO! Saldo insuficiente!");
            return 1;
        } 
        saldo -= valor;
        System.out.println("Saque realizado com sucesso!");
        System.out.printf("Saldo: %.2f\n\n\n", saldo);
        return 0;
    }

    public void transferir(ContaBancaria destino, double valor){
        if(valor < 0){
            System.out.println("ERRO! Valor precisa ser maior que 0!");
            return;
        }
        if(this.sacar(valor) == 1){
            return;
        }
        destino.depositar(valor);
        System.out.println("Transferência realizada com sucesso!");
    }
    
}
