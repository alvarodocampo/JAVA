/* 2.3  Modifica el programa para que muestre tu ciudad de residencia. */

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es tu cidudad de residencia?");
        String ciudad = scanner.next();

        System.out.println("Vives en " + ciudad.substring(0,1).toUpperCase()
                + ciudad.substring(1).toLowerCase() + ", es muy bonita");

    }
}