package com.sartorelli;

/**
 * @author Lucas Sartorelli Leinatti
 * @since Setembro 2019
 * @version 1.0
 */

public class Jogador{

    int idJogador;
    String nomeJogador;
    String posicaoJogador;

    /** * Mostra dados do Jogador*/
    public void listarJogador(){
        System.out.println(idJogador + " | " + nomeJogador + " - " + posicaoJogador);
    }

    /** * Devolve Id do Jogador
        * @return idJogador*/
    public int getIdJogador(){
        return idJogador;
    }

    /** * Grava id do Jogador
        * @param idJogador Id do Jogador*/
    public void setIdJogador(int idJogador){
        this.idJogador = idJogador;
    }

    /** * Devolve Nome do Jogador
        * @return nomeJogador*/
    public String getNomeJogador(){
        return nomeJogador;
    }

    /** * Grava nome do Jogador
        * @param nomeJogador Nome do Jogador*/
    public void setNomeJogador(String nomeJogador){
        this.nomeJogador = nomeJogador;
    }

    /** * Devolve Posição do Jogador
        * @return posicaoJogador*/
    public String getPosicaoJogador(){
        return posicaoJogador;
    }

    /** * Grava posição do Jogador
        * @param posicaoJogador Posição do Jogador*/
    public void setPosicaoJogador(String posicaoJogador){
        this.posicaoJogador = posicaoJogador;
    }
}
