package com.company;

import java.util.Random;

public class Tabuleiro {
    private int m[][] = new int[10][10];
    private int p[] = new int[2];

    public int[] getP() {
        return p;
    }

    public void setP(int[] p) {
        this.p = p;
    }

    public Tabuleiro(){
        //lógica para montar o tabuleiro
        Random aleatorio = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                m[i][j] = aleatorio.nextInt(101);
            }
        }
    }

    public double jogar(){
        int acertos = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if(p[i] == m [j][k]) acertos++;
                }
            }
        }

        if(acertos >= 3){
            return acertos * 1000.0;
        }else{
            return 0.0;
        }
    }

    public void exibirTabuleiro(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%3d]", m[i][j]);
            }
            System.out.println();
        }
    }
}
