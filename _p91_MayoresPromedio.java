import java.util.Scanner;

public class _p91_MayoresPromedio {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número de calificaciones
        System.out.print("Ingrese la cantidad de calificaciones: ");
        int n = scanner.nextInt();

        // Declarar un arreglo de números flotantes para almacenar las calificaciones
        float[] calificaciones = new float[n];

        // Capturar las calificaciones desde el usuario
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación #" + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }

        // Mostrar los elementos del arreglo
        System.out.print("Las calificaciones ingresadas son: ");
        for (float calificacion : calificaciones) {
            System.out.print(calificacion + " ");
        }
        System.out.println();

        // Calcular la suma y el promedio de las calificaciones
        float suma = 0;
        for (float calificacion : calificaciones) {
            suma += calificacion;
        }
        float promedio = suma / n;

        System.out.println("La suma de las calificaciones es: " + suma);
        System.out.println("El promedio de las calificaciones es: " + promedio);

        // Mostrar las calificaciones mayores al promedio y contar cuántas son
        int contadorMayoresAlPromedio = 0;
        System.out.print("Calificaciones mayores al promedio: ");
        for (float calificacion : calificaciones) {
            if (calificacion > promedio) {
                System.out.print(calificacion + " ");
                contadorMayoresAlPromedio++;
            }
        }
        System.out.println();
        System.out.println("Cantidad de calificaciones mayores al promedio: " + contadorMayoresAlPromedio);

        scanner.close();
    }
}
