import java.util.Locale;

public class SalesInvoiceEUA implements DocumentoFiscal {
    @Override
    public String gerarDocumento(Pedido pedido) {
        String estado = pedido.obterInformacao("estado", "OR").toUpperCase(Locale.ROOT);
        double aliquota = obterAliquotaEstado(estado);
        double valorImposto = pedido.getValorTotal() * (aliquota / 100.0);
        String ein = "12-3456789";

        return String.format(Locale.ROOT,
                "Sales Invoice%n" +
                "Seller EIN: %s%n" +
                "Destination state: %s%n" +
                "Sales tax rate: %.2f%%%n" +
                "Order total: $ %.2f%n" +
                "Sales tax amount: $ %.2f",
                ein, estado, aliquota, pedido.getValorTotal(), valorImposto);
    }

    private double obterAliquotaEstado(String estado) {
        switch (estado) {
            case "CA": return 7.25;
            case "TX": return 6.25;
            case "OR": return 0.0;
            default:
                throw new IllegalArgumentException("estado americano nao suportado: " + estado);
        }
    }
}