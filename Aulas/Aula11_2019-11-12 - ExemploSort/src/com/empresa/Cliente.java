package com.empresa;

public class Cliente implements Comparable<Cliente> {

    public int idCliente;
    public String nomeCliente;

    Cliente(int idCliente , String nomeCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
    }

    @Override
    public int compareTo(Cliente o) {
        if(this.idCliente < o.idCliente) {
            return -1;
        }
        if(this.idCliente > o.idCliente) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Identificação do Cliente \n");
        sb.append(this.idCliente);
        sb.append("\nNome do Cliente \n");
        sb.append(this.nomeCliente);
        sb.append("\n \n");
        return sb.toString();
    }

}
