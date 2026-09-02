

public class ApoliceAuto extends Apolice {
    // 1. Atributos
    private double FIPE;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private double coberturaTerceiros;
    
    // 2. Construtor
    public ApoliceAuto(String segurado, double FIPE, int idadeCondutor, 
                       int tempoHabilitacao, double coberturaTerceiros) {
        super(segurado);
        this.FIPE = FIPE;
        this.idadeCondutor = idadeCondutor;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
    }

    @Override
    public double calcularPremio(){
        double premioBase = (FIPE * 0.08) /12;
        
        //condutor com menos de 25 anos + 30%;
        if(idadeCondutor < 25){
            premioBase = premioBase * 1.30;
        }

        //carteira com menos de 2 anos
        if(tempoHabilitacao < 2){
            premioBase = premioBase * 1.20;
        }

        return premioBase;
    }


    @Override
    public boolean validarCobertura(){
        return coberturaTerceiros >= 50000.0;
    }


    @Override
    public java.util.List<String> listarDocumentos(){
        java.util.List<String> documentos = new java.util.ArrayList<>();
        documentos.add("CNH");
        documentos.add("CRLV");
        documentos.add("Comprovante de Residência");
        return documentos;
    }


    @Override
    public String getPrefixo(){
        return "AUTO-";
    }

}
