//Diseña un programa con una función que reciba tres parámetros: dos números que corresponden a un rango (ini,
//fin), otro número constante que es 3 o 4 regrese la suma de números múltiplos de 3 o múltiplos de 4 en el rango
//de números especificados.

import java.util.Scanner;

public class _p78_SumaMultiplos {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Suma de múltiplos de 3 en un rango");
            System.out.println("2. Suma de múltiplos de 4 en un rango");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor inicial del rango: ");
                    int ini1 = scanner.nextInt();
                    System.out.print("Ingrese el valor final del rango: ");
                    int fin1 = scanner.nextInt();

                    if (ini1 < fin1) {
                        int sumaMultiplos3 = sumaMultiplos(ini1, fin1, 3);
                        System.out.println("La suma de los múltiplos de 3 en el rango es: " + sumaMultiplos3);
                    } else {
                        System.out.println("El rango no es válido (inicio debe ser menor que fin).");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el valor inicial del rango: ");
                    int ini2 = scanner.nextInt();
                    System.out.print("Ingrese el valor final del rango: ");
                    int fin2 = scanner.nextInt();

                    if (ini2 < fin2) {
                        int sumaMultiplos4 = sumaMultiplos(ini2, fin2, 4);
                        System.out.println("La suma de los múltiplos de 4 en el rango es: " + sumaMultiplos4);
                    } else {
                        System.out.println("El rango no es válido (inicio debe ser menor que fin).");
                    }
                    break;

                case 3:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    public static int sumaMultiplos(int ini, int fin, int constante) {
        int suma = 0;

        for (int i = ini; i <= fin; i++) {
            if (i % constante == 0) {
                suma += i;
            }
        }

        return suma;
    }
}
