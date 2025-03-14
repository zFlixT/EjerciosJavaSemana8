
package com.mycompany.descontable;

public class DescuentoPorcentaje implements Descontable{
    private double porcentaje;


    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularDescuento(double precio) {
        return precio * (porcentaje / 100);
    }  
}
