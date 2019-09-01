package com.sartorelli;

public class Computador {

    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    public void imprimir(){

        System.out.println("marca = " + marca);
        System.out.println("cor = " + cor);
        System.out.println("modelo = " + modelo);
        System.out.println("numeroSerie = " + numeroSerie);
        System.out.println("preco = " + preco);

    }

    public void calcularValor(){

        //O ideal seria nesse caso usar a função equalsIgnoreCase
        switch(marca){
            case "HP":
                preco+= preco * 0.3;
                break;
            case "IBM":
                preco+= preco * 0.5;
                break;
        }

    }

    public int alterarValor(double valor){

        if(valor > 0){
            preco = valor;
            return 1;
        }else {
            return 0;
        }

    }
}
