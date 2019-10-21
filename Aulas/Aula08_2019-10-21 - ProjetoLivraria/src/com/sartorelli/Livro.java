package com.sartorelli;

public class Livro extends Produto {

    private String autor;
    private String editora;
    private String edicao;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        StringBuilder tx = new StringBuilder();
        tx.append(super.toString());
        tx.append("Autor:" + autor + "\n");
        tx.append("Editora:" + editora + "\n");
        tx.append("Edição:" + edicao + "\n");
        return tx.toString();
    }

    @Override
    public double getPrecoVenda() {
        return getPrecoCusto() * 1.2;
    }
}
