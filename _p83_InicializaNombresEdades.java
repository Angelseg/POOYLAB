// Inicializa al declarar dos arreglos, uno con Nombres y otro con Edades

public class _p83_InicializaNombresEdades {
    public static void main(String[] args) {
        String[] nombres = {"juan", "lopez","luis","angel","sergio","chuy"};
        int[] edades = {22,19,20,18,23,30};
        
        System.out.print("\n033[H\033[2J");System.out.flush();

        System.out.println("\nTodos los nombres");
        for(String nombre : nombres)
            System.out.printf("%s", nombre);
        
         System.out.println("\nTodos las edades");
        for(int edad : edades)
            System.out.printf("%d", edad);
        
        System.out.println("\nTodos los nombres con su edad");
        for(int i=0; i < nombres.length; i++)
            System.out.printf("Nombre: %s, Edad %d\n", nombres[i], edades[i], nombres[i].toUpperCase() );
    }
}
