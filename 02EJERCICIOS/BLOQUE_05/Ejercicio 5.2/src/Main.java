/*5.2  Programa un sistema que indique
si un número es positivo, negativo o cero usando if, else if, else.
 */

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        System.out.println("Introduce un número.");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 0){
            System.out.println("NÚMERO POSITIVO");
        }else if (num < 0){
            System.out.println("NÚMERO NEGATIVO");
        }else {
            System.out.println("EL NUMERO ES CERO");
        }

    }
}