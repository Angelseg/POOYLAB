//calcula el area de un triangulo
import java.util.Scanner;

public class _p03_Areatriangulo {
    public static void main(String[] args) {
    int base,altura;
    double area;
    Scanner obj = new Scanner(System.in);
    
    System.out.print("dame la base: ");
    base = obj.nextInt();
    System.out.print("dame la altura: ");
    altura = obj.nextInt();

    area = base + altura /2;

    System.out.println(String.format("el triangulo de base %d y altura %d tiene un area de %f",base,altura,area));
    
    }
    

}
