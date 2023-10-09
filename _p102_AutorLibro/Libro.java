package _p102_AutorLibro;

public class Libro {
    private String Isdn;
    private String Nombre;
    private Autor Autor;
    private double Precio;
    private int Cantidad;
    public Libro() {
    }
    public Libro(String isdn, String nombre, _p102_AutorLibro.Autor autor, double precio, int cantidad) {
        Isdn = isdn;
        Nombre = nombre;
        Autor = autor;
        Precio = precio;
        Cantidad = cantidad;
    }
    public String getIsdn() {
        return Isdn;
    }
    public void setIsdn(String isdn) {
        Isdn = isdn;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public Autor getAutor() {
        return Autor;
    }
    public void setAutor(Autor autor) {
        Autor = autor;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    public String toString() {
        return "Libro [Isdn=" + Isdn + ", Nombre=" + Nombre + ", Autor=" + Autor + ", Precio=" + Precio + ", Cantidad="
                + Cantidad + "]";
    }
    
}
