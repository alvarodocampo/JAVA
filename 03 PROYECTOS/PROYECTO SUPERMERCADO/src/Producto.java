import java.time.LocalDate;

public abstract class Producto {

    protected String nombre;
    protected double precio;
    protected LocalDate fechaCaducidad;

    public Producto(String nombre, double precio, LocalDate fechaCaducidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String toString() {
        return "El producto: " + nombre + ". Con precio: " + precio + " €." + " Fechad de caducidad " + fechaCaducidad;
    }

}
