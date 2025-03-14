
package com.mycompany.notificable;

public class MainNotificacion {
    public static void main(String[] args) {
        Notificable correo = new CorreoElectronico();
        correo.enviarNotificacion("Hola, este es un correo de prueba.");

        Notificable sms = new SMS();
        sms.enviarNotificacion("Hola, este es un SMS de prueba.");
    }
}
