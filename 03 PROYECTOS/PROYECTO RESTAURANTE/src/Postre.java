public class Postre extends Producto {

    public Postre(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " - " + precio + "€");
    }
}