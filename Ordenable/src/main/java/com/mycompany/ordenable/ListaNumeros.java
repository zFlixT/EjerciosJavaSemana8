
package com.mycompany.ordenable;

import java.util.Collections;
import java.util.List;

public class ListaNumeros implements Ordenable{

    @Override
    public void ordenar(List<Integer> lista) {
        Collections.sort(lista);
    }
    
}
