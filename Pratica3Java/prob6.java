/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob6.java
* Data: 22/04/2023
*/
package Pratica3Java;

import java.util.Scanner;

public class prob6 {
    public static void main(String[] args) {
    /* Calcula quantos segundos o Gás leva para ultrapassar o volume de 1000 centimetros cubicos */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o volume inicial em centímetros cúbicos: ");
        double volumeInicial = scanner.nextDouble();

        double volumeAtual = volumeInicial;
        int segundos = 0;

        while (volumeAtual <= 1000) {
            volumeAtual *= 2;
            segundos++;
        }

        System.out.println("O tempo necessário para o volume ultrapassar 1000 centímetros cúbicos é: " + segundos + " segundos.");
        scanner.close();
    }
}

