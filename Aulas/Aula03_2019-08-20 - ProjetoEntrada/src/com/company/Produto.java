package com.company;

/**
 * @author Lucas
 * @since Agosto 2019
 * @version 1.0 beta
 */

public class Produto {
    public int idCodigo;
    public String nome;
    public double valor;

    /**
     * @return Dados do produto ative
     */

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("Código = ").append(idCodigo).append("\n");
        dados.append("Nome = ").append(nome).append("\n");
        dados.append("Valor = ").append(valor).append("\n");
        return dados.toString();
    }

}
