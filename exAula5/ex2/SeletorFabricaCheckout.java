import java.util.HashMap;
import java.util.Map;

/**
 * seleciona a fabrica correta com base no pais de destino
 * novo pais e adicionado apenas registrando uma nova fabrica
 */
public class SeletorFabricaCheckout {
    private final Map<PaisDestino, FabricaCheckoutPais> fabricasDisponiveis = new HashMap<>();

    public void registrarFabrica(PaisDestino pais, FabricaCheckoutPais fabrica) {
        fabricasDisponiveis.put(pais, fabrica);
    }

    public FabricaCheckoutPais obterFabrica(PaisDestino pais) {
        FabricaCheckoutPais fabrica = fabricasDisponiveis.get(pais);
        if (fabrica == null) {
            throw new IllegalArgumentException("nao ha fabrica registrada para o pais: " + pais);
        }
        return fabrica;
    }
}