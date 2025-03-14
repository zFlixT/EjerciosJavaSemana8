
package com.mycompany.descontable;

public class DescuentoFijo implements Descontable{
    private double descuentoFijo;

    public DescuentoFijo(double descuentoFijo) {
        this.descuentoFijo = descuentoFijo;
    }

    @Override
    public double calcularDescuento(double precio) {
        return descuentoFijo;
    }
}
