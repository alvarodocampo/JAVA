import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    public void prestarLibro(String titulo) {

        for (Libro libro : libros) {

            if (libro.getTitulo().equalsIgnoreCase(titulo)) {

                if (libro.isDisponible()) {
                    libro.prestar();
                    System.out.println("Libro prestado correctamente");
                } else {
                    System.out.println("El libro ya está prestado");
                }

                return;
            }
        }

        System.out.println("Libro no encontrado");
    }

    public void devolverLibro(String titulo) {

        for (Libro libro : libros) {

            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.devolver();
                System.out.println("Libro devuelto");
                return;
            }
        }

        System.out.println("Libro no encontrado");
    }
}