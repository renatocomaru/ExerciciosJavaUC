/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: ex1.java
* Data: 16/04/2023
*/

package Pratica2;

import java.util.Scanner;

public class ex1 {

    /* Comparar dois numeros e mostrar o maior */

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número (A): ");
        int A = scanner.nextInt();

        System.out.print("Digite o segundo número (B): ");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println("O maior número é: " + A);
         } else if (B > A) {
            System.out.println("O maior número é: " + B);
        } else {
            System.out.println("Os números são iguais.");
                
        scanner.close();
        }
    }
}
