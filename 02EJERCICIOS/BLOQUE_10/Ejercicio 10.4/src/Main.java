/*10.4Crea un array de objetos
Persona y recorre todos imprimiendo sus nombres y edades.*/


public class Main {
    public static void main (String[] args){

        Persona [] personas = new Persona[3];

        personas[0]= new Persona("Alvaro", 33);
        personas[1]= new Persona("Kika", 36);
        personas[2]= new Persona("Andrés", 33);

        for(int i = 0; i < personas.length; i++){
            System.out.println("Nombre: " + personas[i].getNombre() +
                    " Edad: " + personas[i].getEdad());
        }
    }
}