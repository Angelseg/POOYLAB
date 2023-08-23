//Se desea calcular el volumen de un cilindro dado su radio y altura

import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        double volumen, radio, altura;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Dame la altura del cilindro: "); altura = obj.nextFloat();
        System.out.print("Dame el radio del cilindro: "); radio = obj.nextFloat();

        volumen = Math.PI * (radio * radio) * altura;

        System.out.println(String.format("el cilindro con un radio de %.2f y altura de %.2f tiene un volumen de: " + volumen, radio,altura));
    }
}
