/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob7.java
* Data: 22/04/2023
*/
package Pratica3Java;

import java.util.Scanner;

public class prob7 {
    public static void main(String[] args) {
        /* Impoe carga máxima (kg) permitida em um elevador */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a carga máxima do elevador (kg): ");
        double cargaMaxima = scanner.nextDouble();
        System.out.print("Digite a quantidade máxima de pessoas: ");
        int maxPessoas = scanner.nextInt();

        int pessoasAtual = 0;
        double cargaAtual = 0;

        do {
            System.out.print("Digite o peso da pessoa " + (pessoasAtual + 1) + " (kg): ");
            double pesoPessoa = scanner.nextDouble();

            if (cargaAtual + pesoPessoa <= cargaMaxima && pessoasAtual < maxPessoas) {
                cargaAtual += pesoPessoa;
                pessoasAtual++;
            } else {
                break;
            }
        } while (cargaAtual < cargaMaxima && pessoasAtual < maxPessoas);

        System.out.println("O elevador atingiu sua carga máxima ou a quantidade máxima de pessoas.");
        scanner.close();
    }
}
