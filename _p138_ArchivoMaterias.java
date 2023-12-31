import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class _p138_ArchivoMaterias {
    public static void leerDatos(ArrayList<String> datos) {
        String dato = "" ;
        System.out.println("Introduce un dato presiona <Enter> dato vacio para terminar> ");
        while(true) {
            dato = new Scanner(System.in).nextLine();
            if(!dato.isEmpty()) datos.add(dato);
            else break;
        }
    }

    public static void grabarArchivo(String archivo, ArrayList<String> datos) throws IOException{
        BufferedWriter fdatos = new BufferedWriter(new FileWriter(new File(archivo)));
        for (String dato : datos)
            fdatos.write(dato + "\n");
            fdatos.close();
    }

    public static ArrayList<String> leerArchivo(String archivo) throws IOException {
        ArrayList<String> datos = new ArrayList<>();
        BufferedReader fdatos = new BufferedReader(new FileReader(new File(archivo)));
        String dato;
        while ((dato = fdatos.readLine())!=null) 
        datos.add(dato);
        fdatos.close();
        return datos;
    }

    public static void main(String[] args) {
        String Archivo = "Datos.txt";
        ArrayList<String> materias = new ArrayList<>(), lasmaterias = new ArrayList<>();
        leerDatos(materias);
        try {
            grabarArchivo(Archivo, materias);
            lasmaterias = leerArchivo(Archivo);
            System.out.println("Datos capturados: ");lasmaterias.forEach(n -> System.out.println(n));
        } catch (Exception e) {
            System.out.println("Error al procesar el archivo: " + e);
        }
    }
}
