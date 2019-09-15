package com.sartorelli;

/**
 * @author Lucas Sartorelli Leinatti
 * @since Setembro 2019
 * @version 1.0
 */

/**Carta do baralho*/
public class Carta {

    //Atributos

    private Naipe naipe;
    private Valor valor;


    //Métodos

    /** * Método Construtor | Atribui dados aos atributos da carta
        * @param naipe Naipe da Carta
        * @param valor Valor da Carta*/
    public Carta(Naipe naipe, Valor valor){
        this.naipe = naipe;
        this.valor = valor;
    }

    /** * Devolve Naipe da carta
        * @return naipe*/
    public Naipe getNaipe() {
        return naipe;
    }

    /** * Devolve Valor da carta
        * @return valor*/
    public Valor getValor() {
        return valor;
    }

    /** * Devolve Dados completos da carta
        * @return stringBuffer.toString()*/
    @Override
    public String toString() {

        //Concatenando dados da carta para retornar
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getValor());
        stringBuffer.append(" de ");
        stringBuffer.append(getNaipe());

        return stringBuffer.toString();
    }

}
