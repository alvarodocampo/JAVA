/* 3.1  Declara variables para almacenar
tu nombre (String)tu edad (int), altura (double), y si estás estudiando (boolean).
 */

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es tu nombre?");
        String nombre = scanner.nextLine();

        System.out.println("¿Cuantos años tienes?");
        int edad = scanner.nextInt();

        System.out.println("¿Cuanto mides en metros?");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("¿Estas estudiando actualmente? (Si/No)");
        String respuesta = scanner.nextLine().toLowerCase();
        boolean estaEstudiando = scanner.equals("si");


        System.out.println("Hola " + nombre.substring(0,1).toUpperCase()
        + nombre.substring(1).toLowerCase()+ " veo que tienes " + edad + " años,"
        + " que mides " + altura + " metros" + " y actualmente " + respuesta + " estas estudiando");
    }
}