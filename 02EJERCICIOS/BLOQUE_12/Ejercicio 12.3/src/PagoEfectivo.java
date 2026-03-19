public class PagoEfectivo extends Pago{

    public PagoEfectivo(double cantidad) {
        super(cantidad);
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en efectivo");
        System.out.println("Cantidad: " + cantidad + "€");
    }
}
