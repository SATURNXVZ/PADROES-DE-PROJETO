import java.util.ArrayList;
import java.util.List;

public class ApoliceViagem extends Apolice {
    private int diasViagem;
    private boolean internacional;
    private double cobertura; //cobertura médica em dolares;
    private boolean passaporte; 

    public ApoliceViagem(String segurado, int diasViagem, boolean internacional, double cobertura, boolean passaporte) {
        super(segurado);
        this.diasViagem = diasViagem;
        this.internacional = internacional;
        this.cobertura = cobertura;
        this.passaporte = passaporte;
    }


    @Override
    public double calcularPremio(){
        double premioBase = diasViagem * 15;

        //se for internacional +100;
        if(internacional){
            premioBase = premioBase + 100.0;
        }

        return premioBase;
    }


    @Override
    public boolean validarCobertura(){
        if(internacional){
            return cobertura >= 30000.0 && passaporte;
        }

        //nacional não precisa de nada;
        return true;
    }


    @Override
    public List<String> listarDocumentos() {
        List<String> documentos = new ArrayList<>();
        
        documentos.add("Itinerário de Viagem");
        
        if (internacional) {
            documentos.add("Passaporte");
        }
        
        return documentos;
    }


    @Override
    public String getPrefixo() {
        return "VIA-";
    }
}
