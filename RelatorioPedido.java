/**
 * relatorio final do pedido em formato padronizado
 */
public class RelatorioPedido {
    private final String identificadorPedido;
    private final PaisDestino paisDestino;
    private final String documentoFiscalGerado;
    private final String pagamentoProcessado;
    private final String etiquetaGerada;

    public RelatorioPedido(String identificadorPedido, PaisDestino paisDestino,
                           String documentoFiscalGerado, String pagamentoProcessado,
                           String etiquetaGerada) {
        this.identificadorPedido = identificadorPedido;
        this.paisDestino = paisDestino;
        this.documentoFiscalGerado = documentoFiscalGerado;
        this.pagamentoProcessado = pagamentoProcessado;
        this.etiquetaGerada = etiquetaGerada;
    }

    public void imprimirRelatorio() {
        System.out.println("==================================================");
        System.out.println("RELATORIO DE PEDIDO");
        System.out.println("==================================================");
        System.out.println("Pedido: " + identificadorPedido);
        System.out.println("Pais de destino: " + paisDestino);
        System.out.println("--------------------------------------------------");
        System.out.println("[DOCUMENTO FISCAL]");
        System.out.println(documentoFiscalGerado);
        System.out.println("--------------------------------------------------");
        System.out.println("[PAGAMENTO]");
        System.out.println(pagamentoProcessado);
        System.out.println("--------------------------------------------------");
        System.out.println("[ETIQUETA DE ENVIO]");
        System.out.println(etiquetaGerada);
        System.out.println("==================================================\n");
    }
}