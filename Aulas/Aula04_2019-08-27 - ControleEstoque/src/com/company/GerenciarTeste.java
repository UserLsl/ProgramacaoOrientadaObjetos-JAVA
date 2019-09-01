package com.company;

import java.util.Scanner;
import java.io.IOException;

public class GerenciarTeste {

    Produto produto = new Produto();
    Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){
        GerenciarTeste gt = new GerenciarTeste();
        int opcao;
        gt.produto.id = 1;
        gt.produto.nome = "Caneta";
        gt.produto.valor = 2.00;

        do{
            System.out.printf("MENU PRINCIPAL \n\n");
            System.out.printf("1. Registrar entrada de produtos \n");
            System.out.printf("2. Registrar saída de produtos \n");
            System.out.printf("3. Consultar estoque \n");
            System.out.printf("5. Sair \n\n");
            System.out.println("Opção:");
            opcao = Integer.parseInt(gt.leitor.nextLine());

            switch(opcao) {
                case 1:
                    gt.entrarProduto();
                    break;
                case 2:
                    gt.SairProduto();
                    System.out.printf("\nPressione ENTER para voltar ao Menu Principal...");
                    break;
                case 3:
                    gt.ConsultarEstoque();
                    System.out.printf("\nPressione ENTER para voltar ao Menu Principal...");
                    break;
                case 5:
                    break;
                default:
                    System.out.printf("\nVocê escolheu uma opção inválida! \n");
                    System.out.printf("--------------------------------- \n\n\n");
            }


        }while(opcao != 5);

    }

    public void entrarProduto() {
        System.out.println("Registrar quantidade de entrada: ");
        produto.regEntrada(Integer.parseInt(leitor.nextLine()));
    }

    public void SairProduto(){
        System.out.println("Registrar quantidade de saída: ");
        produto.regSaida(Integer.parseInt(leitor.nextLine()));
    }

    public void ConsultarEstoque(){
        produto.imprimir();
    }
}
