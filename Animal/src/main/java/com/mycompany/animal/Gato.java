
package com.mycompany.animal;

public class Gato implements Animal{

    @Override
    public void hacerSonido() {
        System.out.println("El gato esta maullando: Miau miau!");
    }

    @Override
    public void mover() {
        System.out.println("El gato esta caminando sigilosamente.");
    }  
}
