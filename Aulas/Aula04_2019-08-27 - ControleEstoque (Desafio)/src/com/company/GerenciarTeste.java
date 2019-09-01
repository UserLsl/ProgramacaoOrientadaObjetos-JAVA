package com.company;

import java.util.Scanner;
import java.io.IOException;

public class GerenciarTeste{

    Scanner leitor = new Scanner(System.in);
    Produto[] produto = new Produto[10];
    int contador = 0;

    public static void main(String[] args) throws IOException{

        GerenciarTeste gt = new GerenciarTeste();
        int opcao;

        do{
            System.out.printf("MENU PRINCIPAL \n\n");
            System.out.printf("1. Cadastrar produto \n");
            System.out.printf("2. Registrar entrada \n");
            System.out.printf("3. Registrar saída \n");
            System.out.printf("4. Consultar estoque de produtos \n");
            System.out.printf("5. Consultar produto \n");
            System.out.printf("6. Apagar ultimo produto \n");
            System.out.printf("7. Sair \n\n");
            System.out.printf("Opção: ");
            opcao = Integer.parseInt(gt.leitor.nextLine());

            switch(opcao){
                case 1:
                    gt.cadastrarProduto();
                    break;
                case 2:
                    gt.entrarProduto();
                    System.out.printf("\nPressione ENTER para voltar ao Menu Principal...");
                    System.in.read();
                    break;
                case 3:
                    gt.sairProduto();
                    System.out.printf("\nPressione ENTER para voltar ao Menu Principal...");
                    System.in.read();
                    break;
                case 4:
                    gt.consultarEstoque();
                    System.out.printf("\nPressione ENTER para voltar ao Menu Principal...");
                    System.in.read();
                    break;
                case 5:
                    gt.consultarProduto();
                    System.out.printf("\nPressione ENTER para voltar ao Menu Principal...");
                    System.in.read();
                    break;
                case 6:
                    gt.apagaProduto();
                    System.out.printf("\nPressione ENTER para voltar ao Menu Principal...");
                    System.in.read();
                    break;
                case 7:
                    break;
                default:
                    System.out.printf("\nVocê escolheu uma opção inválida! \n");
                    System.out.printf("--------------------------------- \n\n\n");
            }


        }while(opcao != 7);

    }

    public void cadastrarProduto(){
        if(contador < 10){
            produto[contador] = new Produto();

            produto[contador].id = contador + 1;

            System.out.printf("Digite o nome do produto: ");
            produto[contador].nome = leitor.nextLine();

            System.out.printf("Digite o valor do produto: ");
            produto[contador].valor = Double.parseDouble(leitor.nextLine());
            produto[contador].qtdEstoque = 0;

            contador++;
        }else{
            System.out.println("Erro: Lista de produtos cheia!!!");
        }
    }

    public void entrarProduto(){
        int id;

        System.out.printf("Entre com o ID do produto: ");
        id = Integer.parseInt(leitor.nextLine()) - 1;

        if(verificaCadastros(id) == true){
            System.out.printf("Registrar quantidade de entrada: ");
            produto[id].regEntrada(Integer.parseInt(leitor.nextLine()));
        }
    }

    public void sairProduto(){
        int id;

        System.out.printf("Entre com o ID do produto: ");
        id = Integer.parseInt(leitor.nextLine()) - 1;

        if(verificaCadastros(id) == true){
            System.out.printf("Registrar quantidade de saída: ");
            if(produto[id].regSaida(Integer.parseInt(leitor.nextLine())) == false){
                System.out.println("Entrada não efetuada! Estoque insuficiente.");
            }
        }
    }

    public void consultarEstoque(){
        System.out.println("\n");
        for(int i = 0; i < contador; i++){
            produto[i].imprimirProdutos();
        }
    }

    public void consultarProduto(){
        int id;
        System.out.printf("Entre com o ID do produto: ");
        id = Integer.parseInt(leitor.nextLine()) - 1;

        if(verificaCadastros(id) == true){
            produto[id].imprimirProduto();
        }
    }

    public void apagaProduto(){
        if(verificaCadastros(0) == true){
            System.out.printf("\nProduto deletado! Id: " + contador + " \n");
            contador--;
        }
    }

    public boolean verificaCadastros(int posicao){
        if(posicao < 0 || posicao >= 10){
            System.out.println("Id inválido! Digite um Id de 1 a 10.");
            return false;
        }
        if(produto[posicao] == null){
            System.out.println("Produto não cadastrado!");
            return false;
        }
        return true;
    }

}
