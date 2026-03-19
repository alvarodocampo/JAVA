public abstract class Pago {

    protected double cantidad;

    public Pago(double cantidad) {
        this.cantidad = cantidad;
    }
    public abstract void procesarPago();
}
