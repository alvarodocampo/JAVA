/* 5.3  Usa switch para mostrar el día de la semana según un número del 1 al 7.*/

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        System.out.println("Introduce el número del dia de la semana y te diré que dia es");

        Scanner scanner = new Scanner(System.in);
        int dia = scanner.nextInt();

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número Incorrecto");
        }
    }
}