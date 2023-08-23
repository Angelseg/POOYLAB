//Se desea calcular el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo

import java.util.Scanner;

public class _p11_CalcularAngulo {
    public static void main(String[] args) {
        double angulo1, angulo2, angulo3;
        Scanner obj = new Scanner(System.in);

        System.out.print("dame el primer angulo: "); angulo1 = obj.nextFloat();
        System.out.print("dame el segundo angulo: "); angulo2 = obj.nextFloat();
        angulo3 = 180 - (angulo1 + angulo2);

        System.out.println("el tercer angulo dado los otros dos angulos del triangulo es: " + angulo3);
    }    
}
