/**
 * etiqueta de envio que sera gerada para cada pedido
 * cada pais possui sua propria transportadora
 */
public interface EtiquetaEnvio {
    String gerarEtiqueta(Pedido pedido);
}