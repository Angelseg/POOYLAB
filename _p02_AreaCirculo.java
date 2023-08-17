//Calcula el area de un circulo
import java.util.Scanner;

public class _p02_AreaCirculo {
    public static void main(String[] args) {
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.println("\nCalcular el area de un circulo\n");
        System.out.print("dame el radio : ");
        radio = lradio.nextFloat();
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("el area del circulo de radio " + radio +" es: " + area);

    }
}
