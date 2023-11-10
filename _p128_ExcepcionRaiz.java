import java.util.InputMismatchException;
import java.util.Scanner;

public class _p128_ExcepcionRaiz {
    public static void main(String[] args) {
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("Dame un numero: "); double a = obj.nextDouble();
            double resultado = Math.sqrt(a);
            System.out.println("La raiz de tu numero es: " + resultado);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Mensaje de error: " + e);
        }
    }

}
