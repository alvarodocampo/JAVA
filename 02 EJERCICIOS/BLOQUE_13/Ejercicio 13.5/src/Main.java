/* 13.5  Sistema de notificaciones
Interfaz Notificacion
Implementar Email, SMS, WhatsApp
Usar polimorfismo */

public class Main {
    public static void main (String[] args){
Notificacion n1 = new Email();
Notificacion n2 = new SMS();
Notificacion n3 = new WhatsApp();

n1.enviar();
n2.enviar();
n3.enviar();

    }
}
