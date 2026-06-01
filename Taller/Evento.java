public class Evento {
    protected  TipoEvento tipo;
    protected int minuto;
    protected Jugador jugador;

    public Evento(TipoEvento tipo, int minuto, Jugador jugador){
        this.tipo = tipo;
        this.minuto = minuto;
        this.jugador = jugador;
    }

    public TipoEvento tipo(){
        return tipo;
    }

    public void settipo(TipoEvento tipo){
        this.tipo = tipo;
    }

    public int getminuto(){
        return minuto;
    }

    public void setminuto(int minuto){
        this.minuto = minuto;
    }

    public Jugador getJugador(){
        return jugador;
    }
}
