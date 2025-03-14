
package com.mycompany.pago;

public class PagoConEfectivo implements Pago{

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago en efectivo por $" + cantidad);
        System.out.println("Pago en efectivo realizado con exito.\n");
    }  
}
