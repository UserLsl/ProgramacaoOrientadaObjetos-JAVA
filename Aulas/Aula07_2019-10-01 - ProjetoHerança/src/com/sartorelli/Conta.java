package com.sartorelli;

public abstract class Conta {

    private int numero;
    private String nomeCliente;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Método depositar que será compartilhado
    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }

    //Método abstrato sacar: por obrigatóriedade as classes filhas precisarão implementá-los
    abstract boolean sacar(double valor);

    //Método concreto imprimir
    public void imprimir(){
        System.out.println("numero = " + numero);
        System.out.println("nomeCliente = " + nomeCliente);
        System.out.println("saldo = " + saldo);
    }

}
