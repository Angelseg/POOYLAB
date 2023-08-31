//Se desea calcular el promedio de 5 calificaciones introducidas por el usuario, luego evaluar el resultado e imprimir un mensaje de acuerdo con el promedio obtenido: 
//• >0 y <= 6 Quedas reprobado
//• >6 a <=7 Pasas de panzazo
//• >7 y <=8 Muy bien, pues mejorar
//• >8 y <=9 Excelente sigue así
//• >9 y <=10 Perfecto tu esfuerzo valió la pena

import java.util.Scanner;

public class _p37_calculonotas {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las 5 calificaciones
        double sumaCalificaciones = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la calificación " + i + ": ");
            double calificacion = scanner.nextDouble();
            sumaCalificaciones += calificacion;
        }

        // Calcular el promedio
        double promedio = sumaCalificaciones / 5;

        // Evaluar el resultado y mostrar un mensaje
        String mensaje = "";

        if (promedio > 0 && promedio <= 6) {
            mensaje = "Quedas reprobado";
        } else if (promedio > 6 && promedio <= 7) {
            mensaje = "Pasas de panzazo";
        } else if (promedio > 7 && promedio <= 8) {
            mensaje = "Muy bien, pues mejorar";
        } else if (promedio > 8 && promedio <= 9) {
            mensaje = "Excelente sigue así";
        } else if (promedio > 9 && promedio <= 10) {
            mensaje = "Perfecto, tu esfuerzo valió la pena";
        }

        // Imprimir el resultado
        System.out.println("\nPromedio de calificaciones: " + promedio);
        System.out.println("Mensaje: " + mensaje);

        System.out.println("\nprograma terminado");
    }
}
