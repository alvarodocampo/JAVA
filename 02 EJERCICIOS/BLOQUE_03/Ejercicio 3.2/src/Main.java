/* 3.2  Crea un programa que sume dos números enteros y muestre el resultado. */

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        System.out.println("Introduce dos numero enteros: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Número 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Número 2: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("El resultado de la suma es: " + num1  + " + " + num2 + " = " + sum);
    }

}