import java.util.Random;

public class _p93_ParesImpares {
    public static void main(String[] args) {
        int MAX = 100;
        int[] a = new int[MAX];
        int[] b = new int[MAX];

        // Rellenar el arreglo a[] con números aleatorios entre 0 y 20
        Random random = new Random();
        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(21); // Números aleatorios entre 0 y 20
        }

        // Mostrar elementos del arreglo a[]
        System.out.print("Elementos del arreglo a[]: ");
        for (int i = 0; i < MAX; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Mostrar elementos pares y contarlos
        int contadorPares = 0;
        System.out.print("Elementos pares del arreglo a[]: ");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                contadorPares++;
            }
        }
        System.out.println();
        System.out.println("Cantidad de elementos pares: " + contadorPares);

        // Mostrar elementos impares y contarlos
        int contadorImpares = 0;
        System.out.print("Elementos impares del arreglo a[]: ");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                contadorImpares++;
            }
        }
        System.out.println();
        System.out.println("Cantidad de elementos impares: " + contadorImpares);
    }
}
