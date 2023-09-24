//Diseña un programa con una función que pida un número entero entre 1 y 7 y devuelva el día de la semana con
//letra. Deberá validar que el número está en el rango adecuado

import java.util.Scanner;

public class _p76_DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDia;
        String nombreDia;

        do {
            System.out.print("Ingrese un número entero entre 1 y 7: ");
            numeroDia = scanner.nextInt();
        } while (numeroDia < 1 || numeroDia > 7);

        nombreDia = obtenerNombreDia(numeroDia);

        System.out.println("El día de la semana correspondiente al número " + numeroDia + " es " + nombreDia);

        scanner.close();
    }

    public static String obtenerNombreDia(int numeroDia) {
        switch (numeroDia) {
            case 1:
                return "L";
            case 2:
                return "Ma";
            case 3:
                return "Mi";
            case 4:
                return "J";
            case 5:
                return "V";
            case 6:
                return "S";
            case 7:
                return "D";
            default:
                return "Número de día no válido";
        }
    }
}
