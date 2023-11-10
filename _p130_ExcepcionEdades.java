import java.util.InputMismatchException;
import java.util.Scanner;

public class _p130_ExcepcionEdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] edades = new int[5];

        System.out.println("Dame la Edad de 5 personas");

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Edad de la persona " + (i + 1) + ": ");
                edades[i] = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Tienen que ser un numero no una palabra genio");
                sc.next(); // Limpiar el buffer del scanner después de un error de tipo de entrada incorrecta
                i--; // Permite al usuario volver a ingresar la edad actual
            }
        }

        System.out.println("Las edades que diste son:  ");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
    }
}
