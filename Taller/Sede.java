public class Sede{
 protected String ciudad;
 protected float alturaNivelMar;
 protected String clima;
 protected String zonaHoraria;

public Sede(String ciudad, float alturaNivelMar, String clima, String zonaHoraria){
    this.ciudad = ciudad;
    this.alturaNivelMar = alturaNivelMar;
    this.clima = clima;
    this.zonaHoraria = zonaHoraria;
}

public String getciudad(){
    return ciudad;
}

public void setciudad(String ciudad){
    this.ciudad = ciudad;
}

public float getalturanivelMar(){
    return alturaNivelMar;
}

public void setalturaNivelMar(float  alturaNivelMar){
    this.alturaNivelMar = alturaNivelMar;
}

public String clima(){
    return clima;
}

public void setclima(String clima){
    this.clima = clima;
}

public String zonaHoraria(){
    return zonaHoraria;
}


public void setzonaHoraria(String zonaHoraria){
    this.zonaHoraria = zonaHoraria;
}

}
