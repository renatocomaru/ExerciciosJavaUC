/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob5.java
* Data: 22/04/2023
*/
package Pratica3Java;

import java.util.Scanner;

public class prob5 {
    public static void main(String[] args) {
    /* Solicita que o usuário digite um número e calcula o fatorial deste número */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        scanner.close();
    }
}
