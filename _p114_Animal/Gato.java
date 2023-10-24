package _p114_Animal;

//una clase implementa una interfaz, al hacerlo debe sobrecargar todo sus metodos

public class Gato implements Animal{
    
    @Override
    public void dormir() {
        System.out.println("El gato duerme en la caja");
    }

    @Override
    public void sonido() {
        System.out.println("El gato hace miau...");
    }

    @Override
    public void comer() {
        System.out.println("El gato come whiskas yh si no le gusta come ratones");
    }

    
    
}
