//Convertir de pesos a dolares
import java.util.Scanner;
public class _p15_ConvertirDolares {
    public static void main(String[] args) {
        double pesos, dolar;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame la candidad de pesos a convertir: "); pesos = obj.nextFloat();

        dolar = pesos / 16.85;

        System.out.println(String.format("los %.2f que tienes en dolares es: " + dolar,pesos));
    }
}
