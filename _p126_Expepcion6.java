import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _p126_Expepcion6 {
    public static void main(String[] args) {

        try {
        File nombres = new File("nombres.txt");
        Scanner arch = new Scanner(nombres);
        while (arch.hasNextLine()) {
            System.out.println(arch.nextLine());
        }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo que intentas leer no existe");
        }
    }
}  