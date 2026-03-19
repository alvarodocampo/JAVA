/*  11.5  Sistema escolar
Clase Persona
Clase Alumno que herede de Persona
Clase Profesor que herede de Persona
Método diferente en cada clase */

public class Main {
    public static void main (String[] args){

    Persona p1 = new Persona("Alvaro",33);
    Profesor prof = new Profesor("Mercerdes",36,"Lengua y Literatura");
    Alumno alum1 = new Alumno("Andrés",16,"tercero de la E.S.O");

        System.out.println("Presentense!");

        p1.mostrarRol();
        prof.mostrarRol();
        alum1.mostrarRol();
    }
}

