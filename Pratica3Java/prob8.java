/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob8.java
* Data: 22/04/2023
*/
package Pratica3Java;

public class prob8 {
  public static void main(String[] args) {
    /* Preenche um array de 50 com 0 */
      int[] vetor = new int[50];

      for (int i = 0; i < vetor.length; i++) {
          vetor[i] = 0;
      }

      for (int i = 0; i < vetor.length; i++) {
          System.out.println("Vetor[" + i + "] = " + vetor[i]);
      }
  }
}

