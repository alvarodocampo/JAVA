/* 14.1  División segura
Pedir dos números y evitar división por cero. */

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Introduce el primer número: ");
            int num1 = scanner.nextInt();

            System.out.println("Introduce el segundo número: ");
            int num2 = scanner.nextInt();;

            int resultado = num1 / num2;

            System.out.println("El resultado es: " + num1 + " : " + num2 + " = " + resultado);
        }catch (ArithmeticException e) {
            System.out.println("Error !!. No se puede dividir por 0");
        }

    }
}