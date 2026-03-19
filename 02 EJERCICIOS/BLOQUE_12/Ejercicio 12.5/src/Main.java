/* 12.5  Sistema de empleados
Clase abstracta Empleado
Método abstracto calcularSalario()
Diferentes tipos de empleados que calculen distinto */

public class Main {
    public static void main (String[] args){

                Empleado e1 = new EmpleadoFijo("Carlos", 2000);
                Empleado e2 = new EmpleadoPorHoras("Ana", 80, 15);

                System.out.println("Salario de Carlos: " + e1.calcularSalario() + "€");
                System.out.println("Salario de Ana: " + e2.calcularSalario() + "€");
            }
        }

