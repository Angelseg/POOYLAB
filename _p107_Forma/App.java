package _p107_Forma;

import java.text.Normalizer.Form;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //Forma forma1 = new Forma("Azul"); no puedes crear instancias de un clase abstracta
        
        Circulo circulo = new Circulo("Rojo", 10.3);
        System.out.println(circulo);
        System.out.println("Area cirulo    : " + circulo.getArea());
        System.out.println();

        Triangulo triangulo = new Triangulo("Verde", 10, 20);
        System.out.println(triangulo);
        System.out.println("Area triangulo : " + triangulo.getArea());

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(triangulo);
        formas.add(new Circulo("Prieto", 33.50));

        System.out.println("\n\nTodas las formas");
        for (Forma forma : formas){
            System.out.println(forma);
            System.out.println("El area del " + (forma instanceof Circulo?"Circulo: ":"Triangulo: "));
            System.out.println(forma.getArea());
        }
    }
}
