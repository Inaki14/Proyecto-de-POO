import java.util.ArrayList;
import java.util.List;

public class Grupo {
    protected String identificacion;
    protected String descripcion;
    protected List<Seleccion> selecciones;

    public Grupo(String identificacion, String descripcion){
        this.identificacion = identificacion;
        this.descripcion = descripcion;
        this.selecciones = new ArrayList<>();
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

    public void agregarSelecciones(Seleccion s){
        this.selecciones.add(s);
    }
}
