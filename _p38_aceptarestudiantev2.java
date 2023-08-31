// Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es aceptado. La Universidad Kitty Kat SA es solo para mujeres mayores de 21 años con un promedio de entre 8 y 9.5.

import java.util.Scanner;

public class _p38_aceptarestudiantev2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el nombre, sexo, edad y calificaciones
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el sexo del estudiante (h/m): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese la primera calificación: ");
        double calificacion1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera calificación: ");
        double calificacion3 = scanner.nextDouble();

        // Verificar si el estudiante cumple con los criterios de aceptación
        boolean aceptado = (sexo == 'm' && edad > 21 && calificacion1 >= 8.0 && calificacion1 <= 9.5
                && calificacion2 >= 8.0 && calificacion2 <= 9.5 && calificacion3 >= 8.0 && calificacion3 <= 9.5);

        // Imprimir el resultado
        if (aceptado) {
            System.out.println("\nEl estudiante " + nombre + " es aceptado en la Universidad Kitty Kat SA.");
        } else {
            System.out.println("\nEl estudiante " + nombre + " no cumple con los criterios de aceptación.");
        }

        System.out.println("programa terminado");
    }
}
