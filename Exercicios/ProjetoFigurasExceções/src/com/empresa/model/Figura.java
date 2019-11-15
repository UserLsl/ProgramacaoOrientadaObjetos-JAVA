package com.empresa.model;

public abstract class Figura {

    protected double altura;

    public abstract double getCalculoVolume();

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
