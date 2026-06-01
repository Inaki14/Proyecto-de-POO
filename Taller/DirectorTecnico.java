public class DirectorTecnico extends Persona{
    protected int fechaNombramiento;

    public DirectorTecnico(String nombre, int fecNacimiento, int fechaNombramiento){
        super(nombre, fecNacimiento);
        this.fechaNombramiento = fechaNombramiento;
    }

    public int fechaNombramiento(){
        return fechaNombramiento;
    }

    public void setfechaNombramiento(int fechaNombramiento){
        this.fechaNombramiento = fechaNombramiento;
    }
}
