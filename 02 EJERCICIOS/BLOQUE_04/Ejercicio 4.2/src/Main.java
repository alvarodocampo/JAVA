/*4.2  Declara un boolean mayorDeEdad
 y asígnale el valor de true o false según la edad de un usuario.*/

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos años tiene la persona?");

        int edad = scanner.nextInt();

        System.out.println("La persona tiene " + edad + " años.");

        if(edad >= 18){
            System.out.println("Esta persona es MAYOR de edad.");
        }else {
            System.out.println("Esta persona es MENOR de edad.");
        }

    }
}