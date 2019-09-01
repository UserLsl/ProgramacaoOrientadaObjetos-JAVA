package com.sartorelli;

public class Conta{

    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    public int sacar(double valor){

        if(valor <= saldo){
            saldo-= valor;
            return 1;
        }else{
            return 0;
        }

    }

    public void depositar(double valor){

        saldo += valor;

    }

    public void imprimir(){

        System.out.println("Conta: " + conta);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("Cliente: " + nomeCliente);

    }

}
