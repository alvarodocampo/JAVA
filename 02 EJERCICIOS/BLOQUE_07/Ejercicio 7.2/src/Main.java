/* 7.2  Haz un método que sume dos números y devuelva el resultado.*/

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        int a = scanner.nextInt();

        System.out.println("Introduce el segundo número");
        int b = scanner.nextInt();

        int suma = Calculador.sumar(a,b);
        System.out.println("La suma es: " + suma);
    }
}