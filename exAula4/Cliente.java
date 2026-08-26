public class Cliente {
    public static void main(String[] args) {
        
        //produto a1
        iProductA pA = new Factory1().createProductA();

        //produto b2
        iProductB pB = new Factory2().createProductB();
    }
}
