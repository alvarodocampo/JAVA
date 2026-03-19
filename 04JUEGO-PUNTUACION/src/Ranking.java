import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.*;

public class Ranking {

    private ArrayList<Jugador> jugadores;
    private static final String ARCHIVO = "ranking.txt";

    public Ranking() {
        jugadores = new ArrayList<>();
        cargarRanking();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
        guardarRanking();
    }

    public void mostrarRanking() {
        Collections.sort(jugadores, Comparator.comparingInt(Jugador::getIntentos));

        System.out.println("===== RANKING =====");
        for (Jugador j : jugadores) {
            j.mostrarPuntuacion();
        }
    }

    private void cargarRanking() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                jugadores.add(Jugador.fromFileString(linea));
            }
        } catch (IOException e) {
            System.out.println("No hay ranking previo.");
        }
    }

    private void guardarRanking() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (Jugador j : jugadores) {
                bw.write(j.toFileString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error guardando ranking.");
        }

    }
}