/* 12.4  Polimorfismo con array
Crear un array de tipo Animal
con diferentes tipos de animales y recorrerlo llamando al método.
 */

public class Main {
    public static void main (String[] args){

Animal[] animales = new Animal[3];

animales[0] = new Perro();
animales[1] = new Gato();
animales[2] = new Vaca();

for (Animal a: animales){
    a.hacerSonido();
}
    }
}