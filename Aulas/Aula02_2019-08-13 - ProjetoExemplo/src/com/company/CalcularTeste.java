package com.company;

public class CalcularTeste {

    public static void main(String[] args) {
	    Pessoa pessoa1 = new Pessoa();
	    pessoa1.nome = "Chico";
	    pessoa1.peso = 110;
	    pessoa1.altura = 1.78;
	    pessoa1.idade = 52;

        System.out.println("IMC do " + pessoa1.nome);
        System.out.println("é: " + pessoa1.calcularImc());

        System.out.println();
        System.out.println("Dados da pessoa");
        pessoa1.imprimir();
    }
}
