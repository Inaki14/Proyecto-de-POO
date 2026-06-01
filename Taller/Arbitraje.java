public class Arbitraje {
    private CategoriaArbitro rol;
    private Arbitro arbitro; 

    public Arbitraje(CategoriaArbitro rol, Arbitro arbitro) {
        this.rol = rol;
        this.arbitro = arbitro;
    } 

    public CategoriaArbitro getrol(){
        return rol;
    }

    public void setRol(CategoriaArbitro rol){
        this.rol = rol;
    }

    public Arbitro getArbitro(){
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro){
        this.arbitro = arbitro;
    }

}
