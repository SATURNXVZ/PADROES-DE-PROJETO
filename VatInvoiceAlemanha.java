import java.util.Locale;

public class VatInvoiceAlemanha implements DocumentoFiscal {
    @Override
    public String gerarDocumento(Pedido pedido) {
        boolean produtoEssencial = Boolean.parseBoolean(pedido.obterInformacao("produtoEssencial", "false"));
        double aliquotaUst = produtoEssencial ? 7.0 : 19.0;
        double valorImposto = pedido.getValorTotal() * (aliquotaUst / 100.0);
        String vatId = "DE123456789";

        return String.format(Locale.ROOT,
                "VAT Invoice%n" +
                "Seller VAT-ID: %s%n" +
                "Umsatzsteuer rate: %.2f%% (%s)%n" +
                "Order total: EUR %.2f%n" +
                "VAT amount: EUR %.2f",
                vatId, aliquotaUst,
                produtoEssencial ? "essential goods" : "standard rate",
                pedido.getValorTotal(), valorImposto);
    }
}