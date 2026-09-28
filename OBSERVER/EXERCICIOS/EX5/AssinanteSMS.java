
public class AssinanteSMS implements Observer {

    private String nome;

    public AssinanteSMS(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String titulo) {
        System.out.println(nome + " recebeu email: " + titulo);
    }
}
