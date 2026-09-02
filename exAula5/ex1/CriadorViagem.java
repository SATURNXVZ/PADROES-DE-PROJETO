
public class CriadorViagem extends CriadorApolice{
    private String segurado;
    private int diasViagem;
    private boolean internacional;
    private double cobertura;
    private boolean passaporte;

    public CriadorViagem(String segurado, int diasViagem, boolean internacional, double cobertura, boolean passaporte) {
        this.segurado = segurado;
        this.diasViagem = diasViagem;
        this.internacional = internacional;
        this.cobertura = cobertura;
        this.passaporte = passaporte;
    }


    @Override
    public Apolice criarApolice(){
        return new ApoliceViagem(segurado, diasViagem, internacional, cobertura, passaporte);
    }
}
