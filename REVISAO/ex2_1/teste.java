package REVISAO.ex2_1;

import java.util.ArrayList;
import java.util.List;

public class teste {
    public static void main(String[] args) {
        List<funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new gerente("Cariane", 10000));
        funcionarios.add(new estagiario("Duardo", 1700));
        funcionarios.add(new desenvolvedor("Vitor", 6000, 3));
        funcionarios.add(new desenvolvedor("Luiz", 7500, 6));

        for (funcionario f : funcionarios){
            f.print();
        }

    }
}
