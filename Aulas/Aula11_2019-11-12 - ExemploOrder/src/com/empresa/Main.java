package com.empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List lista = new ArrayList<Cliente>();

        Cliente c1, c2, c3;
        c1 = new Cliente(1, "Oscar");
        c2 = new Cliente(7, "Maria");
        c3 = new Cliente(2, "Laércio");
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        Iterator it = lista.iterator();
        while(it.hasNext()) {
            Cliente x = (Cliente) it.next();
        System.out.println(x.toString());
        }

        Collections.sort(lista);
        it = lista.iterator();

        while(it.hasNext()) {
            Cliente x = (Cliente) it.next();
            System.out.println(x.toString());
        }
    }
}
