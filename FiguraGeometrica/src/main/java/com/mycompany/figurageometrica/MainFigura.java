
package com.mycompany.figurageometrica;

public class MainFigura {
    public static void main(String[] args) {

        FiguraGeometrica circulo = new Circulo(5.0);
        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro() + "\n");


        FiguraGeometrica rectangulo = new Rectangulo(4.0, 6.0);
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro() + "\n");
    }
}
