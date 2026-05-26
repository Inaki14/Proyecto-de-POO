public class Estadio {
    protected String nombre;
    protected int capacidad;

    public Estadio (String nombre, int capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public int getcapacidad(){
        return capacidad;
    }

    public void setcapacidad(int capacidad){
        this.capacidad = capacidad;
    }


}