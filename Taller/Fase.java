import java.util.ArrayList;
import java.util.List;

public class Fase {
    protected NombreFase nombre;
    protected List<Partido> partidos;

    public Fase(NombreFase nombre){
        this.nombre = nombre;
        this.partidos = new ArrayList<>();
    }

    public NombreFase getNombre(){
        return nombre;
    }

    public void setNombre(NombreFase nombre){
        nombre = this.nombre;
    }

    public void agregarPartidos(Partido p){
        this.partidos.add(p);
    }
}
