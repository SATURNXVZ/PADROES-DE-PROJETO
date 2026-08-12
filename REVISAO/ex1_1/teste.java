package REVISAO.ex1_1;

public class teste {
    public static void main(String[] args) {
        Produto p0 = new Produto("Café", 29.00, 20);
        Produto p1 = new Produto("Arroz", 20.0, 10);


        p0.sell(10);
        p0.print();
        p1.buy(43);
        p1.print();
    }

}
