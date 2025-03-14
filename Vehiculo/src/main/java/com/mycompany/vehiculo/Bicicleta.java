
package com.mycompany.vehiculo;

public class Bicicleta implements Vehiculo{

    @Override
    public void arrancar() {
        System.out.println("La bicicleta esta empezando a pedalear!");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se detuvo");
    }
    
}
