/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: ex9.java
* Data: 16/04/2023
*/

package Pratica2;

import java.util.Scanner;

public class ex9 {

  /* Calcula valor de desconto e acrescimo de uma compra */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da venda: ");
        double valorVenda = scanner.nextDouble();

        System.out.println("Escolha a condição de pagamento:");
        System.out.println("1 - Venda à vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com cartão de débito");
        System.out.println("6 - Venda com cartão de crédito");

        System.out.print("Digite o número da opção: ");
        int opcao = scanner.nextInt();
        double totalVenda;

        switch (opcao) {
            case 1:
                totalVenda = valorVenda * 0.9;
                break;
            case 2:
                totalVenda = valorVenda * 0.95;
                break;
            case 3:
                totalVenda = valorVenda;
                break;
            case 4:
                totalVenda = valorVenda * 1.05;
                break;
            case 5:
                totalVenda = valorVenda * 0.92;
                break;
            case 6:
                totalVenda = valorVenda * 0.93;
                break;
            default:
                System.out.println("Opção inválida.");
                totalVenda = 0;
        }

        if (totalVenda != 0) {
            System.out.printf("Total da venda: R$ %.2f%n", totalVenda);
        }

        scanner.close();
    }
}
