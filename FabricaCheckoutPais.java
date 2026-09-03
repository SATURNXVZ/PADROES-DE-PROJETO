/**
 * fabrica abstrata que garante que todos os artefatos gerados
 * (documento fiscal, processador de pagamento e etiqueta de envio)
 * sejam da mesma familia (mesmo pais)
 */
public interface FabricaCheckoutPais {
    DocumentoFiscal criarDocumentoFiscal();
    ProcessadorPagamento criarProcessadorPagamento();
    EtiquetaEnvio criarEtiquetaEnvio();
}