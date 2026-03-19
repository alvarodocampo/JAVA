/* 13.2  Interfaz Pagable
Método pagar()
Implementar en Factura y Suscripcion */

public class Main {
    public static void main (String[] args){

Pagable fac1 = new Factura();
Pagable sus1 = new Suscripcion();

fac1.pagar();
sus1.pagar();

    }
}