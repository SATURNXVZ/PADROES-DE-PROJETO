package REVISAO.ex4_1;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(0, "Simas Turbo", 0);
        ContaBancaria c2 = new ContaBancaria(1, "Jacinto Leite", 1000);

        c1.sacar(100);
        c1.depositar(3000);
        c1.depositar(0);

        c2.transferir(c1, 3000);
        
    }
}
