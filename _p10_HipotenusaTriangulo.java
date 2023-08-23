//Se desea calcular la hipotenusa de un triángulo rectángulo dadas las longitudes de sus lados

import java.util.Scanner;

public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        double hipotenusa, lado1, lado2, raizcudarada;
        Scanner obj = new Scanner(System.in);

        System.out.print("dame el lado 1 del triangulo : "); lado1 = obj.nextFloat();
        System.out.print("dame el lado 2 del triangulo : "); lado2 = obj.nextFloat();
        
        raizcudarada = Math.sqrt( lado1 * lado1 + lado2 * lado2);
        hipotenusa = raizcudarada;
        
        System.out.println(String.format("la hipotenusa de tu trangulo con lados %.2f y %.2f  es de %.2f",lado1,lado2,raizcudarada));
    }
}
