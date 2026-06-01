import java.time.LocalDate;
import java.time.LocalTime;

public class Partido {
    private LocalDate fecha;
    private LocalTime horario;
    protected int duracion;
    protected int tiempoAdicional;
    protected Estadio estadio;

    public Partido(LocalDate fecha, LocalTime horario, int duracion, int tiempoAdicional, Estadio estadio){
        this.fecha = fecha;
        this.horario = horario;
        this.duracion = duracion;
        this.tiempoAdicional = tiempoAdicional;
        this.estadio = estadio;
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
}
