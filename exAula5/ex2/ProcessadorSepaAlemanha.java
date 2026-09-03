import java.util.Locale;

public class ProcessadorSepaAlemanha implements ProcessadorPagamento {
    @Override
    public String processarPagamento(Pedido pedido) {
        return String.format(Locale.ROOT,
                "Payment method: SEPA Direct Debit%n" +
                "Amount: EUR %.2f%n" +
                "Mandate reference: simulated mandate%n" +
                "Status: debit scheduled",
                pedido.getValorTotal());
    }
}