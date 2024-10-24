package Ex3;

import java.util.Scanner;

public class AlunoTeste{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();

        double media, exameFinal;

        do {
            System.out.print("Digite o nº de matrícula do aluno: ");
            a1.setMatricula(sc.nextInt());

            if (a1.getMatricula() <= 0)
                System.out.println("Nº inválido! Digite um nº de matrícula válido.");

        } while(a1.getMatricula() <= 0);

        sc.nextLine();

        System.out.print("Digite o nome do aluno: ");
        a1.setNome(sc.nextLine());

        do {
            System.out.print("Digite a nota da primeira prova: ");
            a1.setNota1(sc.nextDouble());

            if (a1.getNota1() < 0 || a1.getNota1() > 10)
                System.out.println("Nota inválida! Digite uma nota válida (0 até 10)");

        } while(a1.getNota1() < 0 || a1.getNota1() > 10);

        do {
            System.out.print("Digite a nota da segunda prova: ");
            a1.setNota2(sc.nextDouble());

            if (a1.getNota2() < 0 || a1.getNota2() > 10)
                System.out.println("Nota inválida! Digite uma nota válida (0 até 10)");

        } while(a1.getNota2() < 0 || a1.getNota2() > 10);

        do {
            System.out.print("Digite a nota de trabalho: ");
            a1.setNotaTrabalho(sc.nextDouble());

            if (a1.getNotaTrabalho() < 0 || a1.getNotaTrabalho() > 10)
                System.out.println("Nota inválida! Digite uma nota válida (0 até 10)");

        } while(a1.getNotaTrabalho() < 0 || a1.getNotaTrabalho() > 10);

        System.out.println();

        media = a1.calculaMedia();
        exameFinal = a1.calculaNotaExameFinal();

        System.out.println("#### Relátorio ####");
        System.out.println("Nº de matrícula: " + a1.getMatricula());
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Média: " + media);

        if (exameFinal == 0) {
            System.out.println("Esse aluno não precisará realizar o exame final.");
        }
        else if (exameFinal > 10) {
            System.out.println("ESse aluno não pode ser aprovado, pois precisa de uma nota maior que 10.");
        }
        else {
            System.out.printf("Nota necessária do exame final para que sua média final seja no mínimo 5: %.2f%n", exameFinal);
        }
    }

}
