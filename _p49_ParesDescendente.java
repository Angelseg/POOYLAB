import java.util.Scanner;

public class _p49_ParesDescendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número (n): ");
            int n = scanner.nextInt();

            if (n < 100) {
                System.out.println("Por favor, ingrese un número mayor o igual a 100.");
                continue;
            }

            int sumaPares = 0;
            int cantidadPares = 0;

            System.out.print("Números pares entre 100 y " + n + ": ");

            for (int i = 100; i <= n; i += 2) {
                System.out.print(i + " ");
                sumaPares += i;
                cantidadPares++;
            }

            double promedioPares = (double) sumaPares / cantidadPares;

            System.out.println("\nLa suma de los pares: " + sumaPares);
            System.out.println("El promedio de los pares: " + promedioPares);

            System.out.print("¿Deseas continuar (S/N)? ");
            String continuar = scanner.next().trim().toLowerCase();

            if (!continuar.equals("s")) {
                break;
            }
        }

        scanner.close();
    }
}