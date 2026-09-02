
public class CriadorResidencial extends CriadorApolice {

    private String segurado;
    private double valorImovel;
    private boolean altoPadrao; //alto padrao (true/false)
    private boolean documento;

    public CriadorResidencial(String segurado, double valorImovel, boolean altoPadrao, boolean documento) {
        this.segurado = segurado;
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.documento = documento;
    }


    @Override
    public Apolice criarApolice() {
        return new ApoliceResidencial(segurado, valorImovel, altoPadrao, documento);
    }

}
