package com.empresa;

import com.empresa.model.Cilindro;
import com.empresa.model.Cone;
import com.empresa.model.Piramide;
import com.empresa.model.Prisma;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciarFiguras {

    private Scanner scan;
    private int option;

    public static void main(String[] args) {

        GerenciarFiguras gf = new GerenciarFiguras();
        gf.scan = new Scanner(System.in);
        int option = 0;

        try {

            do {

                System.out.println("CALCULAR VOLUME");
                System.out.println("1. Prisma");
                System.out.println("2. Cilindro");
                System.out.println("3. Cone");
                System.out.println("4. Piramide");
                System.out.println("5. Sair");
                System.out.printf("\nOpção:");

                option = gf.scan.nextInt();

                switch (option) {
                    case 1: gf.execCalcPrisma();
                    break;
                    case 2: gf.execCalcCilindro();
                    break;
                    case 3: gf.execCalcCone();
                    break;
                    case 4: gf.execCalcPiramide();
                    break;
                    case 5: System.exit(0);
                    break;
                    default: System.out.println("Você deve digitar um número de 1 a 5! Conforme opções.");
                }

            }while(option != 5);

        } catch (InputMismatchException ex1) {
            System.out.println("Você deve digitar um número de 1 a 5! Conforme opções.");
        } catch (ArithmeticException ex2) {
            System.out.println("Erro: " + ex2.getMessage());
        } catch (NullPointerException ex3) {
            System.out.println("Erro: " + ex3.getMessage());
        } catch (Exception ex4) {
            System.out.println("Erro: " + ex4.getMessage());
        } finally {
            System.out.println("C/ ou S/ Erro ele passa aqui!");
        }

    }

    public void execCalcPrisma() {
        Prisma prisma = new Prisma();

        System.out.printf("\nEntre com a altura do prisma (metros):");
        prisma.setAltura(scan.nextInt());
        System.out.printf("Entre com a comprimento do prisma (metros):");
        prisma.setComprimento(scan.nextInt());
        System.out.printf("Entre com a largura do prisma (metros):");
        prisma.setLargura(scan.nextInt());

        System.out.printf("\nVolume do prisma: " + prisma.getCalculoVolume() + "m³\n\n");
    }

    public void execCalcCilindro() {
        Cilindro cilindro = new Cilindro();

        System.out.printf("\nEntre com a altura do cilindro (metros):");
        cilindro.setAltura(scan.nextInt());
        System.out.printf("Entre com a raio do cilindro (metros):");
        cilindro.setRaio(scan.nextInt());

        System.out.printf("\nVolume do cilindro: " + cilindro.getCalculoVolume() + "m³\n\n");
    }

    public void execCalcCone() {
        Cone cone = new Cone();

        System.out.printf("\nEntre com a altura do cone (metros):");
        cone.setAltura(scan.nextInt());
        System.out.printf("Entre com a raio do cone (metros):");
        cone.setRaio(scan.nextInt());

        System.out.printf("\nVolume do cone: " + cone.getCalculoVolume() + "m³\n\n");
    }

    public void execCalcPiramide() {
        Piramide piramide = new Piramide();

        System.out.printf("\nEntre com a altura da piramide (metros):");
        piramide.setAltura(scan.nextInt());
        System.out.printf("Entre com a comprimento da piramide (metros):");
        piramide.setComprimento(scan.nextInt());
        System.out.printf("Entre com a largura da piramide (metros):");
        piramide.setLargura(scan.nextInt());

        System.out.printf("\nVolume do piramide: " + piramide.getCalculoVolume() + "m³\n\n");
    }

}
