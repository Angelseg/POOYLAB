package _p113_SegundoExamenParcial;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String Nombre;
    private String Liga;
    private List<Jugador> Jugadores;
    
    public Equipo(String nombre, String liga) {
        Nombre = nombre;
        Liga = liga;
        Jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        Jugadores.add(jugador);
    }

    public List<Jugador> getJugadores() {
        return Jugadores;
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : Jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : Jugadores) {
            total += jugador.Total;
        }
        return total;
    }

    public int getTotalH() {
        int totalH = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.Sexo == 'H') {
                totalH++;
            }
        }
        return totalH;
    }

    public int getTotalM() {
        int totalM = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.Sexo == 'M') {
                totalM++;
            }
        }
        return totalM;
    }

    public void reporte() {
        System.out.println(">> Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores.size() + ", Bono=" + getTotalBono() + ", Total=" + getTotal() + ", Hombres=" + getTotalH() + ", Mujeres=" + getTotalM() + "]");

        for (Jugador jugador : Jugadores) {
            System.out.println(jugador);
        }
    }

    public String toString() {
        return ">> Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores.size() + ", Bono=" + getTotalBono() + ", Total=" + getTotal() + ", Hombres=" + getTotalH() + ", Mujeres=" + getTotalM() + "]";
    }

}
