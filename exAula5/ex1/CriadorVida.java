
public class CriadorVida extends CriadorApolice{
    private String segurado;
    private int idadeSegurado;
    private double capitalSegurado;
    private boolean fumante;
    private boolean atestado;

    public CriadorVida(String segurado, int idadeSegurado, double capitalSegurado, boolean fumante, boolean atestado) {
        this.segurado = segurado;
        this.idadeSegurado = idadeSegurado;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.atestado = atestado;
    }


    @Override
    public Apolice criarApolice(){
        return new ApoliceVida(segurado, idadeSegurado, capitalSegurado, fumante, atestado);
    }
}
