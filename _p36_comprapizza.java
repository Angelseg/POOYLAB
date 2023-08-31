//Un usuario puede elegir un tamaño de pizza (chica - $5, mediana $10, grande $20), luego elige la cantidad, si lacompra es menor a 2000 no tiene descuento, mayor a 2000 tiene un descuento de 15%. Diseñe un programa que permita procesar la solicitud e imprimir: tamaño de la compra, cantidad comprada, total compra, descuento, total de compra con descuento.

import java.util.Scanner;

public class _p36_comprapizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precios de las pizzas
        double precioChica = 5.0;
        double precioMediana = 10.0;
        double precioGrande = 20.0;

        // Solicitar al usuario que elija el tamaño de la pizza
        System.out.println("Tamaños de pizza disponibles:");
        System.out.println("1. Chica - $5");
        System.out.println("2. Mediana - $10");
        System.out.println("3. Grande - $20");
        System.out.print("Elija el tamaño de la pizza (1/2/3): ");
        int opcion = scanner.nextInt();

        // Solicitar al usuario la cantidad de pizzas
        System.out.print("Ingrese la cantidad de pizzas que desea comprar: ");
        int cantidad = scanner.nextInt();

        // Calcular el costo total antes del descuento
        double totalCompra = 0.0;

        switch (opcion) {
            case 1:
                totalCompra = precioChica * cantidad;
                break;
            case 2:
                totalCompra = precioMediana * cantidad;
                break;
            case 3:
                totalCompra = precioGrande * cantidad;
                break;
            default:
                System.out.println("Opción no válida.");
                scanner.close();
                return;
        }

        // Aplicar descuento si el total es mayor a 2000
        double descuento = 0.0;

        if (totalCompra > 2000) {
            descuento = totalCompra * 0.15;
        }

        // Calcular el total de compra con descuento
        double totalCompraConDescuento = totalCompra - descuento;

        // Imprimir los resultados
        System.out.println("\nResumen de la compra:");
        System.out.println("Tamaño de la pizza: " + opcion);
        System.out.println("Cantidad comprada: " + cantidad);
        System.out.println("Total compra: $" + totalCompra);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total compra con descuento: $" + totalCompraConDescuento);

        System.out.println("programa terminado");
    }
}
