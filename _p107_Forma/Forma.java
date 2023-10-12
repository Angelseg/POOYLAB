package _p107_Forma;
// Esta calse es el prototipo, solo se podra eredad
public abstract class Forma {
    private String Color;

    public Forma() {
    }

    public Forma(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
    public String toString() {
        return "Forma [Color=" + Color + "]";
    }
    public abstract double getArea();
}
