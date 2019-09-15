package com.sartorelli;

import java.util.Scanner;
import java.io.IOException;

/**
 * @author Lucas Sartorelli Leinatti
 * @since Setembro 2019
 * @version 1.0
 */

public class GerenciarJogador {

    Scanner leitor = new Scanner(System.in);
    Time time[] = new Time[10];
    Jogador jogadorTodos[] = new Jogador[30];
    int contadorTime = 0;
    int contadorJogador = 0;


    /** * Principal do Programa
        * @param args Padrão
        * @throws IOException*/
    public static void main(String[] args) throws IOException{

        int opcao;
        GerenciarJogador gj = new GerenciarJogador();

        do{
            System.out.printf("MENU PRINCIPAL \n\n");
            System.out.printf("1. Cadastrar Time \n");
            System.out.printf("2. Cadastrar Jogador \n");
            System.out.printf("3. Tranferir Jogador \n");
            System.out.printf("4. Consultar Dados do Time \n");
            System.out.printf("5. Consultar Dados do Jogador \n");
            System.out.printf("6. Listar Jogadores do Time \n");
            System.out.printf("7. Listar todos os Jogadores \n");
            System.out.printf("8. Remover Jogador do Time \n");
            System.out.printf("9. Sair \n\n");
            System.out.printf("Opção: ");
            opcao = Integer.parseInt(gj.leitor.nextLine());

            switch(opcao){
                case 1:
                    gj.execCadTime();
                    gj.pause();
                    break;
                case 2:
                    gj.execCadJogador();
                    gj.pause();
                    break;
                case 3:
                    gj.execCadJogadorTime();
                    gj.pause();
                    break;
                case 4:
                    gj.listarDadosTime();
                    gj.pause();
                    break;
                case 5:
                    gj.listarDadosJogador();
                    gj.pause();
                    break;
                case 6:
                    gj.listarJogadoresTime();
                    gj.pause();
                    break;
                case 7:
                    gj.listarJogadores();
                    gj.pause();
                    break;
                case 8:
                    gj.execRemoveJogador();
                    gj.pause();
                    break;
                case 9:
                    break;
                default:
                    System.out.printf("\nVocê escolheu uma opção inválida! \n");
                    System.out.printf("--------------------------------- \n\n\n");
            }


        }while(opcao != 9);

    }


    /** * Cadastra um Time*/
    public void execCadTime(){
        if(contadorTime < 10){
            time[contadorTime] = new Time();

            time[contadorTime].setIdTime(contadorTime + 1);

            System.out.printf("Digite o nome do Time: ");
            time[contadorTime].setNome(leitor.nextLine());

            contadorTime++;
        }else{
            System.out.println("Erro: Limite de 10 times cadastrados atingido!");
        }
    }


    /** * Cadastra um Jogador*/
    public void execCadJogador(){
        if(contadorJogador < 30){
            jogadorTodos[contadorJogador] = new Jogador();

            jogadorTodos[contadorJogador].setIdJogador(contadorJogador + 1);

            System.out.printf("Digite o nome do Jogador: ");
            jogadorTodos[contadorJogador].setNomeJogador(leitor.nextLine());

            System.out.printf("Digite a posição do Jogador: ");
            jogadorTodos[contadorJogador].setPosicaoJogador(leitor.nextLine());

            contadorJogador++;
        }else{
            System.out.println("Erro: Limite de 30 jogadores cadastrados atingido!");
        }
    }


    /** * Cadastra jogador em um determinado Time*/
    public void execCadJogadorTime(){
        int idJogador;
        int idTime;

        System.out.printf("Deseja listar todos os jogadores? [S/N]: ");
        if (leitor.nextLine().equalsIgnoreCase("S") == true) listarJogadores();

        System.out.printf("Entre com o nome do jogador a ser transferido: ");
        idJogador = verificaCadastroJogador(leitor.nextLine());
        if (idJogador == -1) return;


        System.out.printf("Deseja listar todos os times? [S/N]: ");
        if (leitor.nextLine().equalsIgnoreCase("S") == true) listarTimes();

        System.out.printf("Entre com o nome do time que irá receber o jogador " + jogadorTodos[idJogador].getNomeJogador() + ": ");
        idTime = verificaCadastroTime(leitor.nextLine());
        if (idTime == -1) return;


        if (time[idTime].adicionarJogador(jogadorTodos[idJogador]) == true){
            System.out.printf(jogadorTodos[idJogador].getNomeJogador() + " foi transferido para o time: " + time[idTime].getNome());
        }else{
            System.out.printf("Erro: O time não pode ter mais que 3 jogadores!");
        }

    }


