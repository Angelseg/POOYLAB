//Realiza operaciones matematicas basicas

public class _p05_OperacionesMatematicas {
    public static void main(String[] args) {
        double x, y, suma, resta, mult, div, residuo, pot;

        x = 10.5; y = 2.5;
        suma = x + y;
        resta = x - y;
        mult = x * y;
        residuo = x % y;
        div = x / y;
        pot = Math.pow(x, y);
        
        System.out.println(String.format("Los números son: %.2f, %.2f",x,y));
        System.out.println("\nEl resultado de las operaciones es el siguiente:\n");
        System.out.println(String.format("Suma: %.2f\nResta: %.2f", suma, resta));
        System.out.println(String.format("Multiplicación: %.2f\nDivisión: %.2f", mult, div));
        System.out.println(String.format("Residuo: %.2f\nPotencia: %.2f", residuo, pot));
    }
}
