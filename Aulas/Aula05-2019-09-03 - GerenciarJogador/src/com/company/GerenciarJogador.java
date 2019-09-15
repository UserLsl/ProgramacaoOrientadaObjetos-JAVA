package com.company;

import java.util.Scanner;

public class GerenciarJogador {
    public int indice = 0;
    Time[] equipe = new Time[20];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarJogador tm = new GerenciarJogador();

        int opc = 0;
        do{
            System.out.println("1 .. Cadastrar Time");
            System.out.println("2 .. Cadastrar Jogador");
            System.out.println("3 .. Cadastrar Jogador no Time");
            System.out.println("4 .. Listar Dados do Time");
            System.out.println("4 .. Listar Jogador do Time");
            System.out.println("9 .. Sair");
            System.out.println("Digite a opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:
                    tm.execCadTime();
                    break;
                case 2:
                    tm.execCadastrarJogador();
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

    public void execCadTime(){
        Scanner sc = new Scanner(System.in);
        this.equipe[indice] = new Time();

        System.out.println("Digite o ID do time: ");
        this.equipe[indice].setidTime(sc.nextLine());

        System.out.println("Digite o nome do time: ");
        this.equipe[indice].setNome(sc.nextLine());

        System.out.println("Time cadastrado!");
        indice++;
    }

    public void execCadastrarJogador(){
        Scanner sc = new Scanner(System.in);
        this.jogadores[indice] = new Jogador();

        System.out.println("Digite o ID do jogador: ");
        this.jogador[indice].setidJogador.parseInt(sc.nextLine());

        System.out.println("Digite o nome do jogador: ");
        this.jogador[indice].setnomeJogador(sc.nextLine());

        System.out.println("Digite a posição do jogador: ");
        this.jogador[indice].setposicaoJogador(sc.nextLine());

        System.out.println("Jogador cadastrado!");
        indice++;
    }

    public void execCadJogadorTime(){

    }

    public void listarDadosTime(){

    }

    public void listarJogadoresDoTime(){

    }
}
