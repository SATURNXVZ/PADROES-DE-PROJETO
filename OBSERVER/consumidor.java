public class consumidor{
    public static void main(String[] args) {
        //construi o observado
        observado observado = new observado();

        //construi o observador
        observador observer1 = new observador(observado);

        //alterar o estado do osbervado
        observado.setState(10);
    }
}