/* 4.1  Crea un programa que compare dos números y diga cuál es mayor.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos números para saber cual es mayor");

        System.out.println("Número 1: ");
        double num1 = scanner.nextDouble();

        System.out.println("Número 2: ");
        double num2 = scanner.nextDouble();

        System.out.println("Los números introducidos son: " + num1 + " y " + num2);
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que el número " + num2);
        } else if (num1 < num2)
            System.out.println("El número " + num2 + " es mayor que el número " + num1);
        else {
            System.out.println("Ambos número son iguales");

        }
    }
}