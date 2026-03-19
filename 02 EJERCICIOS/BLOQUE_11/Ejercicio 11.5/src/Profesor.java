public class Profesor extends Persona {

    private String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }

    @Override
    public void mostrarRol(){
        System.out.println("Hola soy " + getNombre() + " soy profesor/a de "
                + asignatura + " y tengo " + getEdad() +" años");
    }
}


