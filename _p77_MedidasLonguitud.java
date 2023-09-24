//Diseña un programa con dos funciones una que convierta pulgadas a centímetros y otra que convierta de metros a
//pies. Deberá́ mostrar un menú́ con las opciones correspondientes.

import java.util.Scanner;

public class _p77_MedidasLonguitud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Convertir pulgadas a centímetros");
            System.out.println("2. Convertir metros a pies");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de pulgadas a convertir a centímetros: ");
                    double pulgadas = scanner.nextDouble();
                    double centimetros = convertirPulgadasACentimetros(pulgadas);
                    System.out.println(pulgadas + " pulgadas son aproximadamente " + centimetros + " centímetros.");
                    break;

                case 2:
                    System.out.print("Ingrese la cantidad de metros a convertir a pies: ");
                    double metros = scanner.nextDouble();
                    double pies = convertirMetrosAPies(metros);
                    System.out.println(metros + " metros son aproximadamente " + pies + " pies.");
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

    public static double convertirPulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public static double convertirMetrosAPies(double metros) {
        return metros * 3.281;
    }
}
