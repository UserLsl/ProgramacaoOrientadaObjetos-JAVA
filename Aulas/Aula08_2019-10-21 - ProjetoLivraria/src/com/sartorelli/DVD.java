package com.sartorelli;

public class DVD extends Produto {

    private String diretor;
    private String duracao;
    private String censura;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }

    @Override
    public String toString() {
        StringBuilder tx = new StringBuilder();
        tx.append(super.toString());
        tx.append("Diretor: " + diretor + "\n");
        tx.append("Duracao: " + duracao + "\n");
        tx.append("Censura: " + censura + "\n");
        return tx.toString();
    }

    @Override
    public double getPrecoVenda() {
        return getPrecoCusto() * 1.4;
    }
}
