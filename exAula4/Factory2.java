public class Factory2 extends absFactory{
    
    iProductA createProductA(){
        return new ProductA2();
    }

    iProductB createProductB(){
        return new ProductB2();
    }
}
