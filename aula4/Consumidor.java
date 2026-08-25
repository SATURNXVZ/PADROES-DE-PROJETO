public class Consumidor {
    public static void main(String[] args) {
        iFabricaforma retangulofactory = new FabricaRetangulo();
        iForma retangulo = retangulofactory.criarForma();
        retangulo.desenhar();

        iFabricaforma circulofactory = new fabricaCirculo();
        iForma circulo = circulofactory.criarForma();
        circulo.desenhar();        
    }
}
