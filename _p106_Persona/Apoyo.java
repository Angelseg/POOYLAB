package _p106_Persona;

public class Apoyo extends Persona {
    private String Escolaridad;
    private double Pago;
    public Apoyo() {}
    public Apoyo(Persona persona,String escolaridad, double pago) {
        super(persona.Nombre, persona.Direccion);
        Escolaridad = escolaridad;
        Pago = pago;
    }
    public Apoyo(String nombre, String direccion, String escolaridad, double pago) {
        super(nombre, direccion);
        Escolaridad = escolaridad;
        Pago = pago;
    }
    public String getEscolaridad() {
        return Escolaridad;
    }
    public void setEscolaridad(String escolaridad) {
        Escolaridad = escolaridad;
    }
    public double getPago() {
        return Pago;
    }
    public void setPago(double pago) {
        Pago = pago;
    }
    @Override
    public String toString() {
        return "Apoyo [" + super.toString() + " Escolaridad=" + Escolaridad + ", Pago=" + Pago + "]";
    }
    
}
