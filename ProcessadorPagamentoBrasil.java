import java.util.Locale;

public class ProcessadorPagamentoBrasil implements ProcessadorPagamento {
    @Override
    public String processarPagamento(Pedido pedido) {
        String formaPagamento = pedido.obterInformacao("formaPagamento", "BOLETO").toUpperCase(Locale.ROOT);

        if (formaPagamento.equals("PIX")) {
            double desconto = pedido.getValorTotal() * 0.05;
            double valorFinal = pedido.getValorTotal() - desconto;
            return String.format(Locale.ROOT,
                    "Forma de pagamento: Pix%n" +
                    "Desconto aplicado (5%%): R$ %.2f%n" +
                    "Valor final cobrado: R$ %.2f%n" +
                    "Status: aprovado instantaneamente",
                    desconto, valorFinal);
        }

        return String.format(Locale.ROOT,
                "Forma de pagamento: Boleto bancario%n" +
                "Valor: R$ %.2f%n" +
                "Prazo de compensacao: 3 dias uteis%n" +
                "Status: aguardando compensacao", 
                pedido.getValorTotal());
    }
}