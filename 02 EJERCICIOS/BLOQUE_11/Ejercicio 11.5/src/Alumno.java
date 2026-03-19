public class Alumno extends Persona {

    private String curso;

    public Alumno(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }
    @Override
    public void mostrarRol(){
        System.out.println("Hola soy alumno de " + curso + " tengo " + getEdad()
                + " años y estudio en " + curso);
    }
}
