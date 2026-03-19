import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ranking ranking = new Ranking();
        Juego juego = new Juego();

        String opcion;

        do {
            System.out.println("Nombre del jugador:");
            String nombre = scanner.nextLine();

            int intentos = juego.jugar();

            if (intentos != -1) {
                Jugador jugador = new Jugador(nombre, intentos);
                ranking.agregarJugador(jugador);
            } else {
                System.out.println("Partida cancelada.");
            }

            System.out.println();
            ranking.mostrarRanking();

            System.out.println("\n¿Jugar otra vez? (s/n)");
            opcion = scanner.nextLine();

        } while (opcion.equalsIgnoreCase("s"));

        System.out.println("Fin del programa.");
    }
}