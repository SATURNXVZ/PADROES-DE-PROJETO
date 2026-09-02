
public class CriadorAuto extends CriadorApolice {
    
    private String segurado;
    private double FIPE;
    private int idade;
    private int tempoHabilitacao;
    private double coberturaTerceiros;
    
    public CriadorAuto(String segurado, double FIPE, int idade, int tempoHabilitacao, double coberturaTerceiros) {
        this.segurado = segurado;
        this.FIPE = FIPE;
        this.idade = idade;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
    }
    
    @Override
    public Apolice criarApolice() {
        return new ApoliceAuto(segurado, FIPE, idade, tempoHabilitacao, coberturaTerceiros);
    }
}