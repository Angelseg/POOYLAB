import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese la temperatura inicial en grados Celsius: ");
            double temperaturaInicial = scanner.nextDouble();

            System.out.print("Ingrese la temperatura final en grados Celsius (debe ser mayor o igual a la inicial): ");
            double temperaturaFinal = scanner.nextDouble();

            if (temperaturaFinal < temperaturaInicial) {
                System.out.println("La temperatura final no puede ser menor que la temperatura inicial.");
                continue;
            }

            System.out.println("Tabla de conversión de Celsius a Fahrenheit:");
            System.out.println("Celsius\tFahrenheit");

            for (double celsius = temperaturaInicial; celsius <= temperaturaFinal; celsius++) {
                double fahrenheit = celsius * 9 / 5 + 32;
                System.out.printf("%.2f\t%.2f%n", celsius, fahrenheit);
            }

            System.out.print("¿Deseas realizar otra conversión (S/N)? ");
            String continuar = scanner.next().trim().toLowerCase();

            if (!continuar.equals("s")) {
                break;
            }
        }

        scanner.close();
    }
}