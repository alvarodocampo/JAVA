/* Haz operaciones matemáticas
 (suma, resta, multiplicación, división, módulo)
 entre dos números y muestra los resultados.
 */

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a realizar la suma, resta, multiplicación, división, módulo" +
                " de dos números");

        System.out.println("Introduce el número 1:");
        double num1 = scanner.nextDouble();

        System.out.println("Introduce el número 2");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double resta = num1 + num2;
        double multipli = num1 * num2;
        double division = num1 / num2;
        double modulo = num1 % num2;


        System.out.println("SUMA: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("RESTA: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("MULTIPLICACIÓN: " + num1 + " x " + num2 + " = " + multipli);
        System.out.println("DIVISIÓN: " + num1 + " : " + num2 + " = " + division);
        System.out.println("MODULO: " + num1 + " % " + num2 + " = " + modulo);
    }
}