//Se desea imprimir la secuencia de términos, el número de renglones que el usuario desee y su suma

import java.util.Scanner;

public class _p64_SumaTerminos2 {
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

            int valorActual = 0;
            int suma = 0;

            for (int i = 1; i <= numeroTerminos; i++) {
                valorActual = valorActual * 10 + 1;
                suma += valorActual;
                System.out.print(valorActual);

                if (i < numeroTerminos) {
                    System.out.print("+");
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
