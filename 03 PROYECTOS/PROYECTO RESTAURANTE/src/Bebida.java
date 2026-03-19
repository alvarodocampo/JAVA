public class Bebida extends Producto {

    private boolean alcoholica;

    public Bebida(String nombre, double precio, boolean alcoholica) {
        super(nombre, precio);
        this.alcoholica = alcoholica;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " - " + precio + "€ - Alcohol: " + alcoholica);
    }
}