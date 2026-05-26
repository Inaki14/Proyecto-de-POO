public class Mundial {
    protected int anio;
    protected String mascota;
    protected int fechaDesde;
    protected int fechaHasta;

    public Mundial(int anio, String mascota, int fechaDesde, int fechaHasta){
        this.anio = anio;
        this.mascota = mascota;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public int getanio(){
        return anio;
    }

    public void setanio(int anio){
        this.anio = anio;
    }

    public String getmascota(){
        return mascota;
    }

    public void setmascota(String mascota){
        this.mascota = mascota;
    }

    public int getfechaDesde(){
        return fechaDesde;
    }

    public void setfechaDesde(int fechaDesde){
        this.fechaDesde = fechaDesde;
    }

    public int getfechaHasta(){
        return fechaHasta;
    }

    public void setfechaHasta(int fechaHasta){
        this.fechaHasta = fechaHasta;
    }


}
