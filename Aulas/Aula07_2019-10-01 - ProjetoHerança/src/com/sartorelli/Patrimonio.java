package com.sartorelli;

public class Patrimonio {

    private double total;

    public Patrimonio(){
        total = 0;
    }

    public double getTotalPatrimonio(){
        return total;
    }

    public void adicionarConta(Conta c){
        total += c.getSaldo();
    }

}
