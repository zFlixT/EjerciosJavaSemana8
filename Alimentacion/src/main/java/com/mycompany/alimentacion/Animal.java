
package com.mycompany.alimentacion;

public class Animal implements Alimentacion{

    @Override
    public void comer() {
        System.out.println("El animal esta comiendo monte. \n");
    }    
}
