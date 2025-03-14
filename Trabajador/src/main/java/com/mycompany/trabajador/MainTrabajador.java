
package com.mycompany.trabajador;

public class MainTrabajador {
    public static void main(String[] args){
        
        Trabajador desarrollador = new Desarrollador();
        desarrollador.trabajar();
        
        Trabajador disenador = new Disenador();
        disenador.trabajar();
        
    }
}
