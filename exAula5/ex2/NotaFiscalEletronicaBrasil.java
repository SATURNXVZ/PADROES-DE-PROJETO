import java.util.Locale;

public class NotaFiscalEletronicaBrasil implements DocumentoFiscal {
    @Override
    public String gerarDocumento(Pedido pedido) {
        boolean ehInterestadual = Boolean.parseBoolean(pedido.obterInformacao("interestadual", "false"));
        String codigoCfop = ehInterestadual ? "6.102" : "5.102";
        double aliquotaIcms = ehInterestadual ? 12.0 : 18.0;
        double valorIcms = pedido.getValorTotal() * (aliquotaIcms / 100.0);
        String chaveAcesso = gerarChaveAcessoSimulada(pedido.getIdentificador());

        return String.format(Locale.ROOT,
                "Nota Fiscal Eletronica (NF-e)%n" +
                "Chave de acesso: %s%n" +
                "CFOP: %s (%s)%n" +
                "Valor total: R$ %.2f%n" +
                "Aliquota ICMS: %.2f%%%n" +
                "Valor ICMS: R$ %.2f",
                chaveAcesso, codigoCfop,
                ehInterestadual ? "operacao interestadual" : "operacao dentro do estado",
                pedido.getValorTotal(), aliquotaIcms, valorIcms);
    }

    private String gerarChaveAcessoSimulada(String identificadorPedido) {
        String base = "35" + identificadorPedido.replaceAll("[^0-9]", "");
        if (base.isEmpty()) {
            base = "0";
        }
        StringBuilder chave = new StringBuilder();
        while (chave.length() < 44) {
            chave.append(base);
        }
        return chave.substring(0, 44);
    }
}