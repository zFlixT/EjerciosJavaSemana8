
package com.mycompany.alimentacion;

public class Persona implements Alimentacion{

    @Override
    public void comer() {
        System.out.println("La persona esta comiendo una hamburguesa. \n");
    }
}
