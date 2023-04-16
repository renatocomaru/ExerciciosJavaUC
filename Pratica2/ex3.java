/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: ex3.java
* Data: 16/04/2023
*/

package Pratica2;

import java.util.Scanner;

public class ex3 {

    /* Verificar se um numero é par ou impar e se é positivo ou negativo */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        String paridade = (numero % 2 == 0) ? "par" : "ímpar";
        String sinal = (numero >= 0) ? "positivo" : "negativo";

        System.out.println("O número " + numero + " é " + paridade + " e " + sinal + ".");

        scanner.close();
    }
}

