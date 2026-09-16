public class observador extends absObservador{

    //implementa o construtor
    public observador(absObservado observado) {
        this.observado = observado;
        this.observado.inscreve(this);
    }

    @Override
    public void update(){
        System.out.println("Notificacao " + "Observador");
    }
}