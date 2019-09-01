package net.maromo;

public class Main {

    public static void main(String[] args) {
        Conta.cpmf = 0.0038;
	    Conta conta1, conta2;
	    conta1 = new Conta();
	    conta2 = new Conta();
	    conta1.nome = "Ze";
	    conta2.nome = "Chico";
        System.out.println("Nome do Cliente = " + conta1.nome);

        System.out.println("Nome do Cliente = " + conta2.nome);
        System.out.println("Cpmf: " + Conta.cpmf);
    }
}
