package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class FuncionarioTest {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Funcionario func = new Funcionario();
        int dia, mes, ano;

        func.setIdFunc(1);
        func.setAtivo(true);

        System.out.println("Entre com o nome do Funcionário: ");
        func.setNomeFunc(leitor.nextLine());

        System.out.println("Entre com o departamento do Funcionário: ");
        func.setDepartamento(leitor.nextLine());

        System.out.println("Entre com o dia da contratação do Funcionário: ");
        dia = Integer.parseInt(leitor.nextLine());
        System.out.println("Entre com o mês da contratação do Funcionário: ");
        mes = Integer.parseInt(leitor.nextLine());
        System.out.println("Entre com o ano da contratação do Funcionário: ");
        ano = Integer.parseInt(leitor.nextLine());

        func.setDataContrataçao(LocalDate.of(ano, mes, dia));

        System.out.println("Entre com o salário do funcionário: ");
        func.setSalario(Double.parseDouble(leitor.nextLine()));

        System.out.println("Entre com o documento do funcionário: ");
        func.setDocumento(leitor.nextLine());

        func.atualizarSalario(-200);
        func.atualizarSalario(500);
        func.imprimir();
        func.demiteFuncionario();
        func.imprimir();
    }
}
