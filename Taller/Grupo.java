public class Grupo {
    protected String identificacion;
    protected String descripcion;

    public Grupo(String identificacion, String descripcion){
        this.identificacion = identificacion;
        this.descripcion = descripcion;
    }

    public String getidentificacion(){
        return identificacion;
    }

    public void setidentificacion(String identificacion){
        this.identificacion = identificacion;
    }

    public String getdescripcion(){
        return descripcion;
    }

    public void setdescripcion(String descripcion){
        this.descripcion = descripcion;
    }




}
