//dada las horas calcular el equivalente en dias horas y segundos
import java.util.Scanner;

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        double horas, dias, minutos, segundo;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame una cantidad de horas: "); horas = obj.nextInt();
        
        dias = horas / 24;
        minutos = horas * 60;
        segundo = horas * 3600;

        System.out.println(horas + " horas son equivalentes a: ");
        System.out.println("dias: "+ dias);
        System.out.println("minutos: " + minutos);
        System.out.println("segundo: "+ segundo);

    }
}
