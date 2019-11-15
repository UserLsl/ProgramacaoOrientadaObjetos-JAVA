package com.empresa;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        long inicio, fim;
        int n = 2600000;
        inicio = System.currentTimeMillis();
        List array = new LinkedList();
        for(int i=0; i< n;i++){
            Conta c = new Conta();
            c.setId(i);
            c.setCliente("Cliente" + i);
            array.add(c);
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo para inserir: " + (fim-inicio)/1000.0 + " segundo");
        inicio = System.currentTimeMillis();
        Iterator o = array.iterator();

        while (o.hasNext()){
            Conta x = (Conta) o.next();
        }

        fim = System.currentTimeMillis();
        System.out.println
        ("Tempo para iterar: " + (fim-inicio)/1000.0 + " segundo");

    }
}
