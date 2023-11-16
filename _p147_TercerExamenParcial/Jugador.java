package _p147_TercerExamenParcial;

import java.io.Serializable;

public class Jugador implements Serializable {
    String Nombre;
    int Edad;
    char Sexo;
    String EstCiv;
    String Descripcion;
    double Salario;
    
    public Jugador() {
    }
    
    public Jugador(String nombre, int edad, char sexo, String estCiv, String descripcion, double salario) {
        Nombre = nombre;
        Edad = edad;
        Sexo = sexo;
        EstCiv = estCiv;
        Descripcion = descripcion;
        Salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        Sexo = sexo;
    }

    public String getEstCiv() {
        return EstCiv;
    }

    public void setEstCiv(String estCiv) {
        EstCiv = estCiv;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    
}
