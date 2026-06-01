import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    protected String nombreFederacion;
    protected String camisetaPrincipal;
    protected String camisetaSecundaria;
    protected boolean cabezaGrupo;
    protected int rankingFIFA;
    protected DirectorTecnico tecnico;
    protected Pais pais;
    protected List<Jugador> jugadores;
    protected List<CuerpoTecnico> cuerpoTecnico;
    
    public Seleccion(String nombreFederacion, String camisetaPrincipal,String camisetaSecundaria, boolean cabezaGrupo, int rankingFIFA, DirectorTecnico tecnico, Pais pais) {
        this.nombreFederacion = nombreFederacion;
        this.camisetaPrincipal = camisetaPrincipal;
        this.camisetaSecundaria = camisetaSecundaria;
        this.cabezaGrupo = cabezaGrupo;
        this.rankingFIFA = rankingFIFA;
        this.tecnico = tecnico;
        this.pais = pais;
        this.jugadores = new ArrayList<>();
        this.cuerpoTecnico = new ArrayList<>();
    }


    public String getNombreFederacion() {
        return nombreFederacion;
    }

    public void setNombreFederacion(String nombreFederacion) {
        this.nombreFederacion = nombreFederacion;
    }

    public String getCamisetaPrincipal() {
        return camisetaPrincipal;
    }

    public void setCamisetaPrincipal(String camisetaPrincipal) {
        this.camisetaPrincipal = camisetaPrincipal;
    }

    public String getCamisetaSecundaria() {
        return camisetaSecundaria;
    }

    public void setCamisetaSecundaria(String camisetaSecundaria) {
        this.camisetaSecundaria = camisetaSecundaria;
    }

    public boolean isCabezaGrupo() {
        return cabezaGrupo;
    }

    public void setCabezaGrupo(boolean cabezaGrupo) {
        this.cabezaGrupo = cabezaGrupo;
    }

    public int getRankingFIFA() {
        return rankingFIFA;
    }

    public void setRankingFIFA(int rankingFIFA) {
        this.rankingFIFA = rankingFIFA;
    }

    public void setDirectorTecnico(DirectorTecnico tecnico) {
        this.tecnico = tecnico;
    }

    public void setPais(Pais pais){
        this.pais = pais;
    }

    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public void agregarCuerpoTec( CuerpoTecnico miembro){
        this.cuerpoTecnico.add(miembro);
    }
}



