public class FabricaCheckoutBrasil implements FabricaCheckoutPais {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NotaFiscalEletronicaBrasil();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new ProcessadorPagamentoBrasil();
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaCorreiosBrasil();
    }
}