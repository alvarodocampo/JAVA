/* 14.2  Validación de número
Convertir texto a número usando Integer.parseInt() y capturar error.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero:");

        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("El numero introducido es: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: no has introducido un numero valido");
        }

    }
}