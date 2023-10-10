package _p104_PuntoCirculo;

public class Circulo {
    private Punto Centro;
    private double Radio;
    public Circulo() {
    }
    public Circulo(double radio) {
        Centro = new Punto();
        Radio = radio;
    }
    public Circulo(Punto centro, double radio){
        Centro = centro;
        Radio = radio;
    }
    public Punto getCentro() {
        return Centro;
    }
    public void setCentro(Punto centro) {
        Centro = centro;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    public double getArea(){
        return Math.PI * Math.pow(getRadio(), 2);
    }
    public double getCircunferencia() {
        // Calcula la circunferencia del círculo usando la fórmula C = 2 * π * r
        return 2 * Math.PI * getRadio();
    }
    public String toString() {
        return "Circulo [Centro=" + Centro + ", Radio=" + Radio + "]";
    }
    
}
