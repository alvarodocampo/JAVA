/*9.1  Lista de nombres Crear un ArrayList de nombres y mostrarlos.*/

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Álvaro");
        nombres.add("Kika");
        nombres.add("Andrés");
        nombres.add("África");

        System.out.println("Los nombres de la lista son: ");
        for (String nombre : nombres){
            System.out.println(nombre);
        }

    }
}