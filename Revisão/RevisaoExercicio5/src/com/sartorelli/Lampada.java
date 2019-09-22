package com.sartorelli;

public class Lampada {

    //Atributos

    private Tipo tipo;
    private float voltagem;
    private String cor;
    private String marca;
    private double preco;
    private float potencia;
    private boolean status;

    //Métodos

    public Lampada(){
        this.setStatus(false);
    }

    public void ascender(){

    }

    public void apagar(){

    }

    public void imprimir(){
        System.out.println(marca + " - " + cor + " - " + tipo + " - " + voltagem + " - " + potencia + " - " + preco);
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setVoltagem(float voltagem) {
        this.voltagem = voltagem;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getPotencia() {
        return potencia;
    }

    public double getPreco() {
        return preco;
    }

    public boolean getStatus() {
        return status;
    }
}
