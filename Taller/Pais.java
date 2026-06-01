public class Pais {
    protected String nombre;
    protected String bandera;


    public Pais (String nombre, String bandera){
        this.nombre = nombre;
        this.bandera = bandera;
    }

    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }


    public String getbandera(){
        return nombre;
    }

    public void setbandera(String bandera){
        this.bandera = bandera;
    }
}
