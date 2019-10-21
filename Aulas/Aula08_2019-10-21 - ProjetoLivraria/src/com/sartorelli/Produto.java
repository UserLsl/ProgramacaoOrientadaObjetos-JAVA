package com.sartorelli;

public abstract class Produto {

    private String descricao;
    private String genero;
    private int estoqueDisponivel;
    private double precoCusto;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        StringBuilder tx = new StringBuilder();
        tx.append("Descrição: " + descricao + "\n");
        tx.append("Gênero: " + descricao + "\n");
        tx.append("Estoq. Dísponivel: " + descricao + "\n");
        tx.append("Preço Custo: " + descricao + "\n");
        return tx.toString();
    }

    public void comprar(int qtde) {
        estoqueDisponivel += qtde;
    }

    public void vender(int qtde) {
        estoqueDisponivel -= qtde;
    }

    abstract double getPrecoVenda();
}
