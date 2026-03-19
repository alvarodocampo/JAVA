public class Calculadora {
    public static int sumarArray(int[] numeros) {
        int suma = 0;

        for (int numero : numeros){
            suma += numero;
        }
        return suma;

    }
}
