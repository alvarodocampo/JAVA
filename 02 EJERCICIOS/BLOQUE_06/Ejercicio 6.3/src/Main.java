/*6.3  Crea un programa que sume todos los números del 1 al 100 usando un bucle.*/

public class Main {
    public static void main(String[] args){

        System.out.println("Vamos a sumar todos los número del 1 al 100");

        int suma =0;
        for (int i =1;i <=100;i++){
            suma += i;

            System.out.println(suma);
        }
    }
}