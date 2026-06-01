public class Participacion {
    
    private boolean esLocal;
    private Seleccion seleccion;

    public Participacion(boolean esLocal, Seleccion seleccion){
        this.esLocal = esLocal;
        this.seleccion = seleccion;
    }

    public boolean getLocal(){
        return esLocal;
    }

    public void setLocal(boolean esLocal){
        this.esLocal = esLocal;
    }

    public Seleccion getSeleccion(){
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion){
        this.seleccion = seleccion;
    }

    public int cantidadGoles(){
        return 0;
    }

    public int cantidadTarjAmarillas(){
        return 0;
    }

    public int cantidadTarjRojas(){
        return 0;
    }
}
