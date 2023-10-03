import java.util.Scanner;

public class _p92_MayorMenor {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número de elementos
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        // Declarar un arreglo de números enteros para almacenar los números
        int[] numeros = new int[n];

        // Capturar los números desde el usuario
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los elementos del arreglo
        System.out.print("Los números ingresados son: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Encontrar el número mayor y el número menor
        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];

        for (int i = 1; i < n; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);

        scanner.close();
    }
}
