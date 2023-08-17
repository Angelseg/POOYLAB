//calcular la paga de un trabajador
import java.util.Scanner;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga,tasa,impuesto,pagabruta,paganeta;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Dame tu nombre: "); nombre = obj.nextLine();
        System.out.print("Dame tus horas trabajadas: "); horas = obj.nextInt();
        System.out.print("cuanto te pagan por hora: "); paga = obj.nextFloat();
        tasa = 0.03;

        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;


        System.out.println("el impuesto es de : " + tasa);
        System.out.println(String.format("El trabajador %s, trabajo %d horas, a una paga de %.2f pesos por hora, con una tasa de impuestos de %.2f", nombre,horas,paga,tasa));
        System.out.println(String.format("paga bruta  %.2f",pagabruta));
        System.out.println(String.format("impuestos  %.2f",impuesto));
        System.out.println(String.format("paga neta  %.2f",paganeta));


    }
}
