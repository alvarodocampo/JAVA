/* 7.1  Crea un método saludar() que imprima “Hola, ¿cómo estás?” y llámalo desde main.*/

public class Main {
    public static void main (String[] args){

        Saludador saludar1 = new Saludador("Alvaro");
        Saludador saludar2 = new Saludador("Kika");

        saludar1.saludarGrosero();
        saludar2.saludarAmable();

    }
}