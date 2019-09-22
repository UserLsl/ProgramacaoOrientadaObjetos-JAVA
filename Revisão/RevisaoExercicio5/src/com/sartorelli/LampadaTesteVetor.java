package com.sartorelli;

import java.io.IOException;
import java.util.Scanner;

public class LampadaTesteVetor {

    public Lampada vetLamp[];
    public Scanner leitor;

    public static void main(String[] args) {

        int opcao;
        LampadaTesteVetor ltv = new LampadaTesteVetor();
        ltv.leitor = new Scanner(System.in);
        ltv.vetLamp = new Lampada[30];

        do{
            System.out.printf("\nMENU PRINCIPAL \n\n");
            System.out.printf("1. Cadastrar Lâmpada \n");
            System.out.printf("2. Exibir todas as Lâmpadas \n");
            System.out.printf("3. Exibir quantidade de lâmpadas cadastradas \n");
            System.out.printf("4. Consultar qtde de lâmpadas por potência \n");
            System.out.printf("5. Exibir lâmpadas com preço menor do que o preço médio \n");
            System.out.printf("6. Exibir a quantidade de lâmpadas acesas e apagadas \n");
            System.out.printf("9. Sair \n\n");
            System.out.printf("Opção: ");
            opcao = Integer.parseInt(ltv.leitor.nextLine());

            switch(opcao){
                case 1:
                    if ((ltv.execCadLampada() == false)) {
                        System.out.printf("Lista de Lâmpadas cheia!\n");
                    } else {
                        System.out.printf("Cadastro realizado!\n");
                    }
                    //gj.pause();
                    break;
                case 2:
                    ltv.listarLampadas();
                    //gj.pause();
                    break;
                case 3:
                    ltv.listarQtdeLampadas();
                    //gj.pause();
                    break;
                case 4:
                    ltv.listarQtdeLampadasPotencia();
                    //gj.pause();
                    break;
                case 5:
                    ltv.listarLampadasPrecoMedio();
                    //gj.pause();
                    break;
                case 6:
                    ltv.listarQtdeLampadasStatus();
                    //gj.pause();
                    break;
                case 9:
                    break;
                default:
                    System.out.printf("\nVocê escolheu uma opção inválida! \n");
                    System.out.printf("--------------------------------- \n\n\n");
            }


        }while(opcao != 9);

    }

    public boolean execCadLampada() {
        int index = 0;
        int controlador = 0;

        for (Lampada lamp: vetLamp) {
            if(lamp == null){
                this.vetLamp[index] = new Lampada();

                System.out.printf("Digite a marca da lâmpada: ");
                vetLamp[index].setMarca(leitor.nextLine());

                System.out.printf("Digite a cor da lâmpada: ");
                vetLamp[index].setCor(leitor.nextLine());

                do{
                    System.out.printf("Digite o tipo da lâmpada [1- LED / 2- FLUORESCENTE]: ");
                    switch (Integer.parseInt(leitor.nextLine())){
                        case 1: vetLamp[index].setTipo(Tipo.LED); controlador = 1; break;
                        case 2: vetLamp[index].setTipo(Tipo.FLUORESCENTE); controlador = 1; break;
                        default: System.out.printf("Dados inválidos!\n");
                    }
                }while(controlador == 0);

                System.out.printf("Digite a voltagem da lâmpada: ");
                vetLamp[index].setVoltagem(Float.parseFloat(leitor.nextLine()));

                System.out.printf("Digite a potência da lâmpada: ");
                vetLamp[index].setPotencia(Float.parseFloat(leitor.nextLine()));

                System.out.printf("Digite o preço da lâmpada: ");
                vetLamp[index].setPreco(Double.parseDouble(leitor.nextLine()));

                return true;
            }
            index++;
        }
        return false;
    }

    public void pause() throws IOException {
        System.out.printf("\nPressione ENTER para voltar ao Menu Principal...\n");
        System.in.read();
    }

    public void listarLampadas() {
        for (Lampada lamp: vetLamp) {
            if(lamp != null) lamp.imprimir();
        }
    }

    public void listarQtdeLampadas() {
        int contador = 0;

        for (Lampada lamp: vetLamp) {
            if(lamp != null) contador++;
        }
        System.out.println("Existem " + contador + " lâmpadas cadastradas");
    }

    public void listarQtdeLampadasPotencia() {
        int contador = 0;
        float potencia = 0;

        System.out.printf("Digite a potência desejada: ");
        potencia = Float.parseFloat(leitor.nextLine());

        for (Lampada lamp: vetLamp) {
            if(lamp != null){
                if(lamp.getPotencia() == potencia) contador++;
            }
        }
        System.out.println("Existem " + contador + " lâmpadas com essa potência!");
    }

    public void listarLampadasPrecoMedio() {
        float precoMedio = 0;
        int contador = 0;

        for (Lampada lamp: vetLamp) {
            if (lamp != null) {
                precoMedio += lamp.getPreco();
                contador++;
            }
        }
        precoMedio /= contador;

        for (Lampada lamp: vetLamp) {
            if (lamp != null) {
                if (lamp.getPreco() < precoMedio) lamp.imprimir();
            }
        }
    }

    public void listarQtdeLampadasStatus() {
        int contador = 0;

        for (Lampada lamp: vetLamp) {
            if (lamp != null) {
                if (lamp.getStatus() == true) contador++;
            }
        }
        System.out.println("Existem " + contador + " lâmpadas acesas!");

        contador = 0;
        for (Lampada lamp: vetLamp) {
            if (lamp != null) {
                if (lamp.getStatus() == false) contador++;
            }
        }
        System.out.println("Existem " + contador + " lâmpadas apagadas!");
    }

}
