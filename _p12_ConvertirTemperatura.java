//Se desea convertir una temperatura de grados fahrenheit a grados celsius

import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        double gradosC, gradosF;
        Scanner obj = new Scanner(System.in);

        System.out.print("dame la temperatura en grados Fahrenheit: "); gradosF = obj.nextFloat();

        gradosC = (gradosF - 32)* 5/9;

        System.out.println(String.format("La temperatura %.2f grados Fahrenheit convertida a grados Celcius es de :" + gradosC,gradosF));
    }
}
