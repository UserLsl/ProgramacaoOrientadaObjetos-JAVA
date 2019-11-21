package com.empresa;

public class Administrativo extends Funcionario implements Entravel{

    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void entrou() {
        System.out.println("Administrativo entrou");
        GerenciarEntrada.acessos.add(this);
    }

    @Override
    public void saiu() {
        System.out.println("Administrativo saiu");
        GerenciarEntrada.acessos.remove(this);
    }
}
