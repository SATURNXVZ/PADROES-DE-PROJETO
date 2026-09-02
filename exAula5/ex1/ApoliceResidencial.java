import java.util.ArrayList;
import java.util.List;

public class ApoliceResidencial extends Apolice {
    private double valorImovel;
    private boolean altoPadrao; //alto padrao (true/false)
    private boolean temDocumento; //tem = true, não tem = false

    public ApoliceResidencial(String segurado, double valorImovel, boolean altoPadrao, boolean temDocumento) {
        super(segurado);
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.temDocumento = temDocumento;
    }

    @Override
    public double calcularPremio() {
        //1,5% do imovel
        double premioAnual = valorImovel * 0.015;

        //mensal
        double premioMensal = premioAnual /12;

        //alto padrao +25%
        if(altoPadrao){
            premioMensal = premioMensal * 1.25;
        }

        return premioMensal;
    }


    @Override
    public boolean validarCobertura() {
        return temDocumento;
    }


    @Override
    public List<String> listarDocumentos() {
        List<String> documentos = new ArrayList<>();
        documentos.add("Escritura ou Contrato de Locação");
        documentos.add("Comprovante de Residência");
        return documentos;
    }


    @Override
    public String getPrefixo() {
        return "RES-";
    }
}




