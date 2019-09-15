package com.sartorelli;

import java.io.IOException;

/**
 * @author Lucas Sartorelli Leinatti
 * @since Setembro 2019
 * @version 1.0
 */

/**Gerenciador principal do programa*/
public class GerenciarJogo {

    //Atributo

    Baralho baralho;


    //Main | Exec

    /** * Principal do Programa
        * @param args Padrão
        * @throws IOException
        * @throws InterruptedException*/
    public static void main(String[] args) throws IOException, InterruptedException {

        //Instanciando objeto da própria classe
        GerenciarJogo gj = new GerenciarJogo();

        //Interação com o usuário
        System.out.println("Vamos jogar?");
        System.out.println("Pressione qualquer tecla para começar...");
        System.in.read();

        //Instanciando objeto da classe Baralho
        gj.baralho = new Baralho();

    }
}
