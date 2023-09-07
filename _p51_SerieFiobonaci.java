import java.util.Scanner;

public class _p51_SerieFiobonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el valor de n para imprimir los primeros n números de la serie de Fibonacci: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Por favor, ingrese un valor de n mayor a 0.");
                continue;
            }

            int primero = 0;
            int segundo = 1;

            System.out.print("Serie de Fibonacci de los primeros " + n + " números: ");

            for (int i = 0; i < n; i++) {
                System.out.print(primero + " ");
                int siguiente = primero + segundo;
                primero = segundo;
                segundo = siguiente;
            }

            System.out.println();

            System.out.print("¿Deseas imprimir otra serie de Fibonacci (S/N)? ");
            String continuar = scanner.next().trim().toLowerCase();

            if (!continuar.equals("s")) {
                break;
            }
        }

        scanner.close();
    }
}
