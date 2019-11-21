package com.empresa;

public class Aluno extends Pessoa implements Entravel {

    private int ra;
    private String curso;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void entrou() {
        System.out.println("Aluno entrou");
        GerenciarEntrada.acessos.add(this);
    }

    @Override
    public void saiu() {
        System.out.println("Aluno saiu");
        GerenciarEntrada.acessos.remove(this);
    }
}
