public class Saludador {
    private String nombre;

    public Saludador(String nombre) {
        this.nombre = nombre;

    }
    public void saludarAmable(){
        System.out.println("Hola " + nombre + " ¿Como estas maj@?");
    }
    public void saludarGrosero(){
        System.out.println("Hola "+nombre+ " ¿Como estas idiota?");
    }
}
