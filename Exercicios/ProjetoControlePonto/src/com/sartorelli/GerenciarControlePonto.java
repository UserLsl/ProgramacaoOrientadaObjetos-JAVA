package com.sartorelli;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarControlePonto {

    ArrayList<Funcionario> funcList = new ArrayList<>();
    ArrayList<RegistroPonto> rpList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int index = 0;

    public static void main(String[] args) {

        GerenciarControlePonto gcp = new GerenciarControlePonto();
        int opcao = 0;

        Gerente gerente = new Gerente();
        gerente.setLogin("Lucas");
        gerente.setSenha("1234");
        gerente.setDocumento("67.123-0");
        gerente.setEmail("lucas@manu.com");
        gerente.setNome("Lucas Sartorelli");
        gerente.setIdFunc(1);
        gcp.funcList.add(gerente);

        Secretaria secretaria = new Secretaria();
        secretaria.setDocumento("687.586-0");
        secretaria.setEmail("Gisele@manu.com");
        secretaria.setNome("Gisele Freitas");
        secretaria.setIdFunc(2);
        secretaria.setRamal(7301);
        secretaria.setTelefone(38053131);
        gcp.funcList.add(secretaria);

        Operador operador = new Operador();
        operador.setDocumento("064.432-0");
        operador.setEmail("Odair@manu.com");
        operador.setNome("Odair Santos");
        operador.setIdFunc(3);
        operador.setValorHora(5.00);
        gcp.funcList.add(operador);

        do {
            System.out.println("\nREGISTRAR HORÁRIOS DOS FUNCIONÁRIOS");
            System.out.println("1- Registrar Entrada");
            System.out.println("2- Registrar Saída");
            System.out.println("3- Emitir Relatório");
            System.out.println("4- Sair");

            System.out.println("Opção: ");
            opcao = Integer.parseInt(gcp.scanner.nextLine());

            switch (opcao){
                case 1: gcp.execRegEntrada();
                break;
                case 2: gcp.execRegSaida();
                    break;
                case 3: gcp.execRelatorio();
                    break;
            }

        } while (opcao != 4);

    }

    public int execEntraFuncionario() {
        int id;
        apresentaFuncionarios();
        System.out.println("Entre com o Id do funcionário: ");
        id = Integer.parseInt(scanner.nextLine());
        if (buscaFuncionario(id) == null){
            return 0;
        }else{
            return id;
        }
    }

    public void execRegEntrada() {
        int id = execEntraFuncionario();
        if (id == 0) return;
        rpList.add(new RegistroPonto(++index, buscaFuncionario(id), LocalDate.now(), LocalDateTime.now(), null));
    }

    public void execRegSaida() {
        int id = execEntraFuncionario();
        if (id == 0) return;
        rpList.add(new RegistroPonto(++index, buscaFuncionario(id), LocalDate.now(), null, LocalDateTime.now()));
    }

    public void apresentaFuncionarios() {
        for (Funcionario func: funcList) {
            if (func != null) System.out.println(func.apresentarFuncionario());
        }
    }

    public Funcionario buscaFuncionario(int idFunc) {
        for (Funcionario func: funcList) {
            if (func != null){
                if (func.getIdFunc() == idFunc) return func;
            }
        }
        return null;
    }

    public void execRelatorio(){
        for (RegistroPonto rp :rpList) {
            if (rp != null) System.out.println(rp.apresentarRegistroPonto());
        }
    }
}
