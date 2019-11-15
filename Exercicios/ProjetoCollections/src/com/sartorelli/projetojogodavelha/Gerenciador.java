package com.sartorelli.projetojogodavelha;

import java.util.*;

public class Gerenciador {

    private Scanner scan = new Scanner(System.in);
    private List<String> nomes = new ArrayList<>();

    public static void main(String[] args) {

        Gerenciador manager = new Gerenciador();
        int option = 0;

        try {
            do {

                System.out.println("\nLISTA DE NOMES");
                System.out.println("1. Adicionar");
                System.out.println("2. Imprimir");
                System.out.println("3. Remover");
                System.out.println("4. Adicionar Vários");
                System.out.println("5. Ordenar");
                System.out.println("6. Embarralhar");
                System.out.println("7. Procurar");
                System.out.println("8. Esvaziar Lista");
                System.out.println("9. Sair");
                System.out.printf("\nOpção:");

                option = manager.scan.nextInt();

                switch (option) {
                    case 1: manager.adicionar();
                        break;
                    case 2: manager.imprimir();
                        break;
                    case 3: manager.remover();
                        break;
                    case 4: manager.adicionarVarios();
                        break;
                    case 5: manager.ordenar();
                        break;
                    case 6: manager.embarralhar();
                        break;
                    case 7: manager.procurar();
                        break;
                    case 8: manager.esvaziar();
                        break;
                    case 9: System.exit(0);
                        break;
                    default: System.out.println("Você deve digitar um número de 1 a 9! Conforme opções.");
                }

            }while(option != 9);

        } catch (InputMismatchException ex1) {
            System.out.println("Você deve digitar um número de 1 a 9! Conforme opções.");
        } catch (ArithmeticException ex2) {
            System.out.println("Erro: " + ex2.getMessage());
        } catch (NullPointerException ex3) {
            System.out.println("Erro: " + ex3.getMessage());
        } catch (Exception ex4) {
            System.out.println("Erro: " + ex4.getMessage());
        }

    }


    public void adicionar() {
        System.out.printf("\nDigite um nome a adicionar a lista: ");
        nomes.add(String.valueOf(scan.next()).toUpperCase());
    }

    public void imprimir() {
        for (String nome: nomes) {
            if (nome != null) System.out.println(nome);
        }
    }

    public void remover() {
        System.out.printf("\nDigite um nome a remover da lista: ");
        String nomeRemover = String.valueOf(scan.next());

        for (String nome: nomes) {
            if (nome != null) {
                if (nomeRemover.equalsIgnoreCase(nome)) {
                    nomes.remove(nome);
                    System.out.println("Nome removido com sucesso!");
                    return;
                }
            }
        }
        System.out.println("Nome não encontrado!");
    }

    public void adicionarVarios() {
        int op;
        List<String> nomesAux = new ArrayList<>();

        do {
            System.out.printf("\nDigite um nome a adicionar a lista: ");
            nomesAux.add(String.valueOf(scan.next()).toUpperCase());
            System.out.printf("\n(1- para continuar adicionando)\n(2- para parar)\nOpção: ");
            op = scan.nextInt();
        } while (op != 2);

        nomes.addAll(nomesAux);

    }

    public void ordenar() {
        Collections.sort(nomes);
        imprimir();
    }

    public void embarralhar() {
        Collections.shuffle(nomes);
        imprimir();
    }

    public void procurar() {
        System.out.printf("\nDigite um nome para procurar na lista: ");
        String nomeProcurar = String.valueOf(scan.next());
        for (String nome: nomes) {
            if (nome != null) {
                if (nomeProcurar.equalsIgnoreCase(nome)) {
                    System.out.println("Nome encontrado! Posição atual: " + nomes.indexOf(nome) + 1);
                    return;
                }
            }
        }
        System.out.println("Nome não encontrado!");
    }

    public void esvaziar() {
        nomes.clear();
        System.out.println("A lista está vazia!");
    }


}
