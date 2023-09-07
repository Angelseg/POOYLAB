//Se desea imprimir los números impares de forma ascendente desde 1 hasta el número que el usuario decida (n),
//además deberá imprimirse la suma y el promedio de esos números impares. El proceso debe de poder repetirse
//hasta que el usuario lo decida.
//Ejemplo: Números impares entre 1 y 10: 1 3 5 7 9,
//la suma: 25, el promedio: 5, ¿Deseas continuar (S/N)?


import java.util.Scanner;

public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número (n): ");
            int n = scanner.nextInt();

            if (n < 1) {
                System.out.println("Por favor, ingrese un número mayor o igual a 1.");
                continue;
            }

            int sumaImpares = 0;
            int cantidadImpares = 0;

            System.out.print("Números impares entre 1 y " + n + ": ");

            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    sumaImpares += i;
                    cantidadImpares++;
                }
            }

            double promedioImpares = (double) sumaImpares / cantidadImpares;

            System.out.println("\nLa suma de los impares: " + sumaImpares);
            System.out.println("El promedio de los impares: " + promedioImpares);

            System.out.print("¿Deseas continuar (S/N)? ");
            String continuar = scanner.next().trim().toLowerCase();

            if (!continuar.equals("s")) {
                break;
            }
        }

        scanner.close();
    }
}