package com.company;

import java.time.LocalDate;

public class Funcionario {

    //Atributos

    private int idFunc;
    private String nomeFunc;
    private String departamento;
    private LocalDate dataContrataçao;
    private double salario;
    private String documento;
    private boolean ativo;

    //Métodos

    public void atualizarSalario(double aumento) {
        //Validar a entrada, ou seja, aumento deve ser positivo.
        if (aumento > 0) salario += aumento;
    }

    public void demiteFuncionario() {
        //Altera o campo ativo para false.
        ativo = false;
    }

    public void imprimir() {
        //Exibir todos os dados do Funcionário.
        System.out.println("idFunc = " + idFunc);
        System.out.println("nomeFunc = " + nomeFunc);
        System.out.println("departamento = " + departamento);
        System.out.println("dataContrataçao = " + dataContrataçao);
        System.out.println("salario = " + salario);
        System.out.println("documento = " + documento);
        System.out.println("ativo = " + ativo);
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContrataçao() {
        return dataContrataçao;
    }

    public void setDataContrataçao(LocalDate dataContrataçao) {
        this.dataContrataçao = dataContrataçao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
