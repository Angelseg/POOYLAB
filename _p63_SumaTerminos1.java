//Se desea imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma

import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("¿Cuántos términos desea imprimir? ");
            int numeroTerminos = scanner.nextInt();

            if (numeroTerminos <= 0) {
                System.out.println("Por favor, ingrese un número de términos mayor a 0.");
                continue;
            }

            System.out.println("Salida:");

            double suma = 0.0;

            // Imprimir la secuencia y calcular la suma
            for (int i = 1; i <= numeroTerminos; i++) {
                double termino = 1.0 / i;
                suma += termino;

                if (i == 1) {
                    System.out.print("1");
                } else {
                    System.out.print(" + 1/" + i);
                }
            }

            System.out.println();
            System.out.println("Suma: " + suma);

            System.out.print("¿Desea imprimir otra secuencia (S/N)? ");
            String continuar = scanner.next().trim().toLowerCase();

            if (!continuar.equals("s")) {
                break;
            }
        }

        scanner.close();
    }
}
