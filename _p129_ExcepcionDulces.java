import java.util.InputMismatchException;
import java.util.Scanner;


public class _p129_ExcepcionDulces {
    public static void main(String[] args) {
        
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("¿Cuantos morrilos hay en el barrio?"); int niños = obj.nextInt();
            System.out.println("¿Cuantos dulces tenemos?"); int dulces = obj.nextInt();
            if(dulces == 0){
                System.err.println("No hay dulces, que quieres repartitr?");
            } else{
                int dulceaniño = dulces / niños;
                System.out.println("A cada mocoso le toca " + dulceaniño + " dulces");
            }
        } catch (InputMismatchException e) {
            System.out.println("La cantidad de niños y dulces debe ser numerica ");
            System.out.println("Mensaje del sistema > " + e);
        } catch(ArithmeticException e){
            System.out.println("Que pa se te durmio, pero te lo recuerdo, NO SE PUEDE DIVIR 0 >:(");
        }

    }
}
