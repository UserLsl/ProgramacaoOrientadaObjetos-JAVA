package com.empresa.model;

public class Cilindro extends Figura {

    private double raio;

    @Override
    public double getCalculoVolume() {

        return Math.PI * Math.pow(raio, 2) * altura;

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
