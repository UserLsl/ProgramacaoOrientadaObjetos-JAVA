package com.company;

public class GerenciarPorta {

    public static void main(String[] args) {

    Porta porta = new Porta();

    porta.abre();
    porta.fecha();
    porta.abre();
    porta.pinta("azul");
    porta.pinta("vermelho");
    porta.setDimensaoX(50);
    porta.setDimensaoY(300);
    porta.setDimensaoZ(1);

    System.out.println("A porta " + ((porta.estaAberta() == true) ? "esta aberta" : "não esta aberta"));

    }
}
