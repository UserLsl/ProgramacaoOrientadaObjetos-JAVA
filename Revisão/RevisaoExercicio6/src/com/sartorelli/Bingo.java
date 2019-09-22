package com.sartorelli;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Bingo {

    private Cartela cartela[];
    private Scanner leitor;
    private Random gerador;
    private int sorteado;
    private int qtdeJogadores;

    public static void main(String[] args) throws IOException {

        Bingo jogo = new Bingo();
        jogo.leitor = new Scanner(System.in);
        jogo.gerador = new Random();

        System.out.println("BINGOO!!!");
        jogo.preparaJogo();
        System.out.printf("\nPressione qualquer tecla para começar o jogo...");
        System.in.read();

        do{
            jogo.sorteado = jogo.sorteio();
            System.out.println("\nO número sorteado foi: " + jogo.sorteado + "!");
            for (Cartela cartela: jogo.cartela) {
                cartela.conferir(jogo.sorteado);
            }
            jogo.imprimir();
            jogo.next();
        }while (jogo.verificarGanhador() == false);

        jogo.mostrarGanhador();
        jogo.imprimir();

    }

    public void preparaJogo() {
        System.out.printf("Digite a quantidade de jogadores: ");
        qtdeJogadores = Integer.parseInt(leitor.nextLine());
        cartela = new Cartela[qtdeJogadores];

        for (int i = 0; i < qtdeJogadores; i++) {
            System.out.printf("Digite o nome do jogador " + (i+1) + ": ");
            cartela[i] = new Cartela(leitor.nextLine());
        }
        imprimir();
    }

    public void next() throws IOException {
        System.out.printf("\nPressione qualquer tecla para continuar para próxima rodada...");
        System.in.read();
    }

    public int sorteio() {
        return gerador.nextInt(74) + 1;
    }

    public void imprimir() {
        for (Cartela cartela: cartela) {
            if (cartela != null) cartela.mostrar();
        }
    }

    public boolean verificarGanhador() {
        for (Cartela cartela: cartela) {
            if (cartela != null){
                if (cartela.getStatus() == true) return true;
            }
        }
        return false;
    }

    public void mostrarGanhador() {
        for (Cartela cartela: cartela) {
            if (cartela != null){
                if (cartela.getStatus() == true) System.out.println("\nO ganhador foi " + cartela.getNome());
            }
        }
    }

}
