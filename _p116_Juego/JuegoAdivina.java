package _p116_Juego;

import java.util.Scanner;

public class JuegoAdivina implements Juego {
    private int num, intentos;
    private Scanner Teclado;
    private boolean nopudo;
    
    public JuegoAdivina(){
        Teclado = new Scanner(System.in);
    }

    public void iniciar(){
        num = 1 + (int) (Math.random() * 100);
    }

    public void jugar(){
        int num;
        do{
            System.out.println("Dame un numero entre 1 y 100: "); num = Teclado.nextInt();
            if(this.num<num) System.out.println("Dame menos prro, Te pasaste: ");
            else if(this.num>num) System.out.println("Dame mas prro, te quedaste abajo padre: ");
            intentos++;
            if(intentos==6){nopudo=true;break;}
        }while(this.num != num);
    }

    public void finalizar(){
        if(nopudo) System.out.println("El numero era " + this.num + " pero no pudiste, traer hambre o que ");
        else System.out.println(this.num + " es el numero oculto!!!, Ganaste el juego despues de " + intentos + " Intentos");
    }

}
