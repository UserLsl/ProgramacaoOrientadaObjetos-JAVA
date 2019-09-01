package com.company;

import java.util.Scanner;

/*
Comentar mais do que uma linha
*/

/**
 * @author PitSa
 * @Since Agosto 2019
 */

//Para gerar a documentação: Tools/Generate JavaDoc...

public class Main {

    public static void main(String[] args) {

	    //Exemplo de scanner para captar dados de entrada
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do sujeito: ");
        String nome = leitor.nextLine();
        System.out.println("Nome digitado = " + nome);

        //Exemplos com coversão de tipo
        int a;
        double b;
        System.out.println("Digite um valor inteiro para a: ");
        //a = leitor.nextInt();
        a = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite um valor inteiro para b: ");
        //b = leitor.nextDouble();
        b = Double.parseDouble(leitor.nextLine());
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int valor = 1000;
        String intValor = String.valueOf(valor);

        //Exemplo para usar método que imprime todos os atributos (toString)
        Produto p1 = new Produto();
        p1.idCodigo = 1;
        p1.nome = "Coca-cola";
        p1.valor = 3.89;
        System.out.println(p1.toString());

    }
}
