/*10.2  Crea dos objetos persona1 y persona2
de la clase Persona con diferentes datos y llama a su método.
 */

public class Main {
    public static void main (String[] args){

        Persona persona1 = new Persona("Alvaro", 784589623, "Aguacate");
        Persona persona2 = new Persona("Kika", 548921555, "Cervantes");

        System.out.println("Las personas son: ");

        persona1.informacion();
        persona2.informacion();
    }
}