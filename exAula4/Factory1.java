public class Factory1 extends absFactory {
    
    iProductA createProductA(){
        return new ProductA1();
    }

    iProductB createProductB(){
        return new ProductB1();
    }
}
