public class Arbitro extends Persona {
    protected int aniosExperiencia;
    protected Pais pais;

    public Arbitro(String nombre, int fecNacimiento, int aniosExperiencia, Pais pais){
        super(nombre, fecNacimiento);
        this.aniosExperiencia = aniosExperiencia;
        this.pais = pais;

    }

    public int aniosExperiencia(){
        return aniosExperiencia;
    }

    public void setaniosExperiencia(int aniosExperiencia){
        this.aniosExperiencia = aniosExperiencia;
    }

    public Pais getPais(){
        return pais;
    }

    public void setPais(Pais pais){
        this.pais = pais;
    }
}
