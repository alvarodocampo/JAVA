/* 13.1  Interfaz Volador
Crear interfaz Volador
Implementar en Avion y Pajaro */

public class Main {
    public static void main (String[] args){
Volador v1 = new Avion();
Volador v2 = new Pajaro();

v1.volar();
v2.volar();
    }
}