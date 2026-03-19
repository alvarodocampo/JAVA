/* 8.6  Haz un método que reciba un
array de números y devuelva la suma de todos sus elementos.*/

public class Main {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        // Mostrar todos los números del array
        System.out.print("Los números son: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println(); // Salto de línea

        // Llamar al método sumarArray de la clase Calculadora
        int resultados = Calculadora.sumarArray(numeros);

        System.out.println("La suma de todos los números es: " + resultados);
    }
}