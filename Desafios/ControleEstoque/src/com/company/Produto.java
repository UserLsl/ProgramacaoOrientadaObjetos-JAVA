package com.company;

public class Produto{

    public int id;
    public String nome;
    public double valor;
    public int qtdEstoque;

    public void regEntrada(int valor){
        qtdEstoque += valor;
    }

    public boolean regSaida(int valor){
        if (valor > qtdEstoque){
            return false;
        }
        qtdEstoque -= valor;
        return true;
    }

    public void imprimirProdutos(){
        System.out.println(id + "- " + qtdEstoque + " " + nome);
    }

    public void imprimirProduto(){
        System.out.println("\nId: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + valor);
        System.out.println("Estoque: " + qtdEstoque);
    }

}
