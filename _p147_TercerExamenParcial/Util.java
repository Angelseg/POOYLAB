package _p147_TercerExamenParcial;
import java.io.*;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
            datos.add(new Jugador("Luis Lopez", 20, 'M',"Soltero","Portero",1200));
            datos.add(new Jugador("Carlitos", 19, 'M', "Soltero", "Defensor", 1000));
            datos.add(new Jugador("Axel", 25, 'M', "Casado","Portero", 1500));
            return datos;
        }
    
        public static void serializarDatos(String archivo, ArrayList<Jugador>
        datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
        }
        
        public static ArrayList<Jugador> desSerializarDatos(String archivo) throws
        IOException, ClassNotFoundException {
            ArrayList<Jugador> datos;
            FileInputStream arch = new FileInputStream(archivo);
            ObjectInputStream fpersonas = new ObjectInputStream(arch);
            datos = (ArrayList<Jugador>) fpersonas.readObject();
            fpersonas.close();
            return datos;
    }
}
