/* 6.5  Imprime solo los números pares del 1 al 20 usando continue.*/

public class Main {
    public static void main (String[] args){

        System.out.println("Vamos a imprimir los números pares del 1 al 20");

        for (int i =1; i<=20; i++){

            if(i%2 !=0){
                continue;
            }
            System.out.println(i);
        }

    }
}
