/* Nome do Aluno: Renato Matos
* RA: 1292314966
* Nome do Programa: prob9.java
* Data: 22/04/2023
*/
package Pratica3Java;

public class prob9 {
  public static void main(String[] args) {
    /* Preenche Matriz 10x10 com 0's */
      int[][] matriz = new int[10][10];

      for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[i].length; j++) {
              matriz[i][j] = 0;
          }
      }

      for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[i].length; j++) {
              System.out.print(matriz[i][j] + " ");
          }
          System.out.println();
      }
  }
}

