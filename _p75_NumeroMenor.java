//Dados tres numeros regresar el menor de los tres

import java.util.Scanner;

public class _p75_NumeroMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 4 números enteros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int menor = encontrarMenor(num1, num2, num3, num4);

        System.out.println("El número menor es: " + menor);

        scanner.close();
    }

    public static int encontrarMenor(int a, int b, int c, int d) {
        int menor = a;

        if (b < menor) {
            menor = b;
        }

        if (c < menor) {
            menor = c;
        }

        if (d < menor) {
            menor = d;
        }

        return menor;
    }
}
