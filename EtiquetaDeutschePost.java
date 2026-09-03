public class EtiquetaDeutschePost implements EtiquetaEnvio {
    @Override
    public String gerarEtiqueta(Pedido pedido) {
        String plz = pedido.obterInformacao("plz", "00000").replaceAll("[^0-9]", "");
        if (plz.length() < 5) {
            plz = String.format("%5s", plz).replace(' ', '0');
        }
        plz = plz.substring(0, 5);

        return "Carrier: Deutsche Post\n" +
               "Destination PLZ: " + plz + "\n" +
               "Service: standard parcel (domestic)";
    }
}