    /** * Lista dados de um Time*/
    public void listarDadosTime(){
        String nomeTime;
        System.out.printf("Entre com o nome do time: ");
        nomeTime = leitor.nextLine();

        if(verificaCadastroTime(nomeTime) != -1){
            time[verificaCadastroTime(nomeTime)].listarTime();
        }
    }


    /** * Lista dados de um Jogador*/
    public void listarDadosJogador(){
        String nomeJogador;
        System.out.printf("Entre com o nome do jogador: ");
        nomeJogador = leitor.nextLine();

        if(verificaCadastroJogador(nomeJogador) != -1){
            jogadorTodos[verificaCadastroJogador(nomeJogador)].listarJogador();
        }
    }


    /** * Lista jogadores de um Time*/
    public void listarJogadoresTime(){
        String nomeTime;
        System.out.printf("Entre com o nome do time: ");
        nomeTime = leitor.nextLine();

        if(verificaCadastroTime(nomeTime) != -1){
            time[verificaCadastroTime(nomeTime)].listarJogadores();
        }
    }


    /** * Lista todos os Jogadores*/
    public void listarJogadores(){
        for (Jogador jogador: jogadorTodos) {
            if(jogador != null) jogador.listarJogador();
        }
    }


    /** * Lista todos os Times*/
    public void listarTimes(){
        for (Time time: this.time) {
            if(time != null) time.listarTime();
        }
    }


    /** * Pausa o programa
        * @throws IOException*/
    public void pause() throws IOException{
        System.out.printf("\nPressione ENTER para voltar ao Menu Principal...\n");
        System.in.read();
    }


    /** * Verifica se já existe um cadastro do time
        * @param nome Nome do Time
        * @return Id do Time se encontrar senão -1*/
    public int verificaCadastroTime(String nome){
        for (Time time: this.time) {
            if(time != null) if(time.nome.equalsIgnoreCase(nome) == true) return time.getIdTime() - 1;
        }
        System.out.println("Time não encontrado!");
        return -1;
    }


    /** * Verifica se já existe um cadastro do jogador
        * @param nome Nome do Jogador
        * @return Id do Jogador se encontrar senão -1*/
    public int verificaCadastroJogador(String nome){
        for (Jogador jogador: jogadorTodos) {
            if(jogador != null) if(jogador.nomeJogador.equalsIgnoreCase(nome) == true) return jogador.getIdJogador() - 1;
        }
        System.out.println("Jogador não encontrado!");
        return -1;
    }


    /** * Remove um jogador de um Time*/
    public void execRemoveJogador(){
        int idJogador;
        int idTime;

        System.out.printf("Deseja listar todos os times? [S/N]: ");
        if (leitor.nextLine().equalsIgnoreCase("S") == true) listarTimes();

        System.out.printf("Entre com o nome do time do jogador: ");
        idTime = verificaCadastroTime(leitor.nextLine());
        if (idTime == -1) return;

        System.out.printf("Deseja listar todos os jogadores do " + time[idTime].getNome() + "? [S/N]:");
        if (leitor.nextLine().equalsIgnoreCase("S") == true) time[idTime].listarJogadores();

        System.out.printf("Entre com o nome do jogador a ser removido do time: ");
        idJogador = verificaCadastroJogador(leitor.nextLine());
        if (idJogador == -1) return;

        if (time[idTime].removerJogador(jogadorTodos[idJogador]) == true){
            System.out.printf(jogadorTodos[idJogador].getNomeJogador() + " foi removido do time: " + time[idTime].getNome());
        }else{
            System.out.printf("Erro: O time não possui esse jogador!");
        }

    }

}
