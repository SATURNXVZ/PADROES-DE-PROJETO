import java.util.List;

public class FolhaPagamento {

    List<Pagavel> funcionarios;

    public FolhaPagamento(List<Pagavel> pagaveis){
        funcionarios = pagaveis;
    }

    public void gerarFolha(){
        double total = 0;

        for (Pagavel pagavel : funcionarios) {
            total += pagavel.calcSalario();
        }
    }

    public void printf(){
        System.out.printf("O valor total da Folha de Pagamento é: %.2f", total);
    }

}
