public class observado extends absObservado{

    //propriedade de state
    private int state;
    public int getState(){
        return this.state;
    }

    public void setState(int State){
        this.state = State;
        this.notificarTodos();
    }

    private void notificarTodos(){
        for(absObservador observador : this.listaObservadores){
            observador.update();
        }

    }

    @Override
    public void inscreve(absObservador observador){
        this.listaObservadores.add(observador);
    }

    @Override
    public void remove(absObservador observador){
        this.listaObservadores.remove(observador);
    }
}