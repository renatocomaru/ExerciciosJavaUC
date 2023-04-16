/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: ex5.java
* Data: 16/04/2023
*/

package Pratica2;

import java.util.Scanner;

public class ex5 {

  /* Ferramenta de avaliação de nota de aluno */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0-100): ");
        int nota = scanner.nextInt();

        String conceito;
        if (nota >= 0 && nota <= 49) {
            conceito = "Insuficiente";
        } else if (nota >= 50 && nota <= 64) {
            conceito = "Regular";
        } else if (nota >= 65 && nota <= 84) {
            conceito = "Bom";
        } else if (nota >= 85 && nota <= 100) {
            conceito = "Ótimo";
        } else {
            conceito = "Nota inválida";
        }

        System.out.println("Conceito: " + conceito);
        scanner.close();
    }
}
