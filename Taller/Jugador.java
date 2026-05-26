public class Jugador {
    protected int dorsal;
    protected Posicion posicion;
    protected float peso;
    protected float altura;

    public Jugador(int dorsal, Posicion posicion, float peso, float altura){
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.peso = peso;
        this.altura = altura;
    }

    public int getdoral(){
        return dorsal;
    }

    public void setdoral(int dorsal){
        this.dorsal = dorsal;
    }

    public Posicion getposicion(){
        return posicion;
    }

    public void setposicion(Posicion posicion){
        this.posicion = posicion;
    }

    public float getpeso(){
        return peso;
    }

    public void setpeso(float peso){
        this.peso = peso;
    }

    public float getaltura(){
        return altura;
    }

    public void setaltura(float altura){
        this.altura = altura;
    }



}
