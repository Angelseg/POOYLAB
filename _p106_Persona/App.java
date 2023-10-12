package _p106_Persona;

public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos Lopez", "Av Mexico 115");
        Persona persona2 = new Persona("Fernanda Gonzales", "Alma Obrera 234");
        Estudiante  estudiante = new Estudiante(persona1, "Software", 2023, 500);

        System.out.println(estudiante);
        estudiante.setNombre("Pitufo");
        System.out.println("Nombre       : " + estudiante.getNombre());
        System.out.println("Direccion    : " + estudiante.getDireccion());
        System.out.println("Carrera      : " + estudiante.getCarrera());
        System.out.println("Año          : " + estudiante.getAño());
        System.out.println("Colegiatura  : " + estudiante.getColegiatura());
        
        Apoyo apoyo = new Apoyo(persona2, "Licenciatura", 1000);
        apoyo.setPago(2500);
        System.out.println();
        System.out.println("Nombre           : " + apoyo.getNombre());
        System.out.println("Direccion        : " + apoyo.getDireccion());
        System.out.println("Escolaridad      : " + apoyo.getEscolaridad());
        System.out.println("Pago             : " + apoyo.getPago());
        
        Apoyo apoyo2 = new Apoyo("Sra Tere","Sierra Madre", "Secundaria", 2000);
        Estudiante estudiante2 = new Estudiante("Edgar", "Calle de abajo 134", "Ing civil", 2024, 2000);

        System.out.println(apoyo2);
        System.out.println();
        System.out.println(estudiante2);
    }
}
