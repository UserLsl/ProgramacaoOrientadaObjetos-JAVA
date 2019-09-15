package com.company;

public class Main {

    public static void main(String[] args) {

        Cartao mCartao = new Cartao();
        mCartao.nome = "Douglas";
        mCartao.limite = 5000.00;
        mCartao.anoVcto = 2020;
        mCartao.mesVcto = Meses.JUNHO;

        System.out.println("Mes Venciment: ");
        System.out.println("Ano: " + mCartao.anoVcto);
        System.out.println("Mes: " + mCartao.mesVcto);

        Meses vetor[] = Meses.values();
        for (Meses mes: vetor) {
            System.out.println(mes.ordinal());
            System.out.println(mes);
        }

    }
}
