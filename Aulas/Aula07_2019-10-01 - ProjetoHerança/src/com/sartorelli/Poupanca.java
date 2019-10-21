package com.sartorelli;

public class Poupanca extends Conta {

    private int diaAniversario;


    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor < getSaldo()){
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    //Chama o método imprimir da superclasse (Mãe) e depois imprime seu atributo particular "diaAniversario"
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("diaAniversario = " + diaAniversario);
    }

}
