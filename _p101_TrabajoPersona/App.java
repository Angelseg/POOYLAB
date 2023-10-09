package _p101_TrabajoPersona;

public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Trabajador trabajo = new Trabajador();
        trabajo.setID(1);
        trabajo.setRol("Chofer");
        trabajo.setSalario(200);
        persona1.setNombre("Luisa Urina");
        persona1.setTrabajo(trabajo);
        System.out.println(persona1);

        Persona persona2 = new Persona("Manuel Perez" , new Trabajador(2, "Chef", 2500));
        System.out.println(persona2);

        Persona persona3 = new Persona("Lupe Ortizia", new Trabajador(3, "Sexoservidora",3000));
        System.out.println(persona3);
    }
}
