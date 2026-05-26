public class Evento {
    protected  TipoEvento tipo;
    protected int minuto;

    public Evento(TipoEvento tipo, int minuto){
        this.tipo = tipo;
        this.minuto = minuto;
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
}
