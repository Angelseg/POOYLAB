import java.util.Scanner;

public class _p79_Angulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un ángulo en grados (entre 0 y 360): ");
            int angulo = scanner.nextInt();

            if (angulo >= 0 && angulo <= 360) {
                String tipo = determinarTipoAngulo(angulo);
                System.out.println("El ángulo es " + tipo);
            } else {
                System.out.println("El ángulo no está en el rango válido (0 a 360 grados).");
            }

            System.out.print("¿Desea ingresar otro ángulo (S/N)? ");
            String continuar = scanner.next().trim().toLowerCase();

            if (!continuar.equals("s")) {
                break;
            }
        }

        scanner.close();
    }

    public static String determinarTipoAngulo(int angulo) {
        if (angulo < 90) {
            return "agudo";
        } else if (angulo == 90) {
            return "recto";
        } else if (angulo > 90 && angulo < 180) {
            return "obtuso";
        } else if (angulo == 180) {
            return "llano";
        } else {
            return "concavo";
        }
    }
}