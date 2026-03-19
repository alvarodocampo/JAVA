/* 5.4  Crea un programa que valide si un usuario puede votar (edad ≥ 18)
y tenga nacionalidad.*/

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        System.out.println("Hola bienvenido!");
        System.out.println("¿Cuantos años tienes?");

        Scanner scanner =new Scanner(System.in);
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Tienes la nacionalidad Española? (Si/No)");
        String respuesta = scanner.nextLine().toLowerCase();
        boolean tieneNacionalidad = respuesta.equals("si");
        System.out.println("Tienes " + edad + " años y " + respuesta + " nacionalidad");

        if (edad >=18 &&  tieneNacionalidad){
            System.out.println("PUEDE VOTAR");
        }else {
            System.out.println("NO PUEDES VOTAR");
        }
    }
}