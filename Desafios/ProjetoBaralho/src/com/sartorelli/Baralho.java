package com.sartorelli;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Lucas Sartorelli Leinatti
 * @since Setembro 2019
 * @version 1.0
 */

/**Lista de Cartas do baralho*/
public class Baralho<cartas> {

    //Atributo

    private ArrayList<Carta> cartas;


    //Métodos

    /** * Método Construtor | Gerencia o baralho
        * @throws InterruptedException*/
    public Baralho() throws InterruptedException {

        //Mostrando mensagens e chamando métodos
        System.out.println("Montando baralho...\n");
        Thread.currentThread().sleep(1000);
        montar();
        exibir();
        System.out.println("\n\nEmbaralhando...\n");
        Thread.currentThread().sleep(1000);
        embaralhar();
        exibir();
    }


    /** * Instancia objetos Carta e organiza-os em lista montando o baralho*/
    private void montar(){

        //Alocando ArrayList cartas na memória
        cartas = new ArrayList<>();

        //Percorrendo naipes e valores
        for (Naipe naipe: Naipe.values()) {
            for (Valor valor: Valor.values()) {

                //adicionando objetos Carta (referências) no Baralho (ArrayList)
                cartas.add(new Carta(naipe, valor));
            }
        }
    }


    /** * Embaralha a Lista de cartas (baralho) aleatóriamente*/
    private void embaralhar(){

        //Chamando função interna estática para embaralhar coleções
        Collections.shuffle(cartas);
    }


    /** * Mostra o baralho, carta por carta
        * @throws InterruptedException*/
    private void exibir() throws InterruptedException {

        //Percorrendo ArrayList cartas mostrando seus elementos
        for (Carta carta : cartas) {
            System.out.println(carta.toString());
            Thread.currentThread().sleep(200);
        }
    }

}
