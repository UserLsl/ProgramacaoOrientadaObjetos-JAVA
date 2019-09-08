package com.sartorelli;

import java.util.Scanner;
import java.io.IOException;

public class ContaTeste{

    public static Conta contaItau = new Conta();
    public static Scanner leitor = new Scanner(System.in);
    public static int opcao;

    public static void main(String[] args)  throws IOException{

        do{
            System.out.printf("MENU PRINCIPAL \n\n");
            System.out.printf("1. Cadastrar \n");
            System.out.printf("2. Consultar \n");
            System.out.printf("3. Sacar \n");
            System.out.printf("4. Depositar \n");
            System.out.printf("5. Sair \n\n");
            System.out.println("Opção:");
            opcao = Integer.parseInt(leitor.nextLine());

            switch(opcao) {
                case 1:
                    execCadastrar();
                    break;
                case 2:
                    execConsultar();
                    System.out.printf("\nPressione ENTER para voltar ao Menu Principal...");
                    System.in.read();
                    formataEpaços();
                    break;
                case 3:
                    execSacar();
                    System.out.printf("\nPressione ENTER para voltar ao Menu Principal...");
                    System.in.read();
                    formataEpaços();
                    break;
                case 4:
                    execDepositar();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.printf("\nVocê escolheu uma opção inválida! \n");
                    System.out.printf("--------------------------------- \n\n\n");

            }

            opcao = 0;

        }while(opcao == 0);

    }

    public static void execCadastrar(){
        formataEpaços();
        System.out.println("Digite o nome do cliente: ");
        contaItau.nomeCliente = leitor.nextLine();

        System.out.println("Digite o nome da conta: ");
        contaItau.conta = leitor.nextLine();

        System.out.println("Digite a agência da conta: ");
        contaItau.agencia = leitor.nextLine();

        contaItau.saldo = 0;
        formataEpaços();
    }

    public static void execConsultar(){
        formataEpaços();
        if(verificaConta() == true){
            contaItau.imprimir();
        }
    }

    public static void execSacar(){
        formataEpaços();
        if(verificaConta() == true){
            System.out.println("Digite o valor a sacar: ");

            switch(contaItau.sacar(Double.parseDouble(leitor.nextLine()))){
                case 1:
                    System.out.println("Saque efetuado com sucesso!");
                    break;
                case 0:
                    System.out.println("Saque não realizado!\nO valor de saque é maior que o saldo dísponivel. Verifique os valores.");
                    break;
            }
        }
    }

    public static void execDepositar(){
        formataEpaços();
        if(verificaConta() == true){
            System.out.println("Digite o valor a depositar: ");
            contaItau.depositar(Double.parseDouble(leitor.nextLine()));
            formataEpaços();
        }
    }

    public static void formataEpaços(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
    }

    public static boolean verificaConta(){
        if(contaItau.nomeCliente == null){
            System.out.println("Conta não existente!");
            return false;
        }else{
            return true;
        }
    }

}
