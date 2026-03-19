public class Jugador {

    private String nombre;
    private int intentos;

    public Jugador(String nombre, int intentos) {
        this.nombre = nombre;
        this.intentos = intentos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIntentos() {
        return intentos;
    }

    public void mostrarPuntuacion() {
        System.out.println(nombre + " - Intentos: " + intentos);
    }

    // Para guardar en archivo
    public String toFileString() {
        return nombre + "," + intentos;
    }

    // Para cargar desde archivo
    public static Jugador fromFileString(String linea) {
        String[] partes = linea.split(",");
        String nombre = partes[0];
        int intentos = Integer.parseInt(partes[1]);
        return new Jugador(nombre, intentos);
    }
}