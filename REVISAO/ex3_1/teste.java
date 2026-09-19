    public class teste {
        public static void main(String[] args) {
            FuncionarioCLT c1 = new FuncionarioCLT("Renato", 3000);
            FuncionarioPJ p1 = new FuncionarioPJ("Daniel", 100, 120);
            Freelancer f1 = new Freelancer("Roberto", 4500);


            FolhaPagamento folha = new FolhaPagamento();
            
            folha.adicionar(f1);
            folha.adicionar(p1);
            folha.adicionar(c1);
            folha.gerarFolha();
            folha.printf();
        }
        
    }
