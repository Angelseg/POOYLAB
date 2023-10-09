package _p102_AutorLibro;

public class App {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Autor autor = new Autor();
        autor.setCorreo("Baldor@gmail.com");
        autor.setNombre("Baldor");
        libro1.setIsdn("1101091010");
        libro1.setNombre("Algebra para Principiantes");
        libro1.setPrecio(150);
        libro1.setCantidad(30);
        libro1.setAutor(autor);
        System.out.println(libro1);

        Libro libro2 = new Libro("1011920219", "Ecuaciones diferenciales", new Autor("El Hijo de Baldor", "baldor@lol.com"), 2300,10);
        System.out.println(libro2);

        System.out.println("Nombre del libro : " + libro2.getNombre());
        System.out.println("Nombre del autor : " + libro2.getAutor().getNombre());
    }
}
