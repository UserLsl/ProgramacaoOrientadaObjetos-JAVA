package com.company;

public class Jogador {
    int idJogador;
    String nomeJogador;
    String posicaoJogador;

    public int getIdJogador() {return idJogador;}
    public void setIdJogador(int idJogador) {this.idJogador = idJogador;}

    public String getNomeJogador() {return nomeJogador;}
    public void setNomeJogador(String nomeJogador) {this.nomeJogador = nomeJogador;}

    public String getPosicaoJogador() {return posicaoJogador;}
    public void setPosicaoJogador(String posicaoJogador) {this.posicaoJogador = posicaoJogador;}

    public void listarJogador(){
        System.out.println("JOGADOR");
        System.out.println("Id do jogador = " + idJogador);
        System.out.println("Nome do jogador = " + nomeJogador);
        System.out.println("Posição do jogador = " + posicaoJogador);
    }
}
