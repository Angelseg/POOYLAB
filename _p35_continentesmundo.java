//Dado un número entero entre 1 y 6 que corresponde a un continente del mundo, escribir su nombre: 1 Asia, 2 África, 3 América del Norte, 4 América del Sur, 5 Antártida, 6 Europa. Si el número no está en el rango especificado, mostrar un mensaje de error.

import java.util.Scanner;

public class _p35_continentesmundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 6: ");
        int numero = scanner.nextInt();

        String continente;

        switch (numero) {
            case 1:
                continente = "Asia";
                break;
            case 2:
                continente = "África";
                break;
            case 3:
                continente = "América del Norte";
                break;
            case 4:
                continente = "América del Sur";
                break;
            case 5:
                continente = "Antártida";
                break;
            case 6:
                continente = "Europa";
                break;
            default:
                continente = "Error, el número no está en el rango especificado";
        }

        System.out.println("El continente correspondiente al número " + numero + " es: " + continente);

        System.out.println("programa terminado");
    }
}
