//Manda un saludo a la pantalla
public class _p01_HolaMundo {
    public static void main(String[] args) {
        String amigo = "jose";
        String hermano = "zeus";
        String mensaje = String.format("tanto %s como %s deseaban aprender java",amigo,hermano);

        System.out.println("Hola Mundo desde el mundo de java");
        System.out.println("\nHola amigo " + amigo +" bienvenido a java");
        System.out.println("\nHola amigo " + amigo +" mi hermano es " + hermano);
        System.out.println("\n" +  mensaje);
    }
}