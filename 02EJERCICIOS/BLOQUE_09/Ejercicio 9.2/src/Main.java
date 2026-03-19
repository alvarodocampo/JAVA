/* 9.2  Buscar número mayor  en un ArrayList.*/


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(12);
        numeros.add(3);
        numeros.add(55);
        numeros.add(5);
        numeros.add(26);
        numeros.add(250);

       int mayor = numeros.get(0);

       for (int i = 1; i < numeros.size();i++){
           if (numeros.get(i)> mayor){
               mayor = numeros.get(i);
           }
       }
        System.out.println("El número mayor es: " + mayor);
    }

}