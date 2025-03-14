
package com.mycompany.descontable;

public class MainDescontable {
    public static void main(String[] args) {

        Descontable descuentoPorcentaje = new DescuentoPorcentaje(10.0);
        double precioConDescuentoPorcentaje = 100.0 - descuentoPorcentaje.calcularDescuento(100.0);
        System.out.println("Precio con descuento del 10%: $" + precioConDescuentoPorcentaje + "\n");

        Descontable descuentoFijo = new DescuentoFijo(15.0); 
        double precioConDescuentoFijo = 100.0 - descuentoFijo.calcularDescuento(100.0);
        System.out.println("Precio con descuento fijo de $15: $" + precioConDescuentoFijo + "\n");
    }
}