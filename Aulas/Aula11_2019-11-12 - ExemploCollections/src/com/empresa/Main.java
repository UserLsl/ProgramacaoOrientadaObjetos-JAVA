package com.empresa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //add para Adicionar elementos na lista
        List lista = new ArrayList();
        lista.add("Marcos");
        lista.add(23);
        lista.add('a');
        lista.add("Zeca");
        lista.add(2);
        lista.add(2);

        //remove para Remover elementos
        lista.remove("Zeca");
        lista.remove(new Integer(23));

        //size para tamanho da lista
        System.out.println("Tamanho: " + lista.size());

        //Percorrer e apresentar elementos da lista
        System.out.println("Elementos da lista: ");
        for (Object x: lista) {
            System.out.println(x);
        }

        //contains para Verificar se um elemento está contido na lista
        System.out.println(lista.contains("Marcos"));

        //Enquanto elemento estiver na lista remover (remove todos elementos iguais)
        while(lista.contains(new Integer (2))) {
            lista.remove((Integer) 2);
        }

        //addall para Adicionar uma lista a outra lista

        //clear() para limpar a lista

        //indexOf retorna o elemento no index informado

        //removeAll monta uma lista parcial de elementos que serão removidos da lista

        //retainAll remove todos os outros elementos que não estão na lista parcial passada



    }
}
