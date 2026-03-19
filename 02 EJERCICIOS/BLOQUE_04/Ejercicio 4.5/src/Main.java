/* 4.5  Calcula si un número es par usando el operador %. */

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        System.out.println("Introduce un número");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 2 ==0){
            System.out.println("Es Par");
        }else {
            System.out.println("No es par");
        }
    }
}