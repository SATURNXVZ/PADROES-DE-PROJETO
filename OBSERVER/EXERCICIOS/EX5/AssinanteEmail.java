
public class AssinanteEmail implements Observer {

    private String nome;

    public AssinanteEmail(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String titulo) {
        System.out.println(nome + " recebeu email: " + titulo);
    }
}
