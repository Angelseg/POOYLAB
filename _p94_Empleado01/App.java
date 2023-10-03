package _p94_Empleado01;

//clase para manejar objetos

public class App {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        empleado.Nombre = "Juanito el huerfanito";
        empleado.Edad = 35;
        
        Empleado empleado2;
        empleado2 = new Empleado();
        empleado2.Nombre = "Maria de Jesus";
        empleado2.Edad = 25;



        System.out.println(empleado.toString());
        System.out.println(empleado2.toString());

        System.out.println(empleado.Nombre);
        System.out.println(empleado2.Nombre);
    }
}
