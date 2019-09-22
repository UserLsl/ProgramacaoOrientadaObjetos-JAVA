package com.sartorelli;

import com.company.Porta;

public class GerenciarCasa {

    //IMPORTANTE: PARA IMPORTAR UMA CLASSE DE OUTRO PROJETO
    //
    //1º GERAR O .JAR DO PROJETO COM A CLASSE DESEJADA
    //  a) buid
    //  b) buid artifacts
    //  c) buid
    //2º IMPORTAR BIBLIOTECA .JAR NO NOVO PROJETO
    //  a) file
    //  b) project structure
    //  c) dependecies
    //  d) + apontar .jar no projeto do 1º passo


    public static void main(String[] args) {
        Casa casa1 = new Casa();

        casa1.pinta("Verde");

        Porta portas[] = new Porta[3];

        portas[0] = new Porta();
        portas[1] = new Porta();
        portas[2] = new Porta();

        casa1.setPorta1(portas[0]);
        casa1.setPorta2(portas[1]);
        casa1.setPorta3(portas[2]);

        casa1.porta1.abre();
        casa1.porta2.abre();
        casa1.porta3.abre();
        casa1.porta3.fecha();

        System.out.println("Há na casa " + casa1.qtdePortasAbertas() + " portas abertas");

    }
}
