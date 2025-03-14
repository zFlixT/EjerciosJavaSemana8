
package com.mycompany.pago;

public class MainPago {
    public static void main(String[] args) {

        Pago pagoTarjeta = new PagoConTarjeta();
        pagoTarjeta.procesarPago(100.50); 

        Pago pagoEfectivo = new PagoConEfectivo();
        pagoEfectivo.procesarPago(75.25);  
    }
}
