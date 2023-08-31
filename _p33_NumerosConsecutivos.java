//Dados tres números enteros, verificar si son consecutivos (9,10,11) y mandar mensaje confirmándolo, si no lo son (1,4,6) mandar mensaje de error.

import java.util.Scanner;

public class _p33_NumerosConsecutivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número entero: ");
        int numero3 = scanner.nextInt();

        // Verificar si los números son consecutivos
        if (numero2 == numero1 + 1 && numero3 == numero2 + 1) {
            System.out.println("Los números son consecutivos (" + numero1 + ", " + numero2 + ", " + numero3 + ")");
        } else {
            System.out.println("Error: Los números no son consecutivos.");
        }

        System.out.println("programa terminado");
    }
}
