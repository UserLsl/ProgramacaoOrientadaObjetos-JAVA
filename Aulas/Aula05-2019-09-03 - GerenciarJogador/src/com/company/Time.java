package com.company;

import java.util.Scanner;

public class Time {
    public int indice = 0;
    public int idTime;
    public String nome;
    Jogador[] jogadores = new Jogador[25];
    Scanner sc = new Scanner(System.in);

    int opc = 0;
        do{
        System.out.println("1 .. Adicionar Jogador");
        System.out.println("2 .. Remover Jogador");
        System.out.println("3 .. Listar Jogadores");
        System.out.println("4 .. Listar times");
        System.out.println("9 .. Sair");
        System.out.println("Digite a opção: ");
        opc = Integer.parseInt(sc.nextLine());
        switch(opc){
            case 1:
                jogadores.adicionarJogador();
                break;
            case 2:
                jogadores.execCadastrarJogador();
                break;
            case 3:
                tm.execCadJogadorTime();
                break;
            case 4:
                tm.consultar();
                break;
            case 9:
                System.out.println("Fim de Papo");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }while(opc != 9);
}

public void adicionarJogador(){
    Scanner sc = new Scanner(System.in);
    this.jogadores[indice] = new Jogador();

    System.out.println("Digite o ID do jogador: ");
    this.jogadores[indice].setIdJogador.parseInt(sc.nextLine());

    System.out.println("JOGADOR ADICIONADO AO TIME!");
    indice++;
}

public void removerJogador(){
    Scanner sc = new Scanner(System.in);
    this.jogadores[indice] = new Jogador();

    System.out.println("Digite o ID do jogador: ");
    this.jogadores[indice]setIdJogador(sc.nextLine());

    System.out.println("JOGADOR REMOVIDO DO TIME!");
    indice--;
}

public void listarJogadores(){

}

public void listar(){
    System.out.println("TIME");
    System.out.println("Id do time = " + idTime);
    System.out.println("Nome do time = " + nome);
}
