import java.time.LocalDate;

public class Bebida extends Producto implements EsAlimento, Descuento{

    protected int calorias;
    protected  double volumen;

    public Bebida(String nombre, double precio, LocalDate fechaCaducidad,int calorias) {
        super(nombre, precio, fechaCaducidad);
        this.calorias = calorias;
        this.volumen = volumen;
    }

    @Override
    public boolean esAlimento() {
        return false;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public void aplicarDescuento() {

    }
}
