/*  4.3  Combina dos condiciones
con && y || para verificar si alguien puede entrar a un cine (edad + entrada).
 */

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Para entrar en el cine se necesita SER MAYOR DE 16 Y UNA ENTRADA");
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantos años tienes?");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Tienes entrada? (Si/No)");
        String respuesta = scanner.nextLine().toLowerCase();
        boolean tieneEntrada = respuesta.equals("si");

        if (edad >=16 && tieneEntrada){
            System.out.println("Puedes pasar al cine");
        }else {
            System.out.println("Lo siento, no puedes pasar");
        }

    }
}