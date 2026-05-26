public class DirectorTecnico {
    protected int fechaNombramiento;

    public DirectorTecnico(int fechaNombramiento){
        this.fechaNombramiento = fechaNombramiento;
    }

    public int fechaNombramiento(){
        return fechaNombramiento;
    }

    public void setfechaNombramiento(int fechaNombramiento){
        this.fechaNombramiento = fechaNombramiento;
    }
}
