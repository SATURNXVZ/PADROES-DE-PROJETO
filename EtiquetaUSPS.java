public class EtiquetaUSPS implements EtiquetaEnvio {
    @Override
    public String gerarEtiqueta(Pedido pedido) {
        String zip = pedido.obterInformacao("zip", "000000000").replaceAll("[^0-9]", "");
        if (zip.length() < 9) {
            zip = String.format("%9s", zip).replace(' ', '0');
        }
        String zipPlus4 = zip.substring(0, 5) + "-" + zip.substring(5, 9);

        return "Carrier: USPS\n" +
               "Destination ZIP+4: " + zipPlus4 + "\n" +
               "Service: Priority Mail (domestic)";
    }
}