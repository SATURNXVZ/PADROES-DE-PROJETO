import java.util.List;

public abstract  class Apolice {
    protected String numeroApolice;
    protected String segurado;
    protected String dataEmissao;
    protected double premioMensal;
    protected boolean contratacaoValida;
    protected String mensagemValidacao;

    //contador para gerar numeros unicos
    private static int contador = 0;

    public Apolice(String segurado) {
        this.segurado = segurado;
        this.dataEmissao = "18/10/2006"; //data do meu aniversário :)
        this.numeroApolice = numero();
        this.contratacaoValida = false; //comecar invalda
        this.mensagemValidacao = "";
    }

    private String numero(){
        contador++;
        return getPrefixo() + String.format("%04d", contador);
    }

    //metodos abstrtos
    public abstract double calcularPremio();
    public abstract boolean validarCobertura();
    public abstract List<String> listarDocumentos();
    public abstract String getPrefixo();

    public void processar(){
        this.premioMensal = calcularPremio();
        this.contratacaoValida = validarCobertura();

        if(!contratacaoValida){
            this.mensagemValidacao = "Contratação RECUSADA";
        }
    }

    public String resumo(){
        if(!contratacaoValida){
            return "APÓLICE REJEITADA" + mensagemValidacao;
    }

        //aprovada
        StringBuilder sb = new StringBuilder();
        sb.append("---RESUMO APOLICE---\n\n");
        sb.append("Número: ").append(numeroApolice).append("\n");
        sb.append("Segurado: ").append(segurado).append("\n");
        sb.append("Data de Emissão: ").append(dataEmissao).append("\n");
        sb.append("Prêmio Mensal: R$ ").append(String.format("%.2f", premioMensal)).append("\n");
        sb.append("Documentos Exigidos: ").append(listarDocumentos()).append("\n");
        sb.append("Status: APÓLICE EMITIDA COM SUCESSO");
        return sb.toString();
    }
}
