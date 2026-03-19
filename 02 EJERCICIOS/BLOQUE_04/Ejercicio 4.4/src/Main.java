/* Usa operadores aritméticos abreviados (+=, -=) para modificar el puntaje de un juego.
* Empieza preguntando cuantos puntos tiene el usuario
* suma 10 puntos
* pierda 5 puntos
* duplica su puntuación
* */

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        System.out.println("¿Cuantos puntos tiene el usuario?");
        Scanner scanner = new Scanner(System.in);

        int puntos = scanner.nextInt();

        System.out.println("El usuario ha conseguido 10 puntos");
        puntos += 10;
        System.out.println(puntos + " points");

        System.out.println("Por una sancion pierde 5 puntos");
        puntos -= 5;
        System.out.println(puntos + " points");

        System.out.println("Gracias a una bonificación ha duplicado su puntuación");
        puntos *=2;
        System.out.println(puntos + " points");

    }
}