/*9.4 Contador de palabras Leer varias palabras y usar HashMap para contar cuántas veces aparece cada una.*/

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> contador = new HashMap<>();

        System.out.println("Escribe palabras (escribe 'fin' para terminar):");

        while (true) {
            String palabra = scanner.nextLine();

            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }

            // Si la palabra ya existe, aumentamos contador
            if (contador.containsKey(palabra)) {
                contador.put(palabra, contador.get(palabra) + 1);
            } else {
                contador.put(palabra, 1);
            }
        }

        System.out.println("\nResultado:");
        for (String clave : contador.keySet()) {
            System.out.println(clave + " → " + contador.get(clave));
        }

        scanner.close();
    }
}