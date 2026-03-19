/*8.1  Declara un array de 5 números enteros
y muéstralos en pantalla usando un bucle.*/

public class Main {
    public static void main (String[] args){

        int[] numeros = {1,2,3,4,5};

        for (int i = 0; i< numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }

}