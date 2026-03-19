import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(1000);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuanto dinero quieres retirar?");
        double cantidad = scanner.nextDouble();

        try {
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}