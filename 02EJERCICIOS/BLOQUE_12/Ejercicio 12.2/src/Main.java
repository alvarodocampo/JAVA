/* 12.2  Figuras geométricas
Clase abstracta Figura
Método abstracto calcularArea()
Implementar Circulo y Rectangulo */

public class Main {
    public static void main (String[] args){

calcularArea cir = new Circulo();
cir.area();

calcularArea rec = new Rectangulo();
rec.area();
    }
}