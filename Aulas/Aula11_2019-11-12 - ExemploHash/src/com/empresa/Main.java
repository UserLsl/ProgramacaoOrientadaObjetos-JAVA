package com.empresa;

public class Main {

    public static void main(String[] args) {

        Produto p1, p2, p3;

        p1 = new Produto();
        p1.setCodigo(11);
        p1.setNome("Copo");

        p2 = new Produto();
        p2.setCodigo(12);
        p2.setNome("Bola");

        p3 = new Produto();
        p3.setCodigo(13);
        p3.setNome("Fanta");

        System.out.println(p1.equals(p3));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());


    }
}
