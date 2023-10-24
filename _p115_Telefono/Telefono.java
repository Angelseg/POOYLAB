package _p115_Telefono;

public class Telefono implements Gps,Radio,Conecta{
    public void obtenercordenadas(){
        System.out.println("Obteniendo coordenadas del satelite mas cercano...");
    }
    public void iniciarradio(){
        System.out.println("Iniciando radio...");
    }
    public void detenerradio(){
        System.out.println("Detenendiendo radio...");
    }
    public void wifi(){
        System.out.println("Iniciando Wifi...");
    }
    public void Bluetooth(){
        System.out.println("Iniciando Bluetooth...");
    }

}
