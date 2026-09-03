/**
 * documento fiscal que sera gerado para cada pedido
 * cada pais possui seu proprio formato de documento fiscal
 */
public interface DocumentoFiscal {
    String gerarDocumento(Pedido pedido);
}