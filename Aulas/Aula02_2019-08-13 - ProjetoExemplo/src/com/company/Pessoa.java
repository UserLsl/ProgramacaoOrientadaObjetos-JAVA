package com.company;

public class Pessoa {
    //Definindo atributos
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    
    //Definir os metodos
    public double calcularImc(){
        return peso / (Math.pow(altura, 2.0));
        //return peso / (altura * altura);
    }

    public void imprimir(){
        System.out.println("Nome da pessoa = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("altura = " + altura);
        System.out.println("peso = " + peso);
    }

    /*
    //Método modificador de acesso
    public void setPeso(double peso){
        this.peso = peso;
    }

    //getSets automáticos para atributos privates (Alt + Insert)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }*/

}
