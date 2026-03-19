/*8.3 Modifica el valor de un elemento del array y vuelve a mostrarlo.*/

public class Main {
    public static void main (String[] args){

        String [] nombres = {"Alvaro", "Kika", "Andrés"};

        for (String nombre:nombres) {


            System.out.println("Array Original " + nombre);

        }

        nombres[2]= "Rubio";

        for (String nombre :nombres){

            System.out.println("Array Modificado " + nombre);
        }

    }
}
