// Inicializa de forma manual arreglo de cadenas y lo imprime

public class _p82_InicializaArregloCadenas {
    public static void main(String[] args) {
        String[] municipio = new String[10];

        municipio[0] = "apozol";
        municipio[1] = "apulco";
        municipio[2] = "cañitas";
        municipio[3] = "Jerez";
        municipio[4] = "Fresnillo";
        municipio[5] = "Rio grande";
        municipio[6] = "sain alto";
        municipio[7] = "sombrete";
        municipio[8] = "atolinga";
        municipio[9] = "teul de Gonzalesz Ortega";

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nPrimer elemento del arreglo: " + municipio[0]);
        System.out.println("\nUltimo elemento del arreglo: " + municipio[9]);

        System.out.println("\nTdods los elementos usando el for con indice");
        for(int i=0; i<10; i++)
            System.out.println(municipio[i]);
        
        System.out.println("\nTodos los elementos usando el ciclo for each");
        for(String mun : municipio)
            System.out.println(mun.toUpperCase()); //toUpperCase = poner en mayuscula todo
    }
}
