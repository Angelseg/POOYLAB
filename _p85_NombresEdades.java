// Leer un arreglo de n nombres y edades, calcula el promedio de edades

import java.util.Scanner;

public class _p85_NombresEdades {
    public static void main(String[] args) {
        int n, s=0, p=0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\n033[H\033[2J");System.out.flush();
        System.out.print("Cuantos nombres deseas procesar: ");n = obj.nextInt();
        String[] nombre = new String[n];
        int[] edades = new int[n];

        System.out.printf("\nIntroduce los nombres y edades de las %d personas que dijiste: \n",n);
        for(int i=0; i < n; i++){
            obj.nextLine();
            System.out.printf("Dame el nombre %d: ", i+1);nombre[i] = obj.nextLine();
            System.out.printf("Dame la edad : ");edades[i] = obj.nextInt();
        }
        System.out.println("\nLos nombres y edades capturadas son: ");
        System.out.printf("Nombre\tEdad\n" );
        for(int i=0; i<n; i++){
            System.out.printf("%s\t%d\n", nombre[i], edades[i]);
            s = s + edades[i];
        }
        p = s/n;
        System.out.println("\nEl promedio de edades es: " + p);
    }
}
