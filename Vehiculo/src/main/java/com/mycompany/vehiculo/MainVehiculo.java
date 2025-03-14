
package com.mycompany.vehiculo;

public class MainVehiculo {
     public static void main(String[] args) {
        Vehiculo coche = new Coche();
        coche.arrancar();  
        coche.detener();   

        Vehiculo bicicleta = new Bicicleta();
        bicicleta.arrancar();  
        bicicleta.detener();   
    }
}
