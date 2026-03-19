import java.util.ArrayList;

public class Pedido {

    private ArrayList<Producto> productos;

    public Pedido() {
        productos = new ArrayList<>();
    }

    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {

        double total = 0;

        for (Producto p : productos) {
            total += p.getPrecio();
        }

        return total;
    }

    public void mostrarPedido() {

        System.out.println("PEDIDO:");

        for (Producto p : productos) {
            p.mostrarInfo();
        }

        System.out.println("Total: " + calcularTotal() + "€");
    }
}