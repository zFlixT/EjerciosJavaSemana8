
package com.mycompany.vehiculo;

public class Coche implements Vehiculo{

    @Override
    public void arrancar() {
        System.out.println("El coche se ha arrancado!");
    }

    @Override
    public void detener() {
        System.out.println("El coche se detuvo!");
    }
    
}
