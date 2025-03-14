
package com.mycompany.comparableobjeto;

public class MainComparable {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1200.0);
        Producto producto2 = new Producto("Smartphone", 800.0);

        int resultado = producto1.comparar(producto2);
        if (resultado < 0) {
            System.out.println(producto1 + " es mas barato que " + producto2);
        } else if (resultado > 0) {
            System.out.println(producto1 + " es mas caro que " + producto2);
        } else {
            System.out.println(producto1 + " tiene el mismo precio que " + producto2);
        }
    } 
}
