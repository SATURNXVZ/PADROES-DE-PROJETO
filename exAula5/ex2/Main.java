public class Main {
    public static void main(String[] args) {
        // configuracao das fabricas disponiveis
        SeletorFabricaCheckout seletor = new SeletorFabricaCheckout();
        seletor.registrarFabrica(PaisDestino.BRASIL, new FabricaCheckoutBrasil());
        seletor.registrarFabrica(PaisDestino.ESTADOS_UNIDOS, new FabricaCheckoutEUA());
        seletor.registrarFabrica(PaisDestino.ALEMANHA, new FabricaCheckoutAlemanha());

        FinalizadorPedido finalizador = new FinalizadorPedido();

        // pedido para o brasil
        Pedido pedidoBrasil = new Pedido("PED-BR-1001", PaisDestino.BRASIL, 1500.00);
        pedidoBrasil.adicionarInformacao("interestadual", "true");
        pedidoBrasil.adicionarInformacao("formaPagamento", "PIX");
        pedidoBrasil.adicionarInformacao("cep", "01310100");

        // pedido para os estados unidos
        Pedido pedidoEUA = new Pedido("ORD-US-2001", PaisDestino.ESTADOS_UNIDOS, 250.00);
        pedidoEUA.adicionarInformacao("estado", "CA");
        pedidoEUA.adicionarInformacao("zip", "941030001");

        // pedido para a alemanha
        Pedido pedidoAlemanha = new Pedido("BEST-DE-3001", PaisDestino.ALEMANHA, 89.90);
        pedidoAlemanha.adicionarInformacao("produtoEssencial", "false");
        pedidoAlemanha.adicionarInformacao("plz", "10115");

        // processamento dos pedidos
        RelatorioPedido relatorioBrasil = finalizador.finalizarPedido(
                pedidoBrasil, seletor.obterFabrica(pedidoBrasil.getPaisDestino()));
        RelatorioPedido relatorioEUA = finalizador.finalizarPedido(
                pedidoEUA, seletor.obterFabrica(pedidoEUA.getPaisDestino()));
        RelatorioPedido relatorioAlemanha = finalizador.finalizarPedido(
                pedidoAlemanha, seletor.obterFabrica(pedidoAlemanha.getPaisDestino()));

        // impressao dos relatorios
        relatorioBrasil.imprimirRelatorio();
        relatorioEUA.imprimirRelatorio();
        relatorioAlemanha.imprimirRelatorio();
    }
}