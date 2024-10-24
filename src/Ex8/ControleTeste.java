package Ex8;

import java.util.Scanner;

public class ControleTeste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ControleRemoto c1 = new ControleRemoto(new Televisao(1, 0));

        int resp, canal, volume;
        boolean numInvalido;

        System.out.println("--------------------------");

        System.out.println("Você deseja aumentar o volume ou trocar de canal?");

        do {
            do {
                System.out.println("1 - Trocar de canal");
                System.out.println("2 - Aumentar o volume");
                System.out.println("3 - Diminuir o volume");
                System.out.println("4 - Desligar TV");
                resp = sc.nextInt();

                if (resp != 1 && resp != 2 && resp != 3 && resp != 4) {
                    System.out.println("Digite um nº válido.");

                }
            } while (resp != 1 && resp != 2 && resp != 3 && resp != 4);

            if (resp == 1) {
                System.out.println("Digite o canal que deseja assistir: ");
                canal = sc.nextInt();

                if (canal == c1.tv.getCanal())
                    System.out.println("Você já está nesse canal");

                c1.trocarCanal(canal);

                c1.exibirCanal();

            }
            else if (resp == 2) {
                System.out.println("Digite o volume que deseja aumentar: ");
                volume = sc.nextInt();

                c1.aumentaVolume(volume);

                c1.exibirVolume();

            }
            else if (resp == 3) {
                System.out.println("Digite o volume que deseja diminuir: ");
                volume = sc.nextInt();

                c1.diminuiVolume(volume);

                c1.exibirVolume();

            }

        } while (resp != 4);

        System.out.println("Desligando tv...");
    }
}