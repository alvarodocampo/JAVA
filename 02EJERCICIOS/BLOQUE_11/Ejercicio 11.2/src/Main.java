/* 11.2  Clase Persona con validación
Atributos privados: nombre, edad
Setter de edad que no permita valores negativos
Método mostrarDatos() */

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Persona pers1 = new Persona("Alvaro", 33);
        Persona pers2 = new Persona("Kika",36);
        Persona pers3 = new Persona("Manuel", -5);

        System.out.println("Estos son los datos de las personas: ");

        pers1.mostrarDatos();
        pers2.mostrarDatos();
        pers3.mostrarDatos();
    }
}