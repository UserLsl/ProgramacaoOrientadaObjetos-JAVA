package com.sartorelli;
import com.company.Porta;

public class Casa {

    private String cor;
    public Porta porta1;
    public Porta porta2;
    public Porta porta3;

    public void pinta(String s) {
        this.cor = s;
    }

    public int qtdePortasAbertas() {
        int cont = 0;
        if (porta1.estaAberta() == true) cont++;
        if (porta2.estaAberta() == true) cont++;
        if (porta3.estaAberta() == true) cont++;

        return cont;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }
}
