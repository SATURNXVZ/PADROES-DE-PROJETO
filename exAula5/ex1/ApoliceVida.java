
import java.util.ArrayList;
import java.util.List;


public class ApoliceVida extends Apolice {
    private int idade;
    private double capitalSegurado; //valor do seguro
    private boolean fumante; //se eh fumante (true/false)
    private boolean atestado //se tem atestado

    public ApoliceVida(String segurado, int idade, double capitalSegurado, boolean fumante, boolean atestado) {
        super(segurado);
        this.idade = idade;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.atestado = atestado;
    }

    @Override
    public double calcularPremio(){
        double premioBase = (idade * 12) + (capitalSegurado * 0.002);

        //fumante, +50%
        if(fumante){
            premioBase = premioBase * 1.50;
        }

        return premioBase;  
    }


    @Override
    public boolean validarCobertura(){
        //capital maior que 500 mil = atestado
        if(capitalSegurado > 500000.0){
            return atestado;
        }

        return true; //não precisa de atestado
    }


    @Override
    public List<String> listarDocumentos(){
        List<String> documentos = new ArrayList<>();

        //sempre exigidos
        documentos.add("Documento de Identidade");
        documentos.add("CPF");

        if(capitalSegurado >500000.0){
            documentos.add("Atestado médico");
        }

        return documentos;
    }


    @Override
    public String getPrefixo() {
        return "VID-";
    }



}
