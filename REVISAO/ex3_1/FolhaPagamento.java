import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {

    double total = 0;

    List<Pagavel> funcionarios;

    public FolhaPagamento() {
        funcionarios = new ArrayList<>();
    }

    public void adicionar(Pagavel funcionario){
        funcionarios.add(funcionario);
    }

    public void gerarFolha(){
        
        for (Pagavel pagavel : funcionarios) {
            total += pagavel.calcSalario();
        }
    }

    public void printf(){
        System.out.printf("O valor total da Folha de Pagamento é: %.2f", total);
    }

}
