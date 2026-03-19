/* 9.5  Lista de objetos Crear ArrayList<Persona> y recorrerlo mostrando datos.*/

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        ArrayList<Persona> lista = new ArrayList<>();

        Persona p1 = new Persona("Alvaro",33);
        Persona p2 = new Persona("Kika",36);
        Persona p3 = new Persona("Andrés",33);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        System.out.println("Lista de personas: ");

        for (Persona persona : lista){
            persona.mostrasDatos();
        }

    }
}
