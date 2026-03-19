public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void retirar(double cantidad) throws Exception {

        if (cantidad > saldo) {
            throw new Exception("Error: saldo insuficiente");
        }

        saldo = saldo - cantidad;
        System.out.println("Retiro realizado. Saldo restante: " + saldo);
    }

}