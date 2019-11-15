package com.sartorelli;

import java.util.ArrayList;
import java.util.List;

public class GerenciarProdutos {

    private double totalPatrimonioEstoque = 0;
    public List<Produto> lista = new ArrayList<>();

    public static void main(String[] args) {

        GerenciarProdutos gp = new GerenciarProdutos();
        DVD dvd = new DVD();
        CD cd = new CD();
        Livro livro = new Livro();

        livro.setDescricao("Sitio do pica pau amarelo");
        livro.setAutor("Monteiro Lobato");
        livro.setPrecoCusto(15.0);
        livro.setEdicao("Edição 1");
        livro.setEditora("Boi tempo");
        livro.comprar(10);

        dvd.setDescricao("Sandy & Junior");
        dvd.setCensura("Livro");
        dvd.setDiretor("XC");
        dvd.setPrecoCusto(10.0);
        dvd.comprar(100);

        cd.setDescricao("Sérgio Reis");
        cd.setArtista("André Diretor");
        cd.setGravadora("Gravadora Rio Livre");
        cd.setPaisOrigem("Brasil");
        cd.setPrecoCusto(20.0);
        cd.comprar(10);

        gp.addProduto(livro);
        gp.addProduto(dvd);
        gp.addProduto(cd);

        System.out.println("Total Patrimonio: " + gp.getTotalPatrimonioEstoque());

    }

    public double getTotalPatrimonioEstoque(){
        return totalPatrimonioEstoque;
    }

    public void addProduto(Produto p){
        lista.add(p);
        totalPatrimonioEstoque += p.getPrecoVenda() * p.getEstoqueDisponivel();
    }

    public void listarProdutosEstocados(){
        for (Produto p: lista) {
            System.out.println("Produto: " + p.toString());
            System.out.println();
        }
    }
}
