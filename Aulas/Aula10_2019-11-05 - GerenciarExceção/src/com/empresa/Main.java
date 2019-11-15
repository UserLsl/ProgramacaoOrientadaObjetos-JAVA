package com.empresa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            int a, b, soma;
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o valor de 'a': ");
            a = scan.nextInt();

            System.out.println("Digite o valor de 'b': ");
            b = scan.nextInt();

            System.out.println("Soma = " + (a + b));
            System.out.println("Divisão = " + (a / b));
        } catch (InputMismatchException ex1) {
            System.out.println("Você deve digitar um valor inteiro");
        } catch (ArithmeticException ex2) {
            System.out.println("Você deve digitar um valor maior que zero para 'b'");
        } catch (Exception ex3) {
            System.out.println("Erro: " + ex3.getMessage());
        } finally {
            System.out.println("C/ ou S/ Erro ele passa aqui!");
        }

    }
}
