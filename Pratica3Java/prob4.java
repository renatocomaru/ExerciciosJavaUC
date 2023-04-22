/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob4.java
* Data: 22/04/2023
*/
package Pratica3Java;

import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {
      /* Solicita que o usuário digite um número até que este número seja menor que 0 */
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
        } while (numero >= 0);

        System.out.println("Você digitou o número: " + numero);
        scanner.close();
    }
}

