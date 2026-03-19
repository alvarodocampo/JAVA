import java.util.Scanner;

public class Rectangulo extends  calcularArea{

    @Override
    public void area() {
        System.out.println("Cuanto mide el primer lado del rectangulo: ");
        Scanner scanner = new Scanner(System.in);

        double lado1 = scanner.nextDouble();

        System.out.println("Cuanto mide el otro lado del rectangulo: ");
        double lado2 = scanner.nextDouble();

        double area = lado1 * lado2;

        System.out.println("El area del rectangulo es " + lado1 + " x " + lado2 + " = " + area + " m^2");
    }
}
