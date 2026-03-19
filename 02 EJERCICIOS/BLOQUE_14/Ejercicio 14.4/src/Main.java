/* 14.4  Validación personalizada
Crear método que lance excepción si edad < 18. */

import java.util.Scanner;

public class Main {

    public static void validarEdad(int edad) throws Exception {

        if (edad < 18) {
            throw new Exception("Debes ser mayor de 18 años");
        }

        System.out.println("Edad valida, acceso permitido");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();

        try {
            validarEdad(edad);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}