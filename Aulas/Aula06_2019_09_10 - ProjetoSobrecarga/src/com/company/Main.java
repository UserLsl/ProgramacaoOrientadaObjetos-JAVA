package com.company;

public class Main {

    public static void main(String[] args) {

        Aluno al = new Aluno();
        System.out.println("RA gerado: " + al.getRa());

        Aluno a2 = new Aluno("adm", "1234");

        Aluno a3 = new Aluno("maria", "teste@tes", "login","1234");

        a3.imprimir();
    }
}
