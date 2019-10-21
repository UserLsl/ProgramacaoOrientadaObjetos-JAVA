package com.sartorelli;

public class Main {

    public static void main(String[] args) {

        Poupanca p1 = new Poupanca();
        Corrente c1 = new Corrente();

        //Poupança do Chico
        p1.setSaldo(1);
        p1.setNomeCliente("Chico");
        p1.depositar(200.00);
        p1.setDiaAniversario(2);

        //Corrente da Maria
        c1.setNumero(2);
        c1.setNomeCliente("Maria");
        c1.depositar(300.00);
        c1.setLimite(100.00);

        System.out.println((c1.sacar(350) == true) ? "Saque efetuado" : "Saque não efetuado");

        p1.imprimir();
        c1.imprimir();

        Patrimonio p = new Patrimonio();
        p.adicionarConta(c1);
        p.adicionarConta(p1);
        System.out.println("Total Patrimonio Banco: " + p.getTotalPatrimonio());

    }
}
