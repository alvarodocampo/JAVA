/* Proyecto: Sistema de Gestión de Pedidos de Restaurante (Java) */

public class Main {

    public static void main(String[] args) {

        Bebida cocaCola = new Bebida("Coca Cola", 2.5, false);
        PlatoPrincipal hamburguesa = new PlatoPrincipal("Hamburguesa", 8.5, false);
        Postre tarta = new Postre("Tarta de queso", 4);

        Pedido pedido = new Pedido();

        pedido.añadirProducto(cocaCola);
        pedido.añadirProducto(hamburguesa);
        pedido.añadirProducto(tarta);

        pedido.mostrarPedido();
    }
}