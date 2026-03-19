public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldoInicial) {


        if (saldoInicial <= 0){
            this.saldo = saldoInicial;
        }else {
            this.saldo = 0;

        }
    }
    public void depositar (double cantidad){
        if (cantidad > 0){
            saldo += cantidad;
            System.out.println("Ha depositado " + cantidad + " euros correctamente");
        }else {
            System.out.println("Debe introducir una cantidad mayor que 0");
        }
    }
    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            saldo -=cantidad;
            System.out.println("Ha retirado " + cantidad + " euros a su cuenta correctamente");
        }else {
            System.out.println("ERROR! Ha intentado retirar " + cantidad + " euros de su cuenta " +
                    " y solo dispone de " + saldo + " euros");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

