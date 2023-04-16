/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: ex7.java
* Data: 16/04/2023
*/

package Pratica2;

import java.util.Scanner;

public class ex7 {

  /* Verificar estação do ano de acordo com o mês */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 12: ");
        int mes = scanner.nextInt();

        String nomeMes;
        String estacao;

        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                estacao = "Verão";
                break;
            case 2:
                nomeMes = "Fevereiro";
                estacao = "Verão";
                break;
            case 3:
                nomeMes = "Março";
                estacao = "Verão";
                break;
            case 4:
                nomeMes = "Abril";
                estacao = "Outono";
                break;
            case 5:
                nomeMes = "Maio";
                estacao = "Outono";
                break;
            case 6:
                nomeMes = "Junho";
                estacao = "Inverno";
                break;
            case 7:
                nomeMes = "Julho";
                estacao = "Inverno";
                break;
            case 8:
                nomeMes = "Agosto";
                estacao = "Inverno";
                break;
            case 9:
                nomeMes = "Setembro";
                estacao = "Primavera";
                break;
            case 10:
                nomeMes = "Outubro";
                estacao = "Primavera";
                break;
            case 11:
                nomeMes = "Novembro";
                estacao = "Primavera";
                break;
            case 12:
                nomeMes = "Dezembro";
                estacao = "Verão";
                break;
            default:
                nomeMes = "Mês inválido";
                estacao = "";
                break;
        }

        if (!estacao.isEmpty()) {
            System.out.println("Mês: " + nomeMes + " - Estação: " + estacao);
        } else {
            System.out.println(nomeMes);
        }

        scanner.close();
    }
}
