/* 2.4  Crea un programa que imprima
tu comida favorita y bebida favorita en líneas separadas.
 */

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es tu comida favorita?");
        String comida = scanner.next();

        System.out.println("¿Cual es tu bebida favorita?");
        String bebida = scanner.next();

        System.out.println("Tu comida favorita es: "+ comida.substring(0,1).toUpperCase()
        + comida.substring(1).toLowerCase());
        System.out.println("Tu bebida favorita es: " + bebida.substring(0,1).toUpperCase()
                + bebida.substring(1).toLowerCase());
    }
}