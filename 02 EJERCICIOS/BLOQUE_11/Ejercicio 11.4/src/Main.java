/* 11.4  Sistema de Vehículos
Clase Vehiculo con método arrancar()
Clase Moto que herede de Vehiculo
Clase Camion que herede de Vehiculo */

public class Main {
    public static void main (String[] args){


        Vehiculo m = new Moto();
        Vehiculo c = new Camion();


        m.arrancar();
        c.arrancar();
    }
}
