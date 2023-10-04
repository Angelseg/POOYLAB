package _p98_Circulo;

public class Circulo {
    private double Radio;
    private double Area;
    private double Circunferencia;

    public Circulo() {
    }

    public Circulo(double radio) {
        Radio = radio;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    public double getArea() {
        return Math.PI * Math.pow(Radio, 2);
    }
    public void setArea(double area) {
        Area = area;
    }
    public double getCircunferencia() {
        return  2 * Math.PI * Radio;
    }
    public void setCircunferencia(double circunferencia) {
        Circunferencia = circunferencia;
    }
    public String toString() {
        return "Circulo [Radio = " + Radio + "]";
    }

    
}
