package com.sartorelli;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Esfera {
    private float volume;
    private float raio;

    //Método Construtor
    public Esfera(float raio){
        this.raio = raio;
        this.volume = (float) (4 * PI * pow(raio, 3)) / 3;
    }

    //Gets
    public float getVolume() {
        return volume;
    }

    public float getRaio() {
        return raio;
    }
}
