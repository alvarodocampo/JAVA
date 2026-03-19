/* 12.3  Sistema de pagos
Clase abstracta Pago
Método abstracto procesarPago()
Implementar PagoTarjeta, PagoEfectivo */

public class Main {
    public static void main (String[] args){

        Pago pago1 = new PagoEfectivo(120);
        Pago pago2 = new PagoTarjeta(250,"760-845-578");

    pago1.procesarPago();
    pago2.procesarPago();
    }
}
