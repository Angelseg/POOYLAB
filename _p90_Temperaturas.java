public class _p90_Temperaturas {
    public static void main(String[] args) {
        // Declarar un arreglo de números flotantes e inicializarlo
        float[] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};

        // Muestre el primer elemento
        System.out.println("El primer elemento es: " + temperaturas[0]);

        // Muestre el tercer elemento
        System.out.println("El tercer elemento es: " + temperaturas[2]);

        // Muestre todos los elementos del arreglo
        System.out.print("Los elementos del arreglo son: ");
        for (float temperatura : temperaturas) {
            System.out.print(temperatura + " ");
        }
        System.out.println();

        // Poner a 0 todos los elementos mayores a 10
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > 10) {
                temperaturas[i] = 0;
            }
        }

        // Muestre nuevamente los elementos del arreglo
        System.out.print("Después de poner a 0 los elementos mayores a 10, el arreglo es: ");
        for (float temperatura : temperaturas) {
            System.out.print(temperatura + " ");
        }
    }
}
