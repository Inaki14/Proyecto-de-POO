import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Partido {
    protected LocalDate fecha;
    protected LocalTime horario;
    protected int duracion;
    protected int tiempoAdicional;
    protected Estadio estadio;
    protected List<Evento> eventos;
    protected List<Participacion> participaciones;
    protected List<Arbitraje> arbitrajes;

    public Partido(LocalDate fecha, LocalTime horario, int duracion, int tiempoAdicional, Estadio estadio){
        this.fecha = fecha;
        this.horario = horario;
        this.duracion = duracion;
        this.tiempoAdicional = tiempoAdicional;
        this.estadio = estadio;
        this.eventos = new ArrayList<>();
        this.participaciones = new ArrayList<>();
        this.arbitrajes = new ArrayList<>();
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public LocalTime getHorario(){
        return horario;
    }

    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }

    public void setHorario(LocalTime horario){
        this.horario = horario;
    }

    public int getduracion(){
        return duracion;
    }
    
    public Estadio getEstadio(){
        return estadio;
    }

    public int getTiempoAdicional(){
        return tiempoAdicional;
    }
    
    public void setduracion(int duracion){
        this.duracion = duracion;
    }

    public void setTiempoAdicional(int tiempoAdicional){
        this.tiempoAdicional = tiempoAdicional;
    }

    public void setEstadio(Estadio estadio){
        this.estadio = estadio;
    }
    
    public void agregarEvento(Evento e){
        this.eventos.add(e);
    }

    public void agregarParticipacion(Participacion p){
        this.participaciones.add(p);
    }

    public void agregarArbitraje(Arbitraje a){
        this.arbitrajes.add(a);
    }
}
