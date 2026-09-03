import java.util.Locale;

public class ProcessadorCartaoEUA implements ProcessadorPagamento {
    @Override
    public String processarPagamento(Pedido pedido) {
        return String.format(Locale.ROOT,
                "Payment method: Credit card%n" +
                "Amount charged: $ %.2f%n" +
                "AVS verification: billing address and ZIP code matched%n" +
                "Status: approved",
                pedido.getValorTotal());
    }
}