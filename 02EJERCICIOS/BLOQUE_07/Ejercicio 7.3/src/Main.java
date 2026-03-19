/* 7.3  Crea un método que calcule el área de un rectángulo (base * altura) y lo devuelva.*/

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        System.out.println("Vamos a calcular el area de un rectangulo");

        Scanner scanner =new Scanner(System.in);
        System.out.println("Introduce el valor de la base (m)");
        double base = scanner.nextDouble();

        System.out.println("Introduce el valor de la altura (m)");
        double altura = scanner.nextDouble();

        double multiplicar = AreaRectangulo.multiplicar((int) base, (int) altura);

        System.out.println("Area rectangulo: " + multiplicar );

    }
}