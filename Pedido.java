import java.util.HashMap;
import java.util.Map;

/**
 * representa um pedido a ser processado no checkout
 * atributos adicionais permitem flexibilidade para cada pais
 */
public class Pedido {
    private final String identificador;
    private final PaisDestino paisDestino;
    private final double valorTotal;
    private final Map<String, String> informacoesAdicionais = new HashMap<>();

    public Pedido(String identificador, PaisDestino paisDestino, double valorTotal) {
        this.identificador = identificador;
        this.paisDestino = paisDestino;
        this.valorTotal = valorTotal;
    }

    public String getIdentificador() {
        return identificador;
    }

    public PaisDestino getPaisDestino() {
        return paisDestino;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void adicionarInformacao(String chave, String valor) {
        informacoesAdicionais.put(chave, valor);
    }

    public String obterInformacao(String chave) {
        return informacoesAdicionais.get(chave);
    }

    public String obterInformacao(String chave, String valorPadrao) {
        return informacoesAdicionais.getOrDefault(chave, valorPadrao);
    }
}