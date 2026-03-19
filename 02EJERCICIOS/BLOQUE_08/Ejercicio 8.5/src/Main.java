/*  8.5  Crea un programa que encuentre el número más grande de un array
de números enteros.*/

public class Main {
    public static void main (String[] args){
        int [] numeros = {20,60,66,87,110};

        int mayor = numeros[0];

        for (int i =1; i < numeros.length; i++){
            if (numeros [i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("El número mas grande es " + mayor);
    }
}
