/* 13.3  Interfaz Conectable
Método conectar()
Implementar en Wifi y Bluetooth */

public class Main {

    public static void main(String[] args) {

        Wifi wifi = new Wifi();
        Bluetooth bluetooth = new Bluetooth();

        wifi.conectar();
        bluetooth.conectar();

    }

}