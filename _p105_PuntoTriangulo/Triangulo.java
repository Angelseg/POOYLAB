package _p105_PuntoTriangulo;

public class Triangulo {
    private Punto V1;
    private Punto V2;
    private Punto V3;
    public Triangulo() {
    }
    public Triangulo(Punto v1, Punto v2, Punto v3) {
        V1 = v1;
        V2 = v2;
        V3 = v3;
    }
    public Punto getV1() {
        return V1;
    }
    public void setV1(Punto v1) {
        V1 = v1;
    }
    public Punto getV2() {
        return V2;
    }
    public void setV2(Punto v2) {
        V2 = v2;
    }
    public Punto getV3() {
        return V3;
    }
    public void setV3(Punto v3) {
        V3 = v3;
    }
    public double calcularDistancia(Punto p1, Punto p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
     public double getPerimetro() {
        double distancia1 = calcularDistancia(V1, V2);
        double distancia2 = calcularDistancia(V2, V3);
        double distancia3 = calcularDistancia(V3, V1);
        return distancia1 + distancia2 + distancia3;
    }
    public String getTipo() {
        double distancia1 = calcularDistancia(V1, V2);
        double distancia2 = calcularDistancia(V2, V3);
        double distancia3 = calcularDistancia(V3, V1);

        if (distancia1 == distancia2 && distancia2 == distancia3) {
            return "Equilátero";
        } else if (distancia1 == distancia2 || distancia2 == distancia3 || distancia3 == distancia1) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    public String toString() {
        return "Triangulo [V1=" + V1 + ", V2=" + V2 + ", V3=" + V3 + "]";
    }
    
}
