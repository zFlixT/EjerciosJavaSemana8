
package com.mycompany.comparableobjeto;

public class Producto implements ComparableObjeto{
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int comparar(Object o) {
        if (o instanceof Producto) {
            Producto otroProducto = (Producto) o;
            if (this.precio < otroProducto.getPrecio()) {
                return -1; 
            } else if (this.precio > otroProducto.getPrecio()) {
                return 1;
            } else {
                return 0;
            }
        }
        throw new IllegalArgumentException("El objeto no es un Producto");        
    }
    
    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}
