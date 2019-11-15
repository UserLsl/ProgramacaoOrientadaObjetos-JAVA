package com.empresa.model;

public class Cone extends Figura {

    private double raio;

    @Override
    public double getCalculoVolume() {

        return Math.PI * Math.pow(raio, 2) * (altura / 3);

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
