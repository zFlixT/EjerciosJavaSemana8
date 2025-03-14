
package com.mycompany.alimentacion;

public class MainAlimentacion {
    public static void main(String[] args) {

        Alimentacion persona = new Persona();
        persona.comer();  

        Alimentacion animal = new Animal();
        animal.comer(); 
    }
}
