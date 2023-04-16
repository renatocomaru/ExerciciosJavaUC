/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: ex6.java
* Data: 16/04/2023
*/

package Pratica2;

import java.util.Scanner;

public class ex6 {

  /* Calcula total o valor total da hospedagem levando em conta a taxa de serviço */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de diárias: ");
        int diarias = scanner.nextInt();
        double taxaServico;

        if (diarias > 15) {
            taxaServico = 5.50;
        } else if (diarias == 15) {
            taxaServico = 6.00;
        } else {
            taxaServico = 8.00;
        }

        double totalDiarias = diarias * 60.00;
        double totalTaxaServico = diarias * taxaServico;
        double totalHospedagem = totalDiarias + totalTaxaServico;

        System.out.printf("Total das diárias: R$ %.2f%n", totalDiarias);
        System.out.printf("Total da taxa de serviço: R$ %.2f%n", totalTaxaServico);
        System.out.printf("Total da hospedagem: R$ %.2f%n", totalHospedagem);

        scanner.close();
    }
}

