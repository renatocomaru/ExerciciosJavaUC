/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: ex4.java
* Data: 16/04/2023
*/

package Pratica2;

import java.util.Scanner;

public class ex4 {

    /* Ler dados de um usuario e mostrar na tela informação completa ou condicionada */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.println("Digite sua cidade de nascimento:");
        String naturalidade = scanner.nextLine();

        System.out.println("Deseja visualizar dados completos? (S/N)");
        char opcao = scanner.next().charAt(0);

        if (opcao == 'S' || opcao == 's') {
            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome: " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao == 'N' || opcao == 'n') {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        } else {
            System.out.println("Digitação errada. Tente Novamente.");
        }

        scanner.close();
    }
}

