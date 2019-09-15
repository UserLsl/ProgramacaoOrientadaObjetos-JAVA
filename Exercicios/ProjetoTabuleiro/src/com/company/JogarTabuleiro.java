package com.company;

import java.util.Scanner;

public class JogarTabuleiro {

    public static void main(String[] args) {
        int palpite[] = new int[2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Pedir palpites");

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o palpite " + (i+1));
            palpite[i] = Integer.parseInt(sc.nextLine());
        }

        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.setP(palpite);
        double resultado = tabuleiro.jogar();
        System.out.println("Seu prêmio é: " + resultado);
        tabuleiro.exibirTabuleiro();
    }
}
