package com.company;

public class Funcionario {
    String nome;
    String departamento;
    double salario;
    String rg;
    boolean estaNaEmpresa;

    public void Bonificar(double aumento){
        salario += aumento;
    }

    public void Imprimir(){
        System.out.println("Nome = " + nome);
        System.out.println("Departamento = " + departamento);
        System.out.println("Salario = " + salario);
        System.out.println("Rg = " + rg);
        System.out.println("Situação = " + (estaNaEmpresa == true ? "Ativo" : "Inativo"));
    }
}
