package _p99_Rectangulo;

public class Rectangulo {
    private Float Largo, Ancho, Area, Perimetro;

    public Rectangulo() {
    }
    public Rectangulo(Float largo,Float ancho) {
        Largo = largo;
        Ancho = ancho;
    }
    public Float getLargo() {
        return Largo;
    }
    public void setLargo(Float largo) {
        Largo = largo;
    }
    public Float getAncho() {
        return Ancho;
    }
    public void setAncho(Float ancho) {
        Ancho = ancho;
    }
    public Float getArea() {
        return Largo*Ancho;
    }
    public Float getPerimetro() {
        return 2*(Largo+Ancho);
    }
    public String toString() {
        return "Rectangulo [Largo = "+ Largo + " Ancho = "+ Ancho +"]";
    }
}
