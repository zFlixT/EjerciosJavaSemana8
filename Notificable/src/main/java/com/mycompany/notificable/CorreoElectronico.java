
package com.mycompany.notificable;

public class CorreoElectronico implements Notificable{

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando correo electronico: " + mensaje + "\n");
    }
}
