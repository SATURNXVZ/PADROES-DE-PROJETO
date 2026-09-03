/**
 * processador de pagamento que sera usado para cada pedido
 * cada pais possui seus proprios metodos de pagamento
 */
public interface ProcessadorPagamento {
    String processarPagamento(Pedido pedido);
}