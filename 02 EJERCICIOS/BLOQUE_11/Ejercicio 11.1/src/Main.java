/* 11.1  Cuenta bancaria con encapsulamiento
Crea una clase CuentaBancaria con:
atributo privado saldo
método depositar(double cantidad)
método retirar(double cantidad) (no permitir saldo negativo)
método getSaldo()*/


public class Main {
    public static void main (String[] args){

        CuentaBancaria cuenta = new CuentaBancaria(10000);

        cuenta.depositar(500);
        cuenta.retirar(175);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}