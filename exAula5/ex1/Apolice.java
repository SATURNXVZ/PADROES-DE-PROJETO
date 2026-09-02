import java.time.LocalDate;
import java.util.List;

public abstract  class Apolice {
    protected String numeroApolice;
    protected String segurado;
    protected LocalDate dataEmissao;
    protected double premioMensal;
    protected boolean contratacaoValida;
    protected String mensagemValidacao;

    public Apolice(String segurado) {
        this.segurado = segurado;
    }

    public String gerarResumo(){
        
    }

    public void processar(){

    }

    public abstract double calcularPremio();

    public abstract boolean validarCobertura();

    public abstract List<String> listarDocumentos();

    public abstract String getPrefixo();
    
}
