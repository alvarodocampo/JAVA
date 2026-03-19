/*14.3   Índice seguro
Acceder a un array y capturar error de índice inválido.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el indice del array:");

        try {
            int indice = scanner.nextInt();
            System.out.println("El valor es: " + numeros[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: indice fuera de rango");
        }

    }
}