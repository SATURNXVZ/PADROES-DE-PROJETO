package REVISAO.ex1_1;

public class Produto {
    public String name;
    public double price;
    public int stock;

    public Produto(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int sell (int stock){
        return this.stock -1;
    }

    public void buy (int amount){
        if(amount > stock){
            System.out.println("Estoque insuficiente!");
            return;
        }
        stock -= amount;
        System.out.println("O Produto " +name+ "foi vendido" +amount+ "unidades");
    }

    public void print(){
        System.out.println("=============");
        System.out.println("Nome do produto: " + name);
        System.out.println("Preço R$: " + price);
        System.out.println("Itens em estoque: " + stock);
    }
}
