package Ex6;

import java.util.Scanner;

public class AgendaTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        agenda.armazenaPessoa("Stanley", 18, 1.72f);
        agenda.armazenaPessoa("Hiago", 18, 1.74f);
        agenda.armazenaPessoa("Daniel", 18, 1.75f);
        agenda.armazenaPessoa("Julia", 20, 1.62f);
        agenda.armazenaPessoa("Isabela", 18, 1.65f);
        agenda.armazenaPessoa("Alana", 23, 1.59f);

        agenda.imprimeAgenda();

        System.out.println("#### Resultado da busca por posições na agenda ####");
        agenda.imprimePessoaDaAgenda(4);
        System.out.println("-Posição na agenda: " + agenda.buscaPessoa("Isabela"));
        System.out.println("-----------------------------------------");

        agenda.imprimePessoaDaAgenda(0);
        System.out.println("-Posição na agenda: " + agenda.buscaPessoa("Stanley"));
        System.out.println("-----------------------------------------");

        agenda.imprimePessoaDaAgenda(1);
        System.out.println("-Posição na agenda: " + agenda.buscaPessoa("Hiago"));
        System.out.println("-----------------------------------------");

        agenda.imprimePessoaDaAgenda(2);
        System.out.println("-Posição na agenda: " + agenda.buscaPessoa("Daniel"));
        System.out.println("-----------------------------------------");

        agenda.imprimePessoaDaAgenda(5);
        System.out.println("-Posição na agenda: " + agenda.buscaPessoa("Alana"));
        System.out.println("-----------------------------------------");

        agenda.imprimePessoaDaAgenda(3);
        System.out.println("-Posição na agenda: " + agenda.buscaPessoa("Julia"));


        agenda.removePessoa("Alana");
        agenda.removePessoa("Daniel");
        System.out.println("-----------------------------------------");
        System.out.println("* Alana e Daniel foram removidos da agenda");

        System.out.println("-----------------------------------------");
        System.out.println("#### Agenda atualizada ####");
        agenda.imprimeAgenda();



    }
}
