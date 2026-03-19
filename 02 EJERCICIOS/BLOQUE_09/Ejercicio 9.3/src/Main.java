/*9.3  Agenda telefónica usar HashMap<String, String> para guardar nombre → teléfono.*/

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Crear la agenda
        HashMap<String, String> agenda = new HashMap<>();

        // Añadir contactos
        agenda.put("Alvaro", "600123456");
        agenda.put("Kika", "611987654");
        agenda.put("Andres", "622555777");

        // Buscar un teléfono por nombre
        String nombre = "Alvaro";
        if (agenda.containsKey(nombre)) {
            System.out.println("Teléfono de " + nombre + ": " + agenda.get(nombre));
        } else {
            System.out.println("El contacto no existe.");
        }

        // Mostrar todos los contactos
        System.out.println("\nLista completa:");
        for (String clave : agenda.keySet()) {
            System.out.println(clave + " → " + agenda.get(clave));
        }
    }
}