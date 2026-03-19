/* GESTIÓN DE BIBLIOTECA */

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("1984", "George Orwell");
        Libro libro2 = new Libro("Don Quijote", "Miguel de Cervantes");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.mostrarLibros();

        biblioteca.prestarLibro("1984");

        biblioteca.mostrarLibros();

        biblioteca.devolverLibro("1984");

        biblioteca.mostrarLibros();
    }
}