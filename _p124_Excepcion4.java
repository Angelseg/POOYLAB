import java.util.InputMismatchException;
import java.util.Scanner;

public class _p124_Excepcion4 {
    public static void main(String[] args) {
        
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("Dame el numerador: "); int a = obj.nextInt();
            System.out.println("Dame el denominador: "); int b = obj.nextInt();
            int c = a/b;
            System.out.println("El resultado es: " + c);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Ambos valores deben ser numericos y el denominador no debe ser cero :)");
            System.out.println("Mensaje del sistema > " + e);
        }finally{
            System.out.println("Hemos terminado, si la regaste nimodillo pa y si no Felicidades pa");
        }
    }
}
