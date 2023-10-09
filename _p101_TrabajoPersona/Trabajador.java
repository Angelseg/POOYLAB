package _p101_TrabajoPersona;

public class Trabajador {
    private int ID;
    private String Rol;
    private double Salario;
    public Trabajador() {
    }
    public Trabajador(int id, String rol,double salario) {
        ID = id;
        Rol = rol;
        Salario = salario;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getRol() {
        return Rol;
    }
    public void setRol(String rol) {
        Rol = rol;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    @Override
    public String toString() {
        return "Trabajador [ID=" + ID + ", Rol=" + Rol + ", Salario=" + Salario + "]";
    }
    
}
