import java.util.Random;
import java.util.Scanner;

public class Juego {

    public int jugar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intento = -1;
        int contador = 0;

        do {
            System.out.println("Adivina el número (1-100) o escribe 0 para salir:");

            if (!scanner.hasNextInt()) {
                System.out.println("Introduce un número válido.");
                scanner.next();
                continue;
            }

            intento = scanner.nextInt();

            if (intento == 0) {
                System.out.println("Has salido del juego.");
                return -1;
            }

            contador++;

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            }

        } while (intento != numeroSecreto);

        System.out.println("¡Correcto!");
        System.out.println("Intentos: " + contador);
        return contador;
    }
}