public class Persona {

   private String nombre;
   private int edad;
   private boolean edadNegativa;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0){
            this.edad = edad;
            edadNegativa = false;
        }else {
            this.edad = 0;
            edadNegativa = (edad < 0);
        }
    }
    public void mostrarDatos() {
        if (edadNegativa) {
            System.out.println("No puede tener edad negativa");
        }
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " años");
    }
}


