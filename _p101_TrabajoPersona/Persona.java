package _p101_TrabajoPersona;

public class Persona {
    private String  Nombre;
    private Trabajador Trabajo;
    public Persona() {
    }
    
    public Persona(String nombre, Trabajador trabajo) {
        Nombre = nombre;
        Trabajo = trabajo;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public Trabajador getTrabajo() {
        return Trabajo;
    }
    public void setTrabajo(Trabajador trabajo) {
        Trabajo = trabajo;
    }
    @Override
    public String toString() {
        return "Persona [Nombre=" + Nombre + ", Trabajo=" + Trabajo + "]";
    }
    
}
