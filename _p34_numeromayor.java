//Dados tres números enteros, verificar cual es el mayor.

import java.util.Scanner;

public class _p34_numeromayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número entero: ");
        int numero3 = scanner.nextInt();

        // Inicializamos una variable para almacenar el mayor número
        int mayor = numero1;

        // Comparamos el segundo número con el mayor actual
        if (numero2 > mayor) {
            mayor = numero2;
        }

        // Comparamos el tercer número con el mayor actual
        if (numero3 > mayor) {
            mayor = numero3;
        }

        System.out.println("El número mayor es: " + mayor);

        System.out.println("programa terminado");
    }
}
