package com.company;

public class PrincipalFuncionario {
    int T;
    public static int indice = 0;
    Funcionario[] func;

    public static void main(String[] args) {

        int opcao;

        PrincipalFuncionario pf = new PrincipalFuncionario();
        pf.T = 10;

        pf.func = new Funcionario[pf.T];
        pf.func[0] = new Funcionario();

        do{
            System.out.printf("MENU PRINCIPAL \n\n");
            System.out.printf("1. Cadastrar \n");
            System.out.printf("2. Efetuar Bonificação \n");
            System.out.printf("3. Consultar \n");
            System.out.printf("4. Sair \n\n");
            System.out.printf("Opção: ");
            opcao = Integer.parseInt(gt.leitor.nextLine());

            switch(opcao){
                case 1:
                    gt.cadastrarProduto();
                    break;
                case 2:
                    gt.entrarProduto();
                    System.out.printf("\nPressione ENTER para voltar ao Menu Principal...");
                    System.in.read();
                    break;
                case 3:
                    gt.sairProduto();
                    System.out.printf("\nPressione ENTER para voltar ao Menu Principal...");
                    System.in.read();
                    break;
                case 4:
                    break;
                default:
                    System.out.printf("\nVocê escolheu uma opção inválida! \n");
                    System.out.printf("--------------------------------- \n\n\n");
            }


        }while(opcao != 4);

    }

    public void execCadastro(){

    }

    public void execBonificacao(){

    }

    public void execConsulta(){

    }
}
