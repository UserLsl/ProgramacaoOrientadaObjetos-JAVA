package com.company;

public class Produto {

    public int id;
    public String nome;
    public double valor;
    public int qtdEstoque;

    public void regEntrada(int valor){
        qtdEstoque += valor;
    }

    public boolean regSaida(double valor){
        if (valor > qtdEstoque) {
            return false;
        }
        qtdEstoque -= valor;
        return true;
    }

    public void imprimir(){
        System.out.println("Id = " + id);
        System.out.println("Nome = " + nome);
        System.out.println("Valor = " + valor);
        System.out.println("Quantidade em estoque = " + qtdEstoque);
    }
}
