package Ex1;

import java.util.Scanner;

public class FuncionarioTeste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double vendas, salario;

        do {
            System.out.print("Digite o valor bruto das suas vendas desse mês: ");
            vendas = sc.nextDouble();

            if(vendas < 0)
                System.out.println("Valor inválido. Digite um valor válido");

        } while (vendas < 0);

        Funcionario func1 = new Funcionario();

        salario = func1.calculaSalario(vendas);

        System.out.printf("Seu salário desse mês é: R$ %.2f%n", salario);
    }
}
