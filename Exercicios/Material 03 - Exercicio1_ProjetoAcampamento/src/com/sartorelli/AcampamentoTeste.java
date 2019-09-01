package com.sartorelli;

import java.util.Scanner;

public class AcampamentoTeste {

    public static void main(String[] args) {

        Acampamento membro = new Acampamento();
        Scanner leitor = new Scanner(System.in);

        //ATRIBUINDO NOME
        System.out.println("Digite o nome do sujeito: ");
        membro.nome = leitor.nextLine();
        //System.out.println("Nome digitado = " + membro.nome);

        //ATRIBUINDO IDADE
        System.out.println("Digite a idade do sujeito: ");
        membro.idade = Integer.parseInt(leitor.nextLine());

        //EXECUTANDO MÉTODO SEPARARGRUPO
        membro.separarGrupo();

        //EXECUTANDO MÉTODO IMPRIMIR
        membro.imprimir();
        
    }
}
