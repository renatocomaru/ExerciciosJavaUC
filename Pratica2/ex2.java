/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: ex2.java
* Data: 16/04/2023
*/

package Pratica2;

import java.util.Scanner;

public class ex2 {

  /* Ordenar Numeros em ordem Crescente */

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o valor de A:");
      int A = scanner.nextInt();

      System.out.println("Digite o valor de B:");
      int B = scanner.nextInt();

      System.out.println("Digite o valor de C:");
      int C = scanner.nextInt();

      int menor, medio, maior;

      if (A <= B && A <= C) {
          menor = A;
          if (B <= C) {
              medio = B;
              maior = C;
          } else {
              medio = C;
              maior = B;
          }
      } else if (B <= A && B <= C) {
          menor = B;
          if (A <= C) {
              medio = A;
              maior = C;
          } else {
              medio = C;
              maior = A;
          }
      } else {
          menor = C;
          if (A <= B) {
              medio = A;
              maior = B;
          } else {
              medio = B;
              maior = A;
          }
      }

      System.out.println("Os valores em ordem crescente são: " + menor + ", " + medio + ", " + maior);
        
      scanner.close();
    }
}
