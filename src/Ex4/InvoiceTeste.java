package Ex4;

import java.util.Scanner;

public class InvoiceTeste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int id, quantidadeCompraItem;
        String descricaoItem;
        double precoUnitarioItem;

        do {
            System.out.print("Digite o id do item: ");
            id = sc.nextInt();

            if (id < 0)
                System.out.println("Digite um id válido.");
        } while (id < 0);

        sc.nextLine();

        System.out.print("Digite a descrição do item: ");
        descricaoItem = sc.nextLine();

        System.out.print("Digite a quantidade de compra do item: ");
        quantidadeCompraItem = sc.nextInt();

        System.out.print("Digite o preço unitário do item: ");
        precoUnitarioItem = sc.nextDouble();

        if (precoUnitarioItem < 0)
            precoUnitarioItem = 0;

        Invoice produto1 = new Invoice(id, descricaoItem, quantidadeCompraItem, precoUnitarioItem);

        System.out.println(" ");

        System.out.println("#### Relatório de fatura #####");
        System.out.println("Id: " + produto1.getIdItem());
        System.out.println("Descrição: " + produto1.getDescricaoItem());
        System.out.println("Quantidade de compra: " + produto1.getQuantidadeCompraItem() + " unidades");
        System.out.println("Preço unitário: R$ " + produto1.getPrecoUnitarioItem());
        System.out.println("Valor total faturado: R$ " + + produto1.getInvoiceAmount());


    }
}
