/* 2.1  Escribe un programa que imprima tu nombre completo en pantalla.  */

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre");

        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre.substring(0,1).toUpperCase()
                + nombre.substring(1).toLowerCase() + " cómo estás?.");
    }
}