package _p114_Animal;

public class App {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.sonido();
        gato.dormir();
        gato.comer();

        Perro perro = new Perro();
        perro.sonido();
        perro.dormir();
        perro.comer();
    }
}
