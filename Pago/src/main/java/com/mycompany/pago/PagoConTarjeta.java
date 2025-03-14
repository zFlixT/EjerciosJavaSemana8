
package com.mycompany.pago;

public class PagoConTarjeta implements Pago {

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago con tarjeta por $" + cantidad);
        System.out.println("Pago con tarjeta realizado con exito.\n");                
    }
}
