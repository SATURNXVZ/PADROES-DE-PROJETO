
import java.util.HashMap;
import java.util.Map;

public class ClienteSeguradora {
    private Map<String, CriadorApolice> criadores;

    public ClienteSeguradora(){
        this.criadores = new HashMap<>();
    }

    public void registrarCriadores(String tipo, CriadorApolice criador){
        criadores.put(tipo, criador);
    }

    public String solicitarApolice(String tipo){
        CriadorApolice criador = criadores.get(tipo);

        //não encontrou = erro
        if(criador == null) return "ERRO! Tipo de apolice '" + tipo + "' não suportado!"; 

        return criador.processarContratacao();
    }
}
