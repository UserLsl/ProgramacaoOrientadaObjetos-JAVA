package com.sartorelli;

import java.util.Random;

public class Cartela {

    private String nome;
    private int numeros[][] = new int[5][5];
    private Random gerador = new Random();
    private boolean status;

    public Cartela(String nome) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = gerador.nextInt(74) + 1;
            }
        }
        this.nome = nome;
        this.status = false;
    }

    public void mostrar() {
        System.out.println("\nJogador: " + nome);
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                if ((numeros[i - 1][j - 1] < 10)) {
                    System.out.printf("0%d ", numeros[i - 1][j - 1]);
                } else {
                    System.out.printf("%d ", numeros[i - 1][j - 1]);
                }
            }
            System.out.printf("\n");
        }
    }

    public void conferir(int sorteado) {
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                if (numeros[i][j] == sorteado) numeros[i][j] = 0;
            }
        }
        verificarLinhas();
        verificarColunas();
        verificarDiagonal1();
        verificarDiagonal2();
    }

    public void verificarLinhas() {
        int soma;

        for (int[] vetor: numeros) {
            soma = 0;
            for (int i = 0; i < 5; i++) {
                soma += vetor[i];
            }
            if (soma == 0) {
                this.status = true;
                break;
            }
        }
    }

    public void verificarColunas() {
        int soma;

        for (int i = 0; i < 5; i++){
            soma = 0;
            for (int j = 0; j < 5; j++) {
                soma += numeros[j][i];
            }
            if (soma == 0) {
                this.status = true;
                break;
            }
        }
    }

    public void verificarDiagonal1() {
        int soma = 0;
        for (int i = 0; i < 5; i++){
            for (int j = i; j <= i; j++) {
                soma += numeros[i][j];
            }
        }
        if (soma == 0) {
            this.status = true;
        }
    }

    public void verificarDiagonal2() {
        int soma = 0, contador = 4;
        for (int i = 0; i < 5; i++){
            soma += numeros[i][contador];
            contador--;
        }
        if (soma == 0) {
            this.status = true;
        }
    }

    public boolean getStatus() {
        return status;
    }

    public String getNome() {
        return nome;
    }
}
