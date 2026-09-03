public class FabricaCheckoutEUA implements FabricaCheckoutPais {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new SalesInvoiceEUA();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new ProcessadorCartaoEUA();
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaUSPS();
    }
}