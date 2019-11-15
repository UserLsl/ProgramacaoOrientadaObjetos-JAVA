package com.sartorelli;

public class Operador extends Funcionario {

    //Atributos
    private double valorHora;

    //Getters and Setters
    public double getValorHora() { return valorHora; }
    public void setValorHora(double valorHora) { this.valorHora = valorHora; }

    @Override
    public String apresentarFuncionario() {
        StringBuffer text = new StringBuffer();
        text.append(super.apresentarFuncionario());
        text.append("ValorHr: " + valorHora + " | ");
        return text.toString();
    }


}
