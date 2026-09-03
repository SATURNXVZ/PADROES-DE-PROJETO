package exAula5.ex2;

public class NFEBrazil implements Document{
    
    @Override
    public String generate(){
        return "Nota fiscal eletronica (nfe)";
    }


    @Override
    public String details(){
        String key= generateKey();
        return "CFOP: 5.102 ou 6.102\n" + "ICMS: 18% ou 12%\n" + "Chave: " + key;
    }

    private String generateKey(){
        StringBuilder key = new StringBuilder();
        for(int i = 0; i < 44; i++){
            key.append((int) (Math.random() *10));
        }
        return key.toString();
    }
}
