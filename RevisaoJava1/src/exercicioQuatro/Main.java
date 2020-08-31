package exercicioQuatro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("Informe o codigo do item: ");
        String codFatura = sca.nextLine();

        System.out.println("Informe a descricao do item: ");
        String descricao = sca.nextLine();

        System.out.println("Informe a quantidade: ");
        String quantidadeItem = sca.nextLine();

        System.out.println("Informe o preco: ");
        String precoItem = sca.nextLine();

        System.out.println();
        System.out.println("Codigo da fatura:  /" + codFatura + " Descricao:  /" + descricao + " Quantidade:  /" + quantidadeItem + " Preco do item: " + precoItem);
        System.out.println();

    }

}
