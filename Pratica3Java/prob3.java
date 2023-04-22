/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob3.java
* Data: 22/04/2023
*/
package Pratica3Java;

public class prob3 {
  public static void main(String[] args) {
    /* Conta até 100 e mostra a soma de todos os números de 1 a 100 */
      int soma = 0;

      for (int i = 1; i <= 100; i++) {
          soma += i;
      }

      System.out.println("Soma dos números de 1 a 100: " + soma);
  }
}
