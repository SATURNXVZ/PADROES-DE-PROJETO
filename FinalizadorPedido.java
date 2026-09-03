/**
 * responsavel por finalizar o pedido, coordenando a geracao de todos os artefatos
 * nao contem logica de decisao sobre qual pais processar
 */
public class FinalizadorPedido {
    public RelatorioPedido finalizarPedido(Pedido pedido, FabricaCheckoutPais fabrica) {
        DocumentoFiscal documentoFiscal = fabrica.criarDocumentoFiscal();
        ProcessadorPagamento processadorPagamento = fabrica.criarProcessadorPagamento();
        EtiquetaEnvio etiquetaEnvio = fabrica.criarEtiquetaEnvio();

        String documentoGerado = documentoFiscal.gerarDocumento(pedido);
        String pagamentoProcessado = processadorPagamento.processarPagamento(pedido);
        String etiquetaGerada = etiquetaEnvio.gerarEtiqueta(pedido);

        return new RelatorioPedido(
                pedido.getIdentificador(),
                pedido.getPaisDestino(),
                documentoGerado,
                pagamentoProcessado,
                etiquetaGerada
        );
    }
}