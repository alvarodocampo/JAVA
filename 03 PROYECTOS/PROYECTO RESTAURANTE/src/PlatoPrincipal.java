public class PlatoPrincipal extends Producto {

    private boolean vegano;

    public PlatoPrincipal(String nombre, double precio, boolean vegano) {
        super(nombre, precio);
        this.vegano = vegano;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " - " + precio + "€ - Vegano: " + vegano);
    }
}