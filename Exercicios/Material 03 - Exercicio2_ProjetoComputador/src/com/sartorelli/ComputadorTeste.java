package com.sartorelli;

public class ComputadorTeste {

    public static void main(String[] args) {
        //OBJETO 1
        Computador pc1 = new Computador();
        pc1.cor = "Preto";
        pc1.marca = "HP";
        pc1.modelo = "Compact";
        pc1.numeroSerie = 123457;
        pc1.preco = 2000;
        pc1.calcularValor();
        pc1.imprimir();

        //OBJETO 2
        Computador pc2 = new Computador();
        System.out.println("\n");
        pc2.cor = "Preto";
        pc2.marca = "IBM";
        pc2.modelo = "Evolution";
        pc2.numeroSerie = 5240822;
        pc2.preco = 5000;
        pc2.calcularValor();
        pc2.imprimir();
        pc2.alterarValor(3000);
        System.out.println("\n");
        pc2.imprimir();
    }
}
