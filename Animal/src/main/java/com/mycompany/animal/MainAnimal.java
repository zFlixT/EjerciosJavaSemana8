
package com.mycompany.animal;

public class MainAnimal {
    public static void main(String[] args){
        Animal perro = new Perro();
        perro.hacerSonido();
        perro.mover();
     
        Animal gato = new Gato();
        gato.hacerSonido();
        gato.mover();
        
    }
}
