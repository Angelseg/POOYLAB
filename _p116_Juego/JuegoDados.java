package _p116_Juego;

import java.util.Scanner;

public class JuegoDados implements Juego {
    private int Dado1, Dado2;
    private String Jugador1, Jugador2;
    private Scanner teclado;

    public JuegoDados() {
        teclado = new Scanner(System.in);
    }

    public void iniciar(){
        System.out.println("Jugador 1: "); Jugador1 = teclado.nextLine();
        System.out.println("Jugador 2: "); Jugador2 = teclado.nextLine();
    }

    public void jugar(){
        Dado1 = 1 + (int) (Math.random() * 6);
        Dado2 = 1 + (int) (Math.random() * 6);
        System.out.println(Jugador1 + " Tu dado ha dado :" + Dado1);
        System.out.println(Jugador2 + " Tu dado ha dado :" + Dado2);
    }

    public void finalizar(){
        if(Dado1 > Dado2) System.out.println("Gano "+ Jugador1 + " por que tu dado dio " + Dado1);
        else if(Dado2 > Dado1)System.out.println("Gano " + Jugador2 + " por que tu dado dio " + Dado2 );
        else System.out.println("Nos tenemos que partir la madre por que salimos iguales");
    }
}
