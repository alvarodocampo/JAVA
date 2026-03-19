/* 6.4  Usa un do-while para pedir un número al usuario hasta que sea positivo.*/

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        System.out.println("Introduce números hasta que sea positivo");

        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Introduce un numero: ");
            num = scanner.nextInt();

        } while (num <=0);
        System.out.println("Número positivo introducido: " + num);
    }
}