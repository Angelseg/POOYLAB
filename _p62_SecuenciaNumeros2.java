//Se desea imprimir la secuencia de números mostrados el número de renglones que el usuario desee

import java.util.Scanner;

public class _p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el número de filas para el triángulo: ");
            int numeroFilas = scanner.nextInt();

            if (numeroFilas <= 0) {
                System.out.println("Por favor, ingrese un número de filas mayor a 0.");
                continue;
            }

            System.out.println("Triángulo de números:");

            for (int i = 1; i <= numeroFilas; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            System.out.print("¿Deseas imprimir otro triángulo (S/N)? ");
            String continuar = scanner.next().trim().toLowerCase();

            if (!continuar.equals("s")) {
                break;
            }
        }

        scanner.close();
    }
}
