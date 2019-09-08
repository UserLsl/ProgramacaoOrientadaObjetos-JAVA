package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente clientes[] = new Cliente[5];

        clientes[0] = new Cliente();
        clientes[1] = new Cliente();
        clientes[2] = new Cliente();
        clientes[3] = new Cliente();
        clientes[4] = new Cliente();

        clientes[0].nome = "Maromo";
        clientes[1].nome = "Marcos";
        clientes[2].nome = "Peterson";
        clientes[3].nome = "Wilgner";
        clientes[4].nome = "Lucas";

        for (Cliente cliente: clientes) {
            if(cliente != null) cliente.listar();
        }

    }
}
