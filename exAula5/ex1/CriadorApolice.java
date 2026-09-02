public abstract class CriadorApolice{

    public abstract Apolice criarApolice();

    public final String processarContratacao() {
        Apolice apolice = criarApolice();
        apolice.processar();
        return apolice.resumo();
    }

    
}