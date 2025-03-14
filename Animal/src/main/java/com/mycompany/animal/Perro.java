
package com.mycompany.animal;

public class Perro implements Animal {

    @Override
    public void hacerSonido() {
        System.out.println("El perro esta ladrando: Guau guau!");
    }

    @Override
    public void mover() {
        System.out.println("El perro esta corriendo.");
    }
}
