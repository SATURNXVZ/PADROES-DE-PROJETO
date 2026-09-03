public class FabricaCheckoutAlemanha implements FabricaCheckoutPais {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new VatInvoiceAlemanha();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new ProcessadorSepaAlemanha();
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaDeutschePost();
    }
}