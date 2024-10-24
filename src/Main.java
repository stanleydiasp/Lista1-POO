import java.util.Scanner;

import Ex1.FuncionarioTeste;
import Ex2.PrincipalQuadrado;
import Ex3.AlunoTeste;
import Ex4.InvoiceTeste;
import Ex5.PrincipalEstoque;
import Ex6.AgendaTeste;
import Ex7.ElevadorTeste;
import Ex8.ControleTeste;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;
        String continuar;

        System.out.println("Lista 1 POO - Luiz Mário");
        System.out.println("Aluno: Stanley Dias Paulo Filho");
        System.out.println("2º Período \n");

        do {
            System.out.println("Qual exercício deseja ver: ");
            System.out.println("1 - Ex1");
            System.out.println("2 - Ex2");
            System.out.println("3 - Ex3");
            System.out.println("4 - Ex4");
            System.out.println("5 - Ex5");
            System.out.println("6 - Ex6");
            System.out.println("7 - Ex7");
            System.out.println("8 - Ex8");
            opcao = sc.nextInt();
            System.out.println("\n");

            switch (opcao) {
                case 1:
                    FuncionarioTeste.main(new String[]{});
                    break;
                case 2:
                    PrincipalQuadrado.main(new String[]{});
                    break;
                case 3:
                    AlunoTeste.main(new String[]{});
                    break;
                case 4:
                    InvoiceTeste.main(new String[]{});
                    break;
                case 5:
                    PrincipalEstoque.main(new String[]{});
                    break;
                case 6:
                    AgendaTeste.main(new String[]{});
                    break;
                case 7:
                    ElevadorTeste.main(new String[]{});
                    break;
                case 8:
                    ControleTeste.main(new String[]{});
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            System.out.println("\nDeseja ver outro exercício? (s/n)");
            continuar = sc.next().toLowerCase();
            System.out.println("\n");

        } while (continuar.equals("s") || continuar.equals("sim"));

        System.out.println("Programa encerrado.");
    }
}
