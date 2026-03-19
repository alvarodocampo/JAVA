/*11.3 Herencia básica
Crea:
Clase Empleado (nombre, salario)
Clase Gerente que herede de Empleado y tenga bonus
Método que calcule salario total */

public class Main {
    public static void main (String[] args){

    Empleado empleado1 = new Empleado("Alvaro",3000);
    Gerente gerente1 = new Gerente("Kika", 5000, 1000);

        System.out.println("Lista de trabajadores y sus salarios: ");

        empleado1.calculoSalarioEmpleado();
        gerente1.calculoSalarioGerente();
    }
}
