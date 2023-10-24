package _p115_Telefono;

public class App {
    public static void main(String[] args) {
        Telefono micel = new Telefono();

        micel.obtenercordenadas();
        micel.iniciarradio();
        micel.wifi();
        micel.Bluetooth();
        micel.detenerradio();
    }
}
