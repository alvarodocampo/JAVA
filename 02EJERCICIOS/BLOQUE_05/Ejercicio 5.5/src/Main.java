/*  Programa un menú de opciones (1,2,3)
y muestra un mensaje diferente para cada opción.*/

import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        System.out.println("Hola bienvenido");

        System.out.println("Elige una de las tres opciones");

        System.out.println("Mensaje 1");
        System.out.println("Mensaje 2");
        System.out.println("Mensaje 3");

        Scanner scanner = new Scanner(System.in);
        int mensaje = scanner.nextInt();

        switch (mensaje){
            case(1):
                System.out.println("Hola buenos días");
                break;
            case(2):
                System.out.println("Hola buenas tardes");
                break;
            case(3):
                System.out.println(("Hola buenas noches"));
                break;
            default:
                System.out.println("Error");
        }
    }
}