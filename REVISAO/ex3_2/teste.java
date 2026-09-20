package REVISAO.ex3_2;

public class teste {
    public static void main(String[] args) {
        motor m1 = new motor(135, "Gasolina", "i4");
        motor m2 = new motor(85, "Gasolina", "i3");
        motor m3 = new motor(230, "Diesel", "V6");
        motor m4 = new motor(550, "Gasolina", "V10");

        Carro c1 = new Carro("Citroen", "Xsara", "Prata", m1);
        Carro c2 = new Carro("Ford", "Ka", "Preto", m2);
        Carro c3 = new Carro("Mitsubishi", "L200", "Amarelo", m3);
        Carro c4 = new Carro("Lexus", "LFA", "Branco", m4);

        
        m1.ligar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();
        m4.ligar();    
        c4.acelerar();
        c4.acelerar();
        c4.acelerar();
        c4.acelerar();
    }
}
