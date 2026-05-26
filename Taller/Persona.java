public class Persona {
    protected String nombre;
    protected int fecNacimiento;


    public Persona(String nombre, int fecNacimiento){
        this.nombre = nombre;
        this.fecNacimiento = fecNacimiento;
    }

    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public int fecNacimiento(){
        return fecNacimiento;
    }

    public void setfecNacimiento(int fecNacimiento){
        this.fecNacimiento = fecNacimiento;
    }

}
