package _p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        Sedan Vochito = new Sedan("Vochito","Josefa de dominguez",5);
        System.out.println(Vochito.toString());
        Vochito.SistemaElectrico();
        Vochito.CombustionInterna();
        Vochito.CarroceriaTres();
        Vochito.ChasisMonoCasco();
        Vochito.Repostar();
        Vochito.Arrancar();
        Vochito.Frenar();
        System.out.println();
        
        Suv Tacoma = new Suv("Mamalona", "Luis Perico Rey", 10);
        System.out.println(Tacoma.toString());
        Tacoma.SistemaElectrico();
        Tacoma.CombustionInterna();
        Tacoma.ChasisIndependiente();
        Tacoma.Traccion4X4();
        Tacoma.Repostar();
        Tacoma.Arrancar();
        Tacoma.Frenar();


    }
}
