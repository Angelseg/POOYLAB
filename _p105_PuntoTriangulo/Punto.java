package _p105_PuntoTriangulo;

public class Punto {
    private int X;
    private int Y;
    public Punto() {
    }
    public Punto(int x, int y) {
        X = x;
        Y = y;
    }
    public int getX() {
        return X;
    }
    public void setX(int x) {
        X = x;
    }
    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }
    public String toString() {
        return "Punto [X=" + X + ", Y=" + Y + "]";
    }
    
}
