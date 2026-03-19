/* 5.1  Crea un programa que diga “Aprobado” o “Suspendido” según la nota de un estudiante.*/

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        System.out.println("¿Que nota ha sacado el alumno? (Del 1 -10");

        Scanner scanner= new Scanner(System.in);
        int nota = scanner.nextInt();

        if (nota<=4){
            System.out.println("SUSPENSO");

        } else if (nota==5) {
            System.out.println("SUFICIENTE");
        } else if (nota==6) {
            System.out.println("BIEN");
        } else if (nota < 9){
            System.out.println("NOTABLE");


        }else {
            System.out.println("SOBRESALIENTE");
        }
    }
}