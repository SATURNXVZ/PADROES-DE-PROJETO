package exAula5.ex2;

public interface CheckoutFactory {
    Document document();
    Payment payment();
    Shipping shipping();

    
}
