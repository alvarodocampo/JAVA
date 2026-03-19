/* 12.1  Animales abstractos
Clase abstracta Animal con método abstracto hacerSonido()
Implementar Perro y Gato */

public class Main {
    public static void main (String[] args){

    Animal perro = new Perro();
    Animal gato = new Gato();
    Animal raton = new Raton();

        System.out.println("El perro dijo: ");perro.hacerSonido();
        System.out.println("El gato dijo: "); gato.hacerSonido();
        System.out.println("El ratón dijo: ");raton.hacerSonido();

    }
}