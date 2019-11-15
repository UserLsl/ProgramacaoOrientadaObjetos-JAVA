package com.empresa.model;

public class Piramide extends Figura {

    private double comprimento;
    private double largura;

    @Override
    public double getCalculoVolume() {

        return (comprimento * largura * altura) / 6;

    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}


