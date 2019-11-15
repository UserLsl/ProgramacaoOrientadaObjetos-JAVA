package com.empresa;

import java.util.Objects;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        return nome.length();
    }

    @Override
    public boolean equals(Object obj) {
        if((obj instanceof Produto) && ((Produto) obj).codigo == this.codigo) {
            return true;
        }else{
            return false;
        }
    }
}
