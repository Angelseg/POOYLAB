import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

public class _p137_ArchivoDeportes {
    public static void main(String[] args) {
        String [] Deportes = {"Futbol","Beisbol","Ciclismo","Atletismo","Natacion","Motociclismo"};
        File arch = new File("Deportes.txt");

        if(arch.exists())
            System.out.println("El archivo ya existe !");
        else {
            try {
                BufferedWriter FDeportes = new BufferedWriter(new FileWriter(arch));
                for (String Deporte : Deportes)
                    FDeportes.write(Deporte+"\n");
                    FDeportes.close();
                    System.out.println("Ya se escribio los datos en el archivo bro");
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo..");
                System.out.println(e);
            }
        }
        try {
            BufferedReader FDeportes = new BufferedReader(new FileReader(arch));
                    String linea;
                    while((linea=FDeportes.readLine())!=null)
                    System.out.println(linea);
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo..");
            System.out.println(e);
        }
        System.out.println("Longitud final el archivo escrito " + arch.length());
    }
}
