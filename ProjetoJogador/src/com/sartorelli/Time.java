package com.sartorelli;

/**
 * @author Lucas Sartorelli Leinatti
 * @since Setembro 2019
 * @version 1.0
 */

public class Time{

    int idTime;
    String nome;
    Jogador jogadores[] = new Jogador[3];
    int contador = 0;

    /** * Adiciona um jogador ao Time
        * @param jogadorAdd Jogador a ser adicionado
        * @return boolean - Se o jogador foi ou não adicionado com sucesso ao Time*/
    public boolean adicionarJogador(Jogador jogadorAdd){

        //Método Anterior
        /*if(contador >= 3) return false;
        jogadores[contador] = new Jogador();
        jogadores[contador].setIdJogador(jogador.getIdJogador());
        jogadores[contador].setNomeJogador(jogador.getNomeJogador());
        jogadores[contador].setPosicaoJogador(jogador.getPosicaoJogador());
        contador++;
        return true;*/

        int i = 0;

        for (Jogador jogador: jogadores) {
            if (jogador == null){
                jogadores[i] = new Jogador();
                jogadores[i].setIdJogador(jogadorAdd.getIdJogador());
                jogadores[i].setNomeJogador(jogadorAdd.getNomeJogador());
                jogadores[i].setPosicaoJogador(jogadorAdd.getPosicaoJogador());
                return true;
            }
            i++;
        }
        return false;
    }

    /** * Remove um jogador do Time
        * @param jogadorRemove Jogador a ser removido
        * @return boolean - Se o jogador foi ou não removido com sucesso do Time*/
    public boolean removerJogador(Jogador jogadorRemove){
        int i = 0;

        if (jogadores == null) return false;

        for (Jogador jogador: jogadores) {
            if (jogador != null){
                if (jogador.getIdJogador() == jogadorRemove.getIdJogador()){
                    jogadores[i] = null;
                    return true;
                }
            }
            i++;
        }
        return false;
    }

    /** * Mostra jogadores do Time*/
    public void listarJogadores(){
        for (Jogador jogador: jogadores) {
            if (jogador != null) jogador.listarJogador();
        }
    }

    /** * Mostra dados do Time*/
    public void listarTime(){
        System.out.println(idTime + " | " + nome);
    }

    /** * Devolve Id do Time
        * @return idTime*/
    public int getIdTime() {
        return idTime;
    }

    /** * Grava id do Time
        * @param idTime Id do Time*/
    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    /** * Devolve Nome do Time
        * @return nome*/
    public String getNome() {
        return nome;
    }

    /** * Grava nome do Time
        * @param nome Nome do Time*/
    public void setNome(String nome) {
        this.nome = nome;
    }

    /** * Devolve Array de Jogadores do Time
        * @return jogadores*/
    public Jogador[] getJogadores() {
        return jogadores;
    }

    /** * Grava vetor de jogadores
        * @param jogadores Jogadores[]*/
    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
