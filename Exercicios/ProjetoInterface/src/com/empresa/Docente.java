package com.empresa;

public class Docente extends Funcionario implements Entravel{

    private String graduacao;

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    @Override
    public void entrou() {
        System.out.println("Docente entrou");
        GerenciarEntrada.acessos.add(this);
    }

    @Override
    public void saiu() {
        System.out.println("Docente saiu");
        GerenciarEntrada.acessos.remove(this);
    }
}
