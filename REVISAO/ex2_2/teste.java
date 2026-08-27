package REVISAO.ex2_2;

public interface teste {
    public static void main(String[] args) {
        
        forma f1 = new triangulo("Triangulo", 3, 4);
        forma f2 = new circulo("Circulo", 4);
        forma f3 = new retangulo("Retangulo", 4, 6);
 
        f1.calcArea();
        f2.calcArea();
        f3.calcArea();

        f1.print();
        f2.print();
        f3.print();

        f3.calcArea();



    }
}
