package _p103_Clientefactura;

public class App {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Factura factura = new Factura();
        cliente1.setId("Fifa-0010");
        cliente1.setNombre("Leonel Messi");
        cliente1.setDescuento(8);
        factura.setId(1);
        factura.setMonto(3000);
        factura.setCliente(cliente1);

        System.out.println(factura);
        System.out.println("monto con descuento: "+ factura.getMontoconDescuento());

        Factura factura2 = new Factura(2, new Cliente("Liga-MX","Guillermo ochoa", 10),5000);
        System.out.println("Factura Id            : " + factura2.getId());
        System.out.println("Cliente Id            : " + factura2.getCliente().getId());
        System.out.println("Nombre del cliente    : " + factura2.getCliente().getNombre());
        System.out.println("cliente con descuento : " + factura2.getCliente().getDescuento()/100.0 + "%");
        System.out.println("Monto de la factura   : " + factura2.getMonto());
        System.out.println("Monto con Descuento   : " + factura2.getMontoconDescuento());


    }
}
