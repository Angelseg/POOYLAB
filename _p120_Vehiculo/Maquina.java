package _p120_Vehiculo;

public class Maquina {
    private String Nombre;
    private String Propetario;
    private int Pasajeros;

    public Maquina(String nombre, String propetario, int pasajeros) {
        Nombre = nombre;
        Propetario = propetario;
        Pasajeros = pasajeros;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void Repostar(){
        System.out.println("Repostando. . . ");
    }

    public void Arrancar(){
        System.out.println("Arrancando. . . ");
    }

    public void Frenar(){
        System.out.println("Frenando. . . ");
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getPropetario() {
        return Propetario;
    }


    public void setPropetario(String propetario) {
        Propetario = propetario;
    }


    public int getPasajeros() {
        return Pasajeros;
    }


    public void setPasajeros(int pasajeros) {
        Pasajeros = pasajeros;
    }


    @Override
    public String toString() {
        return "Maquina [Nombre=" + Nombre + ", Propetario=" + Propetario + ", Pasajeros=" + Pasajeros + "]";
    }

}
