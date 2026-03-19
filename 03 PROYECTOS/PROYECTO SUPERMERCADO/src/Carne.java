import java.time.LocalDate;

public class Carne extends Producto implements EsAlimento, Descuento{

    protected int calorias;

    public Carne(String nombre, double precio, LocalDate fechaCaducidad, int calorias) {
        super(nombre, precio, fechaCaducidad);
        this.calorias = calorias;
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

    @Override
    public void aplicarDescuento() {

    }
}
