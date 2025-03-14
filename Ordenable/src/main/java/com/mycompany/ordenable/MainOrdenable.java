
package com.mycompany.ordenable;

import java.util.Arrays;
import java.util.List;

public class MainOrdenable {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(5, 3, 8, 1, 2);
        Ordenable listaNumeros = new ListaNumeros();
        listaNumeros.ordenar(numeros);
        System.out.println("Lista ordenada: " + numeros + "\n");
    }
}
