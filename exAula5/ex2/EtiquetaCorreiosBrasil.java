public class EtiquetaCorreiosBrasil implements EtiquetaEnvio {
    @Override
    public String gerarEtiqueta(Pedido pedido) {
        String cepBruto = pedido.obterInformacao("cep", "00000000").replaceAll("[^0-9]", "");
        if (cepBruto.length() < 8) {
            cepBruto = String.format("%8s", cepBruto).replace(' ', '0');
        }
        String cepFormatado = cepBruto.substring(0, 5) + "-" + cepBruto.substring(5, 8);

        return "Transportadora: Correios\n" +
               "CEP de destino: " + cepFormatado + "\n" +
               "Servico: SEDEX/PAC (nacional)";
    }
}