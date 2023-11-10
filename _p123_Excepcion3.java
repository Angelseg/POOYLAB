import java.util.InputMismatchException;
import java.util.Scanner;

public class _p123_Excepcion3 {
    public static void main(String[] args) {
        
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("Dame el numerador: "); int a = obj.nextInt();
            System.out.println("Dame el denominador: "); int b = obj.nextInt();
            int c = a/b;
            System.out.println("El resultado es: " + c);
        } catch (InputMismatchException e) {
            System.out.println("Ambos valores deben ser numericos :)");
        }catch(ArithmeticException e){
            System.out.println("El denominador no puede ser cero");
        }finally{
            System.out.println("Hemos terminado, si la regaste nimodillo pa y si no Felicidades pa");
        }
    }
}
