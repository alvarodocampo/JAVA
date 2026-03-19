import java.util.Scanner;

public class Circulo extends calcularArea{
    @Override
    public void area() {
        System.out.println("¿Cuanto mide el radio en m?");

        Scanner scanner = new Scanner(System.in);
        double radio = scanner.nextDouble();
        double pi = 3.14;
        double area = pi * (radio * radio);

        System.out.println("El area del circulo es: " + area + " m^2");
    }
}
