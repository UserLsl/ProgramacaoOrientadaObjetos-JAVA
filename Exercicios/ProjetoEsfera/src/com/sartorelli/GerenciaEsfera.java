package com.sartorelli;

import java.util.Scanner;

public class GerenciaEsfera {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");

        Esfera esfera = new Esfera(Float.parseFloat(leitor.nextLine()));

        System.out.println("A esfera de raio " + esfera.getRaio() + " tem volume igual a " + esfera.getVolume());

    }
}
