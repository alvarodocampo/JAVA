public class PagoTarjeta extends Pago{
    private String numeroTarjeta;

    public PagoTarjeta(double cantidad, String numeroTarjeta) {
        super(cantidad);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta");
        System.out.println("Cantidad: " + cantidad + "€");
        System.out.println("Número de tarjeta: " + numeroTarjeta);
    }
}

