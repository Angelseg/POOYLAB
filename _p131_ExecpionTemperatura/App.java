package _p131_ExecpionTemperatura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static double convertir(double Celcius) throws TemperaturaExeciva {
        if(Celcius > 100)
            throw new TemperaturaExeciva("Temperatura demasiada alta bro, no se puede convertir");
        return ((Celcius * 9 / 5) + 32);
    }

    public static void main(String[] args) {
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("Dame una Temperatura"); double Celcius = obj.nextDouble();
            System.out.println(Celcius + " grados centigrados  equivalen a " + convertir(Celcius) + " En Farenheit" );
        } catch (InputMismatchException e) {
            System.out.println("Debes meter un numero pa >:(, tonto el niño");
        } catch (TemperaturaExeciva e){
            System.out.println(e);
        }
    }
}
