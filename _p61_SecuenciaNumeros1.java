//Se desea imprimir la secuencia de números mostrados el número de renglones que el usuario desee:

import java.util.Scanner;

public class _p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("¿Cuántos renglones desea imprimir? ");
            int numeroRenglones = scanner.nextInt();

            if (numeroRenglones <= 0) {
                System.out.println("Por favor, ingrese un número de renglones mayor a 0.");
                continue;
            }

            System.out.println("Salida:");

            for (int i = 1; i <= numeroRenglones; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            System.out.print("¿Desea imprimir otra secuencia (S/N)? ");
            String continuar = scanner.next().trim().toLowerCase();

            if (!continuar.equals("s")) {
                break;
            }
        }

        scanner.close();
    }
}
