public class Gerente extends Empleado {
    private int bonus;

    public Gerente(String nombre, int salario, int bonus) {
        super(nombre, salario);
        this.bonus = bonus;
    }
    public void calculoSalarioGerente(){

        double sumaSalarioGerente = getSalario() + bonus;

        System.out.println("El salario del Gerente " + getNombre() + " es: Salario: " + getSalario()
                + " euros + Bonus: " + bonus + " euros = " + sumaSalarioGerente + "euros.");
    }
}

