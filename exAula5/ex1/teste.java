
public class teste {
    public static void main(String[] args) {
        ClienteSeguradora cliente = new ClienteSeguradora();

        CriadorAuto criadorAuto = new CriadorAuto(
            "João Silva",
            45000.0,           
            24,
            1,
            60000.0
        );
        cliente.registrarCriadores("AUTO", criadorAuto);


        CriadorResidencial criadorRes = new CriadorResidencial(
            "Maria Santos",
            350000.0, 
            true, 
            true 
        );
        cliente.registrarCriadores("RES", criadorRes);

        CriadorVida criadorVida = new CriadorVida(
            "Pedro Oliveira",
            35,
            100000.0,
            false,
            true 
        );
        cliente.registrarCriadores("VID", criadorVida);


        System.out.println("=== EMISSÃO DE APÓLICES ===\n");

        System.out.println("--- APÓLICE AUTO ---");
        System.out.println(cliente.solicitarApolice("AUTO"));
        System.out.println();

        System.out.println("--- APÓLICE RESIDENCIAL ---");
        System.out.println(cliente.solicitarApolice("RES"));
        System.out.println();

        System.out.println("--- APÓLICE VIDA ---");
        System.out.println(cliente.solicitarApolice("VID"));
        System.out.println();

        System.out.println("--- APÓLICE VIAGEM ---");
        System.out.println(cliente.solicitarApolice("VIA"));
        System.out.println();
    }

    
}